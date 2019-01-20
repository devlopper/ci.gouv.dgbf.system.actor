package ci.gouv.dgbf.system.actor.client.controller.impl.user.account.request;
import java.io.Serializable;

import org.cyk.utility.client.controller.component.grid.GridBuilder;
import org.cyk.utility.client.controller.component.grid.column.ColumnBuilder;
import org.cyk.utility.client.controller.component.view.ViewBuilder;
import org.cyk.utility.client.controller.component.window.AbstractWindowContainerManagedWindowBuilderEditDataImpl;
import org.cyk.utility.client.controller.component.window.WindowRenderTypeDialog;
import org.cyk.utility.client.controller.data.Data;
import org.cyk.utility.client.controller.data.Form;
import org.cyk.utility.client.controller.session.SessionUser;
import org.cyk.utility.client.controller.session.SessionUserGetter;
import org.cyk.utility.system.action.SystemAction;
import org.cyk.utility.system.action.SystemActionCreate;
import org.cyk.utility.system.action.SystemActionRead;
import org.cyk.utility.system.action.SystemActionRedirect;

import ci.gouv.dgbf.system.actor.client.controller.entities.person.Person;
import ci.gouv.dgbf.system.actor.client.controller.entities.person.PersonReadRow;
import ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request.UserAccountsRequest;
import ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request.UserAccountsRequestEditWindowBuilder;

public class UserAccountsRequestEditWindowBuilderImpl extends AbstractWindowContainerManagedWindowBuilderEditDataImpl implements UserAccountsRequestEditWindowBuilder, Serializable {
	private static final long serialVersionUID = 1L;
		
	@Override
	protected void __execute__(Form form,SystemAction systemAction,Data data,ViewBuilder viewBuilder) {
		SessionUser sessionUser = __inject__(SessionUserGetter.class).execute().getOutput();
		if(sessionUser == null) {
			__executeSessionUserIsNull__(form, systemAction, data, viewBuilder);
		}else {
			viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountsRequest.PROPERTY_SERVICES);
			viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountsRequest.PROPERTY_ROLES);
			viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountsRequest.PROPERTY_LETTER);
			
			GridBuilder gridBuilder = __inject__(GridBuilder.class).setRowClass(PersonReadRow.class).setRowDataClass(Person.class)
					.addColumns(__inject__(ColumnBuilder.class).addFieldNameStrings("data",Person.PROPERTY_FIRST_NAME)
							,__inject__(ColumnBuilder.class).addFieldNameStrings("data",Person.PROPERTY_LAST_NAMES)
							)				
					;
			
			/* Create new instance */
			SystemAction systemActionCreate = __inject__(SystemActionCreate.class);
			
			/* Create new instance using dialog window */
			gridBuilder.getCreateRowCommandable(Boolean.TRUE).setWindowRenderTypeClass(WindowRenderTypeDialog.class);
			gridBuilder.getCreateRowCommandable(Boolean.TRUE).getCommand(Boolean.TRUE).setWindowContainerManaged(getWindowContainerManaged());
			gridBuilder.getCreateRowCommandable(Boolean.TRUE).getCommand(Boolean.TRUE).getFunction(Boolean.TRUE).setAction(systemActionCreate);
			
			viewBuilder.addComponentBuilder(gridBuilder);	
		}
	}
	
	protected void __executeSessionUserIsNull__(Form form,SystemAction systemAction,Data data,ViewBuilder viewBuilder) {
		UserAccountsRequest userAccountsRequest = (UserAccountsRequest) data;
		if(systemAction instanceof SystemActionCreate || systemAction instanceof SystemActionRead) {
			if(userAccountsRequest.getPerson() == null) {
				if(__injectCollectionHelper__().isEmpty(userAccountsRequest.getPersons()))
					userAccountsRequest.getPersons(Boolean.TRUE).add(__inject__(Person.class));	
				userAccountsRequest.setPerson(userAccountsRequest.getPersons().getFirst());
			}
			
			if(systemAction instanceof SystemActionRead) {
				viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountsRequest.PROPERTY_CODE);
			}
			
			viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountsRequest.PROPERTY_PERSON,Person.PROPERTY_FIRST_NAME);
			viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountsRequest.PROPERTY_PERSON,Person.PROPERTY_LAST_NAMES);
			
			//viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountsRequest.PROPERTY_PERSON,Person.PROPERTY_SEX);
			//viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountsRequest.PROPERTY_PERSON,Person.PROPERTY_ADMINISTRATIVE_UNIT);
			//viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountsRequest.PROPERTY_PERSON,Person.PROPERTY_FUNCTION);
			viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountsRequest.PROPERTY_PERSON,Person.PROPERTY_ELECTRONIC_MAIL_ADDRESS);
			viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountsRequest.PROPERTY_PERSON,Person.PROPERTY_PHONE_NUMBER);
			//viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountsRequest.PROPERTY_PERSON,Person.PROPERTY_POSTAL_BOX_ADDRESS);
			
			viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountsRequest.PROPERTY_SERVICES);
			viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountsRequest.PROPERTY_ROLES);
			
			viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountsRequest.PROPERTY_LETTER);
		}else if(systemAction instanceof SystemActionRedirect) {
			viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountsRequest.PROPERTY_CODE);
		}
		
		
	}

}

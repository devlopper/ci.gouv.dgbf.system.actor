package ci.gouv.dgbf.system.actor.client.controller.impl.user.account.request;
import java.io.Serializable;

import org.cyk.utility.client.controller.component.grid.GridBuilder;
import org.cyk.utility.client.controller.component.grid.column.ColumnBuilder;
import org.cyk.utility.client.controller.component.view.ViewBuilder;
import org.cyk.utility.client.controller.component.window.AbstractWindowContainerManagedWindowBuilderEditDataImpl;
import org.cyk.utility.client.controller.component.window.WindowRenderTypeDialog;
import org.cyk.utility.client.controller.data.Data;
import org.cyk.utility.client.controller.data.Form;
import org.cyk.utility.system.action.SystemAction;
import org.cyk.utility.system.action.SystemActionCreate;

import ci.gouv.dgbf.system.actor.client.controller.entities.person.Person;
import ci.gouv.dgbf.system.actor.client.controller.entities.person.PersonReadRow;
import ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request.UserAccountsRequest;
import ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request.UserAccountsRequestEditWindowBuilder;

public class UserAccountsRequestEditWindowBuilderImpl extends AbstractWindowContainerManagedWindowBuilderEditDataImpl implements UserAccountsRequestEditWindowBuilder, Serializable {
	private static final long serialVersionUID = 1L;
		
	@Override
	protected void __execute__(Form form,SystemAction systemAction,Data data,ViewBuilder viewBuilder) {
		if(((UserAccountsRequest)data).getPerson() == null) {
			((UserAccountsRequest)data).setPerson(__inject__(Person.class));
			((UserAccountsRequest)data).getPerson().setHierarchy(__inject__(Person.class));
		}
		
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

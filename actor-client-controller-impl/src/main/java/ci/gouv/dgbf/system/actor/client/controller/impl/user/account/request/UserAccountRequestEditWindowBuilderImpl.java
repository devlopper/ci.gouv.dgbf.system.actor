package ci.gouv.dgbf.system.actor.client.controller.impl.user.account.request;
import java.io.Serializable;

import org.cyk.utility.client.controller.component.view.ViewBuilder;
import org.cyk.utility.client.controller.component.window.AbstractWindowContainerManagedWindowBuilderEditDataImpl;
import org.cyk.utility.client.controller.data.Data;
import org.cyk.utility.client.controller.data.Form;
import org.cyk.utility.system.action.SystemAction;

import ci.gouv.dgbf.system.actor.client.controller.entities.person.Person;
import ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request.UserAccountRequest;
import ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request.UserAccountRequestEditWindowBuilder;

public class UserAccountRequestEditWindowBuilderImpl extends AbstractWindowContainerManagedWindowBuilderEditDataImpl implements UserAccountRequestEditWindowBuilder, Serializable {
	private static final long serialVersionUID = 1L;
		
	@Override
	protected void __execute__(Form form,SystemAction systemAction,Data data,ViewBuilder viewBuilder) {
		((UserAccountRequest)data).setPerson(__inject__(Person.class));
		viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountRequest.PROPERTY_PERSON,Person.PROPERTY_FIRST_NAME);
		viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountRequest.PROPERTY_PERSON,Person.PROPERTY_LAST_NAMES);
		viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountRequest.PROPERTY_PERSON,Person.PROPERTY_SEX);
		viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountRequest.PROPERTY_PERSON,Person.PROPERTY_ELECTRONIC_MAIL_ADDRESS);
		viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountRequest.PROPERTY_PERSON,Person.PROPERTY_PHONE_NUMBER);
		viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountRequest.PROPERTY_PERSON,Person.PROPERTY_POSTAL_BOX_ADDRESS);
		viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountRequest.PROPERTY_PERSON,Person.PROPERTY_FUNCTION);
		viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountRequest.PROPERTY_SERVICES);
		viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountRequest.PROPERTY_ROLES);
		
	}

}

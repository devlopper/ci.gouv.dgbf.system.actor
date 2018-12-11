package ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request;

import java.io.Serializable;

import org.cyk.utility.client.controller.component.view.ViewBuilder;
import org.cyk.utility.client.controller.component.window.AbstractWindowContainerManagedWindowBuilderProcessDataImpl;
import org.cyk.utility.client.controller.data.Data;
import org.cyk.utility.client.controller.data.Form;
import org.cyk.utility.system.action.SystemAction;

import ci.gouv.dgbf.system.actor.client.controller.entities.account.Credentials;
import ci.gouv.dgbf.system.actor.client.controller.entities.person.Person;

public class UserAccountRequestProcessWindowBuilderImpl extends AbstractWindowContainerManagedWindowBuilderProcessDataImpl implements UserAccountRequestProcessWindowBuilder, Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	protected void __execute__(Form form, Data data,SystemAction systemAction, ViewBuilder viewBuilder) {
		viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountRequest.PROPERTY_PERSON, Person.PROPERTY_FIRST_NAME);
		viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountRequest.PROPERTY_PERSON, Person.PROPERTY_LAST_NAMES);
		viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountRequest.PROPERTY_PERSON, Person.PROPERTY_SEX);
		viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountRequest.PROPERTY_PERSON, Person.PROPERTY_ELECTRONIC_MAIL_ADDRESS);
		viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountRequest.PROPERTY_PERSON, Person.PROPERTY_PHONE_NUMBER);
		viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountRequest.PROPERTY_PERSON, Person.PROPERTY_POSTAL_BOX_ADDRESS);
		/*
		viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountRequest.PROPERTY_PERSON, Person.PROPERTY_EMPLOYER);
		viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountRequest.PROPERTY_PERSON, Person.PROPERTY_EMPLOYEE_IDENTIFIER);
		*/
		viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountRequest.PROPERTY_PERSON, Person.PROPERTY_FUNCTION);
		/*
		viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountRequest.PROPERTY_PERSON, Person.PROPERTY_HIERARCHY, Person.PROPERTY_FIRST_NAME);
		viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountRequest.PROPERTY_PERSON, Person.PROPERTY_HIERARCHY, Person.PROPERTY_LAST_NAMES);
		*/
		viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountRequest.PROPERTY_SOFTWARES);
		viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountRequest.PROPERTY_ROLES);
		viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountRequest.PROPERTY_COMMENTS);
		
		if("createuseraccount".equals(systemAction.getIdentifier())) {
			if(((UserAccountRequest)data).getCredentials() == null)
				((UserAccountRequest)data).setCredentials(__inject__(Credentials.class));
			viewBuilder.addComponentBuilderByObjectByFieldNames(data, UserAccountRequest.PROPERTY_CREDENTIALS,Credentials.PROPERTY_USERNAME);
			viewBuilder.addComponentBuilderByObjectByFieldNames(data, UserAccountRequest.PROPERTY_CREDENTIALS,Credentials.PROPERTY_PASSWORD);
		}
	}
	
}

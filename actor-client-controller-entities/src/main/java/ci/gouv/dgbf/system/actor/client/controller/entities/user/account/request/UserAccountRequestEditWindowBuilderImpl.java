package ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request;
import java.io.Serializable;

import org.cyk.utility.client.controller.component.view.ViewBuilder;
import org.cyk.utility.client.controller.component.window.AbstractWindowContainerManagedWindowBuilderEditDataImpl;
import org.cyk.utility.client.controller.data.Data;
import org.cyk.utility.client.controller.data.Form;

import ci.gouv.dgbf.system.actor.client.controller.entities.person.Person;

public class UserAccountRequestEditWindowBuilderImpl extends AbstractWindowContainerManagedWindowBuilderEditDataImpl implements UserAccountRequestEditWindowBuilder, Serializable {
	private static final long serialVersionUID = 1L;
		
	@Override
	protected void __execute__(Form form,Data data,ViewBuilder viewBuilder) {
		if(((UserAccountRequest)data).getPerson() == null) {
			((UserAccountRequest)data).setPerson(__inject__(Person.class));
			((UserAccountRequest)data).getPerson().setHierarchy(__inject__(Person.class));
		}
		
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, UserAccountRequest.PROPERTY_PERSON, Person.PROPERTY_FIRST_NAME);
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, UserAccountRequest.PROPERTY_PERSON, Person.PROPERTY_LAST_NAMES);
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, UserAccountRequest.PROPERTY_PERSON, Person.PROPERTY_SEX);
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, UserAccountRequest.PROPERTY_PERSON, Person.PROPERTY_ELECTRONIC_MAIL_ADDRESS);
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, UserAccountRequest.PROPERTY_PERSON, Person.PROPERTY_PHONE_NUMBER);
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, UserAccountRequest.PROPERTY_PERSON, Person.PROPERTY_POSTAL_BOX_ADDRESS);
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, UserAccountRequest.PROPERTY_PERSON, Person.PROPERTY_EMPLOYER);
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, UserAccountRequest.PROPERTY_PERSON, Person.PROPERTY_EMPLOYEE_IDENTIFIER);
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, UserAccountRequest.PROPERTY_PERSON, Person.PROPERTY_FUNCTION);
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, UserAccountRequest.PROPERTY_PERSON, Person.PROPERTY_HIERARCHY, Person.PROPERTY_FIRST_NAME);
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, UserAccountRequest.PROPERTY_PERSON, Person.PROPERTY_HIERARCHY, Person.PROPERTY_LAST_NAMES);
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, UserAccountRequest.PROPERTY_SOFTWARES);
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, UserAccountRequest.PROPERTY_ROLES);
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, UserAccountRequest.PROPERTY_COMMENTS);
	}

}

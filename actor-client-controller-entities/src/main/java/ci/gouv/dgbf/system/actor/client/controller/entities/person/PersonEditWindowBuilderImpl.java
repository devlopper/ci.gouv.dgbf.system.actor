package ci.gouv.dgbf.system.actor.client.controller.entities.person;
import java.io.Serializable;

import org.cyk.utility.client.controller.component.view.ViewBuilder;
import org.cyk.utility.client.controller.component.window.AbstractWindowContainerManagedWindowBuilderEditDataImpl;
import org.cyk.utility.client.controller.data.Data;
import org.cyk.utility.client.controller.data.Form;
import org.cyk.utility.system.action.SystemAction;

public class PersonEditWindowBuilderImpl extends AbstractWindowContainerManagedWindowBuilderEditDataImpl implements PersonEditWindowBuilder, Serializable {
	private static final long serialVersionUID = 1L;
		
	@Override
	protected void __execute__(Form form,SystemAction systemAction,Data data,ViewBuilder viewBuilder) {
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, Person.PROPERTY_FIRST_NAME);
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, Person.PROPERTY_LAST_NAMES);
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, Person.PROPERTY_EMPLOYER);
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, Person.PROPERTY_EMPLOYEE_IDENTIFIER);
		//viewBuilder.addComponentBuilderByObjectByFieldNames(data, Person.PROPERTY_FUNCTION);
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, Person.PROPERTY_HIERARCHY);
	}

}

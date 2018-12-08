package ci.gouv.dgbf.system.actor.client.controller.entities.employer;
import java.io.Serializable;

import org.cyk.utility.client.controller.component.view.ViewBuilder;
import org.cyk.utility.client.controller.component.window.AbstractWindowContainerManagedWindowBuilderEditDataImpl;
import org.cyk.utility.client.controller.data.Data;
import org.cyk.utility.client.controller.data.Form;

public class EmployerEditWindowBuilderImpl extends AbstractWindowContainerManagedWindowBuilderEditDataImpl implements EmployerEditWindowBuilder, Serializable {
	private static final long serialVersionUID = 1L;
		
	@Override
	protected void __execute__(Form form,Data data,ViewBuilder viewBuilder) {
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, Employer.PROPERTY_CODE);
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, Employer.PROPERTY_NAME);
	}

}

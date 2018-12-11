package ci.gouv.dgbf.system.actor.client.controller.entities.software;
import java.io.Serializable;

import org.cyk.utility.client.controller.component.view.ViewBuilder;
import org.cyk.utility.client.controller.component.window.AbstractWindowContainerManagedWindowBuilderEditDataImpl;
import org.cyk.utility.client.controller.data.Data;
import org.cyk.utility.client.controller.data.Form;
import org.cyk.utility.system.action.SystemAction;

public class SoftwareEditWindowBuilderImpl extends AbstractWindowContainerManagedWindowBuilderEditDataImpl implements SoftwareEditWindowBuilder, Serializable {
	private static final long serialVersionUID = 1L;
		
	@Override
	protected void __execute__(Form form,SystemAction systemAction,Data data,ViewBuilder viewBuilder) {
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, Software.PROPERTY_NAME);
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, Software.PROPERTY_DESCRIPTION);
	}

}

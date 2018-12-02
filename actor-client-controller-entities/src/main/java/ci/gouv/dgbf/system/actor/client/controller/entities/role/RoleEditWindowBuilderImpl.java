package ci.gouv.dgbf.system.actor.client.controller.entities.role;
import java.io.Serializable;

import org.cyk.utility.client.controller.component.view.ViewBuilder;
import org.cyk.utility.client.controller.component.window.AbstractWindowContainerManagedWindowBuilderEditDataImpl;
import org.cyk.utility.client.controller.data.Data;
import org.cyk.utility.client.controller.data.Form;

public class RoleEditWindowBuilderImpl extends AbstractWindowContainerManagedWindowBuilderEditDataImpl implements RoleEditWindowBuilder, Serializable {
	private static final long serialVersionUID = 1L;
		
	@Override
	protected void __execute__(Form form,Data data,ViewBuilder viewBuilder) {
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, Role.PROPERTY_NAME);
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, Role.PROPERTY_DESCRIPTION);
	}

}

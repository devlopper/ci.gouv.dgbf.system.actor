package ci.gouv.dgbf.system.actor.client.controller.entities.function;
import java.io.Serializable;

import org.cyk.utility.client.controller.component.view.ViewBuilder;
import org.cyk.utility.client.controller.component.window.AbstractWindowContainerManagedWindowBuilderEditDataImpl;
import org.cyk.utility.client.controller.data.Data;
import org.cyk.utility.client.controller.data.Form;
import org.cyk.utility.system.action.SystemAction;

public class FunctionCategoryEditWindowBuilderImpl extends AbstractWindowContainerManagedWindowBuilderEditDataImpl implements FunctionCategoryEditWindowBuilder, Serializable {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void __listenPostConstruct__() {
		super.__listenPostConstruct__();
		setFormClass(FunctionCategoryEditForm.class);
	}
	
	@Override
	protected void __execute__(Form form,SystemAction systemAction,Data data,ViewBuilder viewBuilder) {
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, FunctionCategory.PROPERTY_CODE);
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, FunctionCategory.PROPERTY_NAME);
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, FunctionCategory.PROPERTY_DESCRIPTION);
	}

}

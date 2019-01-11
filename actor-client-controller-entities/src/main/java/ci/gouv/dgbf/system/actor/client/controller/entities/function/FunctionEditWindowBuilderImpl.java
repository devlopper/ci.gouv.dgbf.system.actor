package ci.gouv.dgbf.system.actor.client.controller.entities.function;
import java.io.Serializable;

import org.cyk.utility.client.controller.component.view.ViewBuilder;
import org.cyk.utility.client.controller.component.window.AbstractWindowContainerManagedWindowBuilderEditDataImpl;
import org.cyk.utility.client.controller.data.Data;
import org.cyk.utility.client.controller.data.Form;
import org.cyk.utility.system.action.SystemAction;

public class FunctionEditWindowBuilderImpl extends AbstractWindowContainerManagedWindowBuilderEditDataImpl implements FunctionEditWindowBuilder, Serializable {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void __listenPostConstruct__() {
		super.__listenPostConstruct__();
		setFormClass(FunctionEditForm.class);
	}
	
	@Override
	protected void __execute__(Form form,SystemAction systemAction,Data data,ViewBuilder viewBuilder) {
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, Function.PROPERTY_CATEGORY);
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, Function.PROPERTY_CODE);
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, Function.PROPERTY_NAME);
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, Function.PROPERTY_IS_AUTOMATICALLY_CREATE_USER_ACCOUNT_REQUEST);
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, Function.PROPERTY_DESCRIPTION);
	}

}

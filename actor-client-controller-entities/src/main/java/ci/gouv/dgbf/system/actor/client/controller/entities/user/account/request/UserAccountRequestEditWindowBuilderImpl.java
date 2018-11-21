package ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request;
import java.io.Serializable;

import org.cyk.utility.client.controller.component.view.ViewBuilder;
import org.cyk.utility.client.controller.component.window.AbstractWindowContainerManagedWindowBuilderEditDataImpl;
import org.cyk.utility.client.controller.data.Data;
import org.cyk.utility.client.controller.data.Form;

public class UserAccountRequestEditWindowBuilderImpl extends AbstractWindowContainerManagedWindowBuilderEditDataImpl implements UserAccountRequestEditWindowBuilder, Serializable {
	private static final long serialVersionUID = 1L;
		
	@Override
	protected void __execute__(Form form,Data data,ViewBuilder viewBuilder) {
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, UserAccountRequest.PROPERTY_FIRST_NAME);
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, UserAccountRequest.PROPERTY_LAST_NAMES);
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, UserAccountRequest.PROPERTY_EMPLOYER);
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, UserAccountRequest.PROPERTY_EMPLOYEE_IDENTIFIER);
		//viewBuilder.addComponentBuilderByObjectByFieldNames(data, UserAccountRequest.PROPERTY_FUNCTION);
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, UserAccountRequest.PROPERTY_HIERARCHY_FIRST_NAME);
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, UserAccountRequest.PROPERTY_HIERARCHY_LAST_NAMES);
	}

}

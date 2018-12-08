package ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request;

import java.io.Serializable;

import org.cyk.utility.client.controller.component.view.ViewBuilder;
import org.cyk.utility.client.controller.component.window.AbstractWindowContainerManagedWindowBuilderProcessDataImpl;
import org.cyk.utility.client.controller.data.Data;
import org.cyk.utility.client.controller.data.Form;

public class UserAccountRequestProcessWindowBuilderImpl extends AbstractWindowContainerManagedWindowBuilderProcessDataImpl implements UserAccountRequestProcessWindowBuilder, Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	protected void __execute__(Form form, Data data, ViewBuilder viewBuilder) {
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, UserAccountRequest.PROPERTY_CODE);
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, UserAccountRequest.PROPERTY_DATE);
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, UserAccountRequest.PROPERTY_PERSON);
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, UserAccountRequest.PROPERTY_COMMENTS);
	}
	
}

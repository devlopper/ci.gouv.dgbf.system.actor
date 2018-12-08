package ci.gouv.dgbf.system.actor.client.controller.entities.user.account;
import java.io.Serializable;

import org.cyk.utility.client.controller.component.view.ViewBuilder;
import org.cyk.utility.client.controller.component.window.AbstractWindowContainerManagedWindowBuilderEditDataImpl;
import org.cyk.utility.client.controller.data.Data;
import org.cyk.utility.client.controller.data.Form;

public class UserAccountEditWindowBuilderImpl extends AbstractWindowContainerManagedWindowBuilderEditDataImpl implements UserAccountEditWindowBuilder, Serializable {
	private static final long serialVersionUID = 1L;
		
	@Override
	protected void __execute__(Form form,Data data,ViewBuilder viewBuilder) {
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, UserAccount.PROPERTY_USER);
		//viewBuilder.addComponentBuilderByObjectByFieldNames(data, UserAccount.PROPERTY_LAST_NAMES);
		
	}

}

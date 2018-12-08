package ci.gouv.dgbf.system.actor.client.controller.entities.account;
import java.io.Serializable;

import org.cyk.utility.client.controller.component.view.ViewBuilder;
import org.cyk.utility.client.controller.component.window.AbstractWindowContainerManagedWindowBuilderEditDataImpl;
import org.cyk.utility.client.controller.data.Data;
import org.cyk.utility.client.controller.data.Form;

public class AccountEditWindowBuilderImpl extends AbstractWindowContainerManagedWindowBuilderEditDataImpl implements AccountEditWindowBuilder, Serializable {
	private static final long serialVersionUID = 1L;
		
	@Override
	protected void __execute__(Form form,Data data,ViewBuilder viewBuilder) {
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, Account.PROPERTY_CREDENTIALS,Credentials.PROPERTY_USERNAME);
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, Account.PROPERTY_CREDENTIALS,Credentials.PROPERTY_PASSWORD);
	}

}

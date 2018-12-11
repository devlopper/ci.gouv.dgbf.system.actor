package ci.gouv.dgbf.system.actor.client.controller.entities.user.account;
import java.io.Serializable;

import org.cyk.utility.client.controller.component.view.ViewBuilder;
import org.cyk.utility.client.controller.component.window.AbstractWindowContainerManagedWindowBuilderEditDataImpl;
import org.cyk.utility.client.controller.data.Data;
import org.cyk.utility.client.controller.data.Form;
import org.cyk.utility.system.action.SystemAction;

import ci.gouv.dgbf.system.actor.client.controller.entities.account.Account;
import ci.gouv.dgbf.system.actor.client.controller.entities.account.Credentials;

public class UserAccountEditWindowBuilderImpl extends AbstractWindowContainerManagedWindowBuilderEditDataImpl implements UserAccountEditWindowBuilder, Serializable {
	private static final long serialVersionUID = 1L;
		
	@Override
	protected void __execute__(Form form,SystemAction systemAction,Data data,ViewBuilder viewBuilder) {
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, UserAccount.PROPERTY_ACCOUNT,Account.PROPERTY_CREDENTIALS,Credentials.PROPERTY_USERNAME);
		viewBuilder.addComponentBuilderByObjectByFieldNames(data, UserAccount.PROPERTY_ACCOUNT,Account.PROPERTY_CREDENTIALS,Credentials.PROPERTY_PASSWORD);		
	}

}

package ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request;

import java.io.Serializable;

import org.cyk.utility.client.controller.component.input.choice.InputChoiceBuilder;
import org.cyk.utility.client.controller.component.view.ViewBuilder;
import org.cyk.utility.client.controller.component.window.AbstractWindowContainerManagedWindowBuilderProcessDataImpl;
import org.cyk.utility.client.controller.data.Data;
import org.cyk.utility.client.controller.data.Form;
import org.cyk.utility.system.action.SystemAction;

import ci.gouv.dgbf.system.actor.client.controller.entities.account.Credentials;

public class UserAccountRequestProcessWindowBuilderImpl extends AbstractWindowContainerManagedWindowBuilderProcessDataImpl implements UserAccountRequestProcessWindowBuilder, Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	protected void __execute__(Form form, Data data,SystemAction systemAction, ViewBuilder viewBuilder) {
		viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountRequest.PROPERTY_SERVICES);
		viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountRequest.PROPERTY_ROLES);
		viewBuilder.addInputBuilderByObjectByFieldNames(data,systemAction, UserAccountRequest.PROPERTY_COMMENTS);
		
		if("createuseraccount".equals(systemAction.getIdentifier())) {
			if(((UserAccountRequest)data).getCredentials() == null)
				((UserAccountRequest)data).setCredentials(__inject__(Credentials.class));
			viewBuilder.addComponentBuilderByObjectByFieldNames(data, UserAccountRequest.PROPERTY_CREDENTIALS,Credentials.PROPERTY_USERNAME);
			viewBuilder.addComponentBuilderByObjectByFieldNames(data, UserAccountRequest.PROPERTY_CREDENTIALS,Credentials.PROPERTY_PASSWORD);
		}else if("process".equals(systemAction.getIdentifier())) {
			InputChoiceBuilder<?, ?> inputChoiceBuilder = (InputChoiceBuilder<?, ?>) viewBuilder.addComponentBuilderByObjectByFieldNames(data, UserAccountRequest.PROPERTY_ACCEPTED);
			inputChoiceBuilder.addChoices("Oui","Non");
		}
		
	}
	
}

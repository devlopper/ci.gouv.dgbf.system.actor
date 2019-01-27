package ci.gouv.dgbf.system.actor.client.controller.impl;

import java.io.Serializable;

import org.cyk.utility.client.controller.navigation.AbstractNavigationIdentifierStringBuilderExtensionFunctionRunnableImpl;
import org.cyk.utility.client.controller.session.SessionUser;
import org.cyk.utility.client.controller.session.SessionUserGetter;
import org.cyk.utility.system.action.SystemActionRead;

import ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request.UserAccountRequest;

public class NavigationIdentifierStringBuilderExtensionFunctionRunnableImpl extends AbstractNavigationIdentifierStringBuilderExtensionFunctionRunnableImpl implements Serializable {
	private static final long serialVersionUID = 1L;

	public NavigationIdentifierStringBuilderExtensionFunctionRunnableImpl() {
		setRunnable(new Runnable() { @Override public void run() {
			SessionUser sessionUser = __inject__(SessionUserGetter.class).execute().getOutput();
			if(getFunction().getNavigationIdentifier().getSystemAction().getEntityClass().equals(UserAccountRequest.class) 
					&& getFunction().getNavigationIdentifier().getSystemAction() instanceof SystemActionRead && sessionUser==null) {
				setOutput("userAccountRequestReadByNotConnectedUserView");
			}else
				setOutput(getFunction().getResult());
		}});
	}
	
}

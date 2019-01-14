package ci.gouv.dgbf.system.actor.client.controller.api.user.accounts.request;

import java.io.Serializable;

import javax.inject.Singleton;

import org.cyk.utility.client.controller.AbstractControllerEntityImpl;

import ci.gouv.dgbf.system.actor.client.controller.entities.user.accounts.request.UserAccountsRequest;

@Singleton
public class UserAccountsRequestControllerImpl extends AbstractControllerEntityImpl<UserAccountsRequest> implements UserAccountsRequestController,Serializable {
	private static final long serialVersionUID = 1L;
	
}

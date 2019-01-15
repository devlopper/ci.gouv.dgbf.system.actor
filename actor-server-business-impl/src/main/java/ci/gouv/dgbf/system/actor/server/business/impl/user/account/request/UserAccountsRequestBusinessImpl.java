package ci.gouv.dgbf.system.actor.server.business.impl.user.account.request;

import javax.inject.Singleton;

import org.cyk.utility.server.business.AbstractBusinessEntityImpl;

import ci.gouv.dgbf.system.actor.server.business.api.user.account.request.UserAccountsRequestBusiness;
import ci.gouv.dgbf.system.actor.server.persistence.api.user.account.request.UserAccountsRequestPersistence;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountsRequest;

@Singleton
public class UserAccountsRequestBusinessImpl extends AbstractBusinessEntityImpl<UserAccountsRequest, UserAccountsRequestPersistence> implements UserAccountsRequestBusiness {
	private static final long serialVersionUID = 1L;

}

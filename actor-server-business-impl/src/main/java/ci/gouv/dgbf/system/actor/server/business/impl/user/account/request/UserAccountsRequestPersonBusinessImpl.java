package ci.gouv.dgbf.system.actor.server.business.impl.user.account.request;

import javax.inject.Singleton;

import org.cyk.utility.server.business.AbstractBusinessEntityImpl;

import ci.gouv.dgbf.system.actor.server.business.api.user.account.request.UserAccountsRequestPersonBusiness;
import ci.gouv.dgbf.system.actor.server.persistence.api.user.account.request.UserAccountsRequestPersonPersistence;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountsRequestPerson;

@Singleton
public class UserAccountsRequestPersonBusinessImpl extends AbstractBusinessEntityImpl<UserAccountsRequestPerson, UserAccountsRequestPersonPersistence> implements UserAccountsRequestPersonBusiness {
	private static final long serialVersionUID = 1L;

}

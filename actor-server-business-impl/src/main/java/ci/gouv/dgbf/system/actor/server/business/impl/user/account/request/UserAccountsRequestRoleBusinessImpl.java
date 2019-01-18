package ci.gouv.dgbf.system.actor.server.business.impl.user.account.request;

import javax.inject.Singleton;

import org.cyk.utility.__kernel__.properties.Properties;
import org.cyk.utility.server.business.AbstractBusinessEntityImpl;
import org.cyk.utility.server.business.BusinessServiceProvider;

import ci.gouv.dgbf.system.actor.server.business.api.user.account.request.UserAccountsRequestRoleBusiness;
import ci.gouv.dgbf.system.actor.server.persistence.api.user.account.request.UserAccountsRequestRolePersistence;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountsRequestRole;

@Singleton
public class UserAccountsRequestRoleBusinessImpl extends AbstractBusinessEntityImpl<UserAccountsRequestRole, UserAccountsRequestRolePersistence> implements UserAccountsRequestRoleBusiness {
	private static final long serialVersionUID = 1L;

	@Override
	protected Class<UserAccountsRequestRole> __getEntityClass__() {
		return UserAccountsRequestRole.class;
	}

	@Override
	public BusinessServiceProvider<UserAccountsRequestRole> create(UserAccountsRequestRole userAccountsRequestRole,Properties properties) {
		if(__injectStringHelper__().isBlank(userAccountsRequestRole.getCode())) {
			userAccountsRequestRole.setCode(userAccountsRequestRole.getUserAccountsRequest().getCode()+"_"+userAccountsRequestRole.getRole().getCode());
		}
		return super.create(userAccountsRequestRole, properties);
	}
}

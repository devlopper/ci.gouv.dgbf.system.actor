package ci.gouv.dgbf.system.actor.server.business.impl.user.account.request;

import javax.inject.Singleton;

import org.cyk.utility.__kernel__.properties.Properties;
import org.cyk.utility.random.RandomHelper;
import org.cyk.utility.server.business.AbstractBusinessEntityImpl;
import org.cyk.utility.server.business.BusinessServiceProvider;

import ci.gouv.dgbf.system.actor.server.business.api.user.account.request.UserAccountsRequestBusiness;
import ci.gouv.dgbf.system.actor.server.persistence.api.user.account.request.UserAccountsRequestPersistence;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountsRequest;

@Singleton
public class UserAccountsRequestBusinessImpl extends AbstractBusinessEntityImpl<UserAccountsRequest, UserAccountsRequestPersistence> implements UserAccountsRequestBusiness {
	private static final long serialVersionUID = 1L;

	@Override
	protected Class<UserAccountsRequest> __getEntityClass__() {
		return UserAccountsRequest.class;
	}
	
	@Override
	public BusinessServiceProvider<UserAccountsRequest> create(UserAccountsRequest userAccountsRequest, Properties properties) {
		String code = __inject__(RandomHelper.class).getAlphanumeric(3);
		code = "uar01";
		userAccountsRequest.setCode(code);
		return super.create(userAccountsRequest, properties);
	}
	
}

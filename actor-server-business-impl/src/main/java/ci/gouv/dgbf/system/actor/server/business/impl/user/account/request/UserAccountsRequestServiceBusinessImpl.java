package ci.gouv.dgbf.system.actor.server.business.impl.user.account.request;

import javax.inject.Singleton;

import org.cyk.utility.__kernel__.properties.Properties;
import org.cyk.utility.server.business.AbstractBusinessEntityImpl;
import org.cyk.utility.server.business.BusinessServiceProvider;

import ci.gouv.dgbf.system.actor.server.business.api.user.account.request.UserAccountsRequestServiceBusiness;
import ci.gouv.dgbf.system.actor.server.persistence.api.user.account.request.UserAccountsRequestServicePersistence;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountsRequestService;

@Singleton
public class UserAccountsRequestServiceBusinessImpl extends AbstractBusinessEntityImpl<UserAccountsRequestService, UserAccountsRequestServicePersistence> implements UserAccountsRequestServiceBusiness {
	private static final long serialVersionUID = 1L;

	@Override
	protected Class<UserAccountsRequestService> __getEntityClass__() {
		return UserAccountsRequestService.class;
	}
	
	@Override
	public BusinessServiceProvider<UserAccountsRequestService> create(UserAccountsRequestService userAccountsRequestService,Properties properties) {
		if(__injectStringHelper__().isBlank(userAccountsRequestService.getCode()))
			userAccountsRequestService.setCode(userAccountsRequestService.getUserAccountsRequest().getCode()+"_"+userAccountsRequestService.getService());
		return super.create(userAccountsRequestService, properties);
	}
	
}

package ci.gouv.dgbf.system.actor.server.business.impl.user.account.request;

import java.io.Serializable;

import javax.inject.Singleton;

import org.cyk.utility.__kernel__.properties.Properties;
import org.cyk.utility.server.business.AbstractBusinessEntityImpl;
import org.cyk.utility.server.business.BusinessServiceProvider;

import ci.gouv.dgbf.system.actor.server.business.api.user.account.request.UserAccountRequestServiceBusiness;
import ci.gouv.dgbf.system.actor.server.persistence.api.user.account.request.UserAccountRequestServicePersistence;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountRequestService;

@Singleton
public class UserAccountRequestServiceBusinessImpl extends AbstractBusinessEntityImpl<UserAccountRequestService, UserAccountRequestServicePersistence> implements UserAccountRequestServiceBusiness,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	protected Class<UserAccountRequestService> __getEntityClass__() {
		return UserAccountRequestService.class;
	}
	
	@Override
	public BusinessServiceProvider<UserAccountRequestService> create(UserAccountRequestService userAccountRequestService,Properties properties) {
		if(__injectStringHelper__().isBlank(userAccountRequestService.getCode()))
			userAccountRequestService.setCode(userAccountRequestService.getUserAccountRequest().getCode()+"_"+userAccountRequestService.getService());
		return super.create(userAccountRequestService, properties);
	}
	
}

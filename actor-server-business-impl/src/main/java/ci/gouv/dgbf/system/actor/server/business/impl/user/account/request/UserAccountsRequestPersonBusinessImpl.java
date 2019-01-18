package ci.gouv.dgbf.system.actor.server.business.impl.user.account.request;

import javax.inject.Singleton;

import org.cyk.utility.__kernel__.properties.Properties;
import org.cyk.utility.random.RandomHelper;
import org.cyk.utility.server.business.AbstractBusinessEntityImpl;
import org.cyk.utility.server.business.BusinessServiceProvider;

import ci.gouv.dgbf.system.actor.server.business.api.person.PersonBusiness;
import ci.gouv.dgbf.system.actor.server.business.api.user.account.request.UserAccountsRequestPersonBusiness;
import ci.gouv.dgbf.system.actor.server.persistence.api.user.account.request.UserAccountsRequestPersonPersistence;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountsRequestPerson;

@Singleton
public class UserAccountsRequestPersonBusinessImpl extends AbstractBusinessEntityImpl<UserAccountsRequestPerson, UserAccountsRequestPersonPersistence> implements UserAccountsRequestPersonBusiness {
	private static final long serialVersionUID = 1L;

	@Override
	protected Class<UserAccountsRequestPerson> __getEntityClass__() {
		return UserAccountsRequestPerson.class;
	}
	
	@Override
	public BusinessServiceProvider<UserAccountsRequestPerson> create(UserAccountsRequestPerson userAccountsRequestPerson,Properties properties) {
		if(__injectStringHelper__().isBlank(userAccountsRequestPerson.getCode()))
			userAccountsRequestPerson.setCode(userAccountsRequestPerson.getUserAccountsRequest().getCode()+"_"+userAccountsRequestPerson.getPerson().getCode());
		if(userAccountsRequestPerson.getPerson().getIdentifier() == null) {
			if(__injectStringHelper__().isBlank(userAccountsRequestPerson.getPerson().getCode()))
				userAccountsRequestPerson.getPerson().setCode(__inject__(RandomHelper.class).getAlphanumeric(5));
			__inject__(PersonBusiness.class).create(userAccountsRequestPerson.getPerson());
		}
		return super.create(userAccountsRequestPerson, properties);
	}
	
}

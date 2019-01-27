package ci.gouv.dgbf.system.actor.server.business.impl.user.account.request;

import java.io.Serializable;

import javax.inject.Singleton;

import org.cyk.utility.__kernel__.properties.Properties;
import org.cyk.utility.random.RandomHelper;
import org.cyk.utility.server.business.AbstractBusinessEntityImpl;
import org.cyk.utility.server.business.BusinessServiceProvider;

import ci.gouv.dgbf.system.actor.server.business.api.person.PersonBusiness;
import ci.gouv.dgbf.system.actor.server.business.api.user.account.request.UserAccountRequestPersonBusiness;
import ci.gouv.dgbf.system.actor.server.persistence.api.user.account.request.UserAccountRequestPersonPersistence;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountRequestPerson;

@Singleton
public class UserAccountRequestPersonBusinessImpl extends AbstractBusinessEntityImpl<UserAccountRequestPerson, UserAccountRequestPersonPersistence> implements UserAccountRequestPersonBusiness,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	protected Class<UserAccountRequestPerson> __getEntityClass__() {
		return UserAccountRequestPerson.class;
	}
	
	@Override
	public BusinessServiceProvider<UserAccountRequestPerson> create(UserAccountRequestPerson userAccountRequestPerson,Properties properties) {
		if(__injectStringHelper__().isBlank(userAccountRequestPerson.getCode()))
			userAccountRequestPerson.setCode(userAccountRequestPerson.getUserAccountRequest().getCode()+"_"+userAccountRequestPerson.getPerson().getCode());
		if(userAccountRequestPerson.getPerson().getIdentifier() == null) {
			if(__injectStringHelper__().isBlank(userAccountRequestPerson.getPerson().getCode()))
				userAccountRequestPerson.getPerson().setCode(__inject__(RandomHelper.class).getAlphanumeric(5));
			__inject__(PersonBusiness.class).create(userAccountRequestPerson.getPerson());
		}
		return super.create(userAccountRequestPerson, properties);
	}
	
}

package ci.gouv.dgbf.system.actor.server.business.impl.user.account.request;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.inject.Singleton;

import org.cyk.utility.__kernel__.properties.Properties;
import org.cyk.utility.random.RandomHelper;
import org.cyk.utility.server.business.AbstractBusinessEntityImpl;
import org.cyk.utility.server.business.BusinessServiceProvider;
import org.cyk.utility.string.StringHelper;
import org.cyk.utility.string.Strings;

import ci.gouv.dgbf.system.actor.server.business.api.user.account.request.UserAccountsRequestBusiness;
import ci.gouv.dgbf.system.actor.server.business.api.user.account.request.UserAccountsRequestPersonBusiness;
import ci.gouv.dgbf.system.actor.server.business.api.user.account.request.UserAccountsRequestRoleBusiness;
import ci.gouv.dgbf.system.actor.server.business.api.user.account.request.UserAccountsRequestServiceBusiness;
import ci.gouv.dgbf.system.actor.server.persistence.api.user.account.request.UserAccountsRequestPersistence;
import ci.gouv.dgbf.system.actor.server.persistence.api.user.account.request.UserAccountsRequestPersonPersistence;
import ci.gouv.dgbf.system.actor.server.persistence.api.user.account.request.UserAccountsRequestRolePersistence;
import ci.gouv.dgbf.system.actor.server.persistence.api.user.account.request.UserAccountsRequestServicePersistence;
import ci.gouv.dgbf.system.actor.server.persistence.entities.person.Person;
import ci.gouv.dgbf.system.actor.server.persistence.entities.person.Persons;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.Role;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.Roles;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountsRequest;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountsRequestPerson;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountsRequestRole;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountsRequestService;

@Singleton
public class UserAccountsRequestBusinessImpl extends AbstractBusinessEntityImpl<UserAccountsRequest, UserAccountsRequestPersistence> implements UserAccountsRequestBusiness {
	private static final long serialVersionUID = 1L;

	@Override
	protected Class<UserAccountsRequest> __getEntityClass__() {
		return UserAccountsRequest.class;
	}
	
	@Override
	public BusinessServiceProvider<UserAccountsRequest> create(UserAccountsRequest userAccountsRequest, Properties properties) {
		if(__injectStringHelper__().isBlank(userAccountsRequest.getCode()))
			userAccountsRequest.setCode(__inject__(RandomHelper.class).getAlphanumeric(3));
		userAccountsRequest.setCreationDate(new Date());
		super.create(userAccountsRequest, properties);
		
		Roles roles = userAccountsRequest.getRoles();
		if(__injectCollectionHelper__().isNotEmpty(roles)) {
			Collection<UserAccountsRequestRole> userAccountsRequestRoles = new ArrayList<>();
			for(Role index : roles.get())
				if(index!=null)
					userAccountsRequestRoles.add(new UserAccountsRequestRole().setUserAccountsRequest(userAccountsRequest).setRole(index));
			__inject__(UserAccountsRequestRoleBusiness.class).createMany(userAccountsRequestRoles);
		}
		
		Strings services = userAccountsRequest.getServices();
		if(__injectCollectionHelper__().isNotEmpty(services)) {
			Collection<UserAccountsRequestService> userAccountsRequestServices = new ArrayList<>();
			for(String index : services.get())
				if(__inject__(StringHelper.class).isNotBlank(index))
					userAccountsRequestServices.add(new UserAccountsRequestService().setUserAccountsRequest(userAccountsRequest).setService(index));
			__inject__(UserAccountsRequestServiceBusiness.class).createMany(userAccountsRequestServices);
		}
		
		Persons persons = userAccountsRequest.getPersons();
		if(__injectCollectionHelper__().isNotEmpty(persons)) {
			Collection<UserAccountsRequestPerson> userAccountsRequestPersons = new ArrayList<>();
			for(Person index : persons.get())
				if(index!=null)
					userAccountsRequestPersons.add(new UserAccountsRequestPerson().setUserAccountsRequest(userAccountsRequest).setPerson(index));
			__inject__(UserAccountsRequestPersonBusiness.class).createMany(userAccountsRequestPersons);
		}
		return this;
	}
	
	@Override
	public BusinessServiceProvider<UserAccountsRequest> delete(UserAccountsRequest userAccountsRequest, Properties properties) {
		__inject__(UserAccountsRequestRoleBusiness.class).deleteMany(
				__inject__(UserAccountsRequestRolePersistence.class).readByUserAccountsRequest(userAccountsRequest));
		
		__inject__(UserAccountsRequestServiceBusiness.class).deleteMany(
				__inject__(UserAccountsRequestServicePersistence.class).readByUserAccountsRequest(userAccountsRequest));
		
		__inject__(UserAccountsRequestPersonBusiness.class).deleteMany(
				__inject__(UserAccountsRequestPersonPersistence.class).readByUserAccountsRequest(userAccountsRequest));
		return super.delete(userAccountsRequest, properties);
	}
}

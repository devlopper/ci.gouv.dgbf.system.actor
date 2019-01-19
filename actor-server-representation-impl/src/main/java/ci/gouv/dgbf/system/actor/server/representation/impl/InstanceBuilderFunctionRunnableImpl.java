package ci.gouv.dgbf.system.actor.server.representation.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import org.cyk.utility.collection.CollectionHelper;
import org.cyk.utility.instance.AbstractInstanceBuilderFunctionRunnableImpl;
import org.cyk.utility.instance.InstanceHelper;
import org.cyk.utility.string.StringHelper;

import ci.gouv.dgbf.system.actor.server.business.api.person.PersonBusiness;
import ci.gouv.dgbf.system.actor.server.business.api.user.account.RoleBusiness;
import ci.gouv.dgbf.system.actor.server.persistence.api.user.account.request.UserAccountsRequestPersonPersistence;
import ci.gouv.dgbf.system.actor.server.persistence.api.user.account.request.UserAccountsRequestRolePersistence;
import ci.gouv.dgbf.system.actor.server.persistence.api.user.account.request.UserAccountsRequestServicePersistence;
import ci.gouv.dgbf.system.actor.server.persistence.entities.person.Person;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountsRequest;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountsRequestPerson;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountsRequestRole;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountsRequestService;
import ci.gouv.dgbf.system.actor.server.representation.entities.person.PersonDto;
import ci.gouv.dgbf.system.actor.server.representation.entities.user.account.RoleDto;
import ci.gouv.dgbf.system.actor.server.representation.entities.user.account.request.UserAccountsRequestDto;

public class InstanceBuilderFunctionRunnableImpl extends AbstractInstanceBuilderFunctionRunnableImpl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	protected void __copy__(Object source, Object destination) {
		if(source instanceof UserAccountsRequestDto && destination instanceof UserAccountsRequest) {
			UserAccountsRequestDto representation = (UserAccountsRequestDto) source;
			UserAccountsRequest persistence = (UserAccountsRequest) destination;
			persistence.setCode(representation.getCode());
			persistence.setLetter(representation.getLetter());
			
			if(__inject__(CollectionHelper.class).isNotEmpty(representation.getRoles())) {
				persistence.setRoles(null);
				for(RoleDto index : representation.getRoles()) {
					if(__inject__(StringHelper.class).isNotBlank(index.getCode()))
						persistence.getRoles(Boolean.TRUE).add(__inject__(RoleBusiness.class).findOneByBusinessIdentifier(index.getCode()));
				}
			}
			
			if(__inject__(CollectionHelper.class).isNotEmpty(representation.getPersons())) {
				persistence.setPersons(null);
				for(PersonDto index : representation.getPersons()) {
					Person person = null;
					if(__inject__(StringHelper.class).isBlank(index.getCode()))
						person = __inject__(InstanceHelper.class).buildOne(Person.class, index);
					else
						person = __inject__(PersonBusiness.class).findOneByBusinessIdentifier(index.getCode());
					persistence.getPersons(Boolean.TRUE).add(person);
				}
			}
			
			if(__inject__(CollectionHelper.class).isNotEmpty(representation.getServices())) {
				persistence.setServices(null);
				for(String index : representation.getServices()) {
					persistence.getServices(Boolean.TRUE).add(index);	
				}
			}
		}else if(source instanceof UserAccountsRequest && destination instanceof UserAccountsRequestDto) {
			UserAccountsRequest persistence = (UserAccountsRequest) source;
			UserAccountsRequestDto representation = (UserAccountsRequestDto) destination;
			representation.setIdentifier(persistence.getIdentifier().toString());
			representation.setCode(persistence.getCode());
			representation.setLetter(persistence.getLetter());
			
			Collection<UserAccountsRequestRole> userAccountsRequestRoles = __inject__(UserAccountsRequestRolePersistence.class).readByUserAccountsRequest(persistence);
			if(__inject__(CollectionHelper.class).isNotEmpty(userAccountsRequestRoles)) {
				representation.setRoles(new ArrayList<>());
				for(UserAccountsRequestRole index : userAccountsRequestRoles) {
					representation.getRoles().add(__inject__(InstanceHelper.class).buildOne(RoleDto.class, index.getRole()));
				}
			}
			
			Collection<UserAccountsRequestPerson> userAccountsRequestPersons = __inject__(UserAccountsRequestPersonPersistence.class).readByUserAccountsRequest(persistence);
			if(__inject__(CollectionHelper.class).isNotEmpty(userAccountsRequestPersons)) {
				representation.setPersons(new ArrayList<>());
				for(UserAccountsRequestPerson index : userAccountsRequestPersons) {
					representation.getPersons().add(__inject__(InstanceHelper.class).buildOne(PersonDto.class, index.getPerson()));
				}
			}
			
			Collection<UserAccountsRequestService> userAccountsRequestServices = __inject__(UserAccountsRequestServicePersistence.class).readByUserAccountsRequest(persistence);
			if(__inject__(CollectionHelper.class).isNotEmpty(userAccountsRequestServices)) {
				representation.setServices(new ArrayList<>());
				for(UserAccountsRequestService index : userAccountsRequestServices)
					representation.getServices().add(index.getService());
			}
		}else
			super.__copy__(source, destination);
	}
	
}

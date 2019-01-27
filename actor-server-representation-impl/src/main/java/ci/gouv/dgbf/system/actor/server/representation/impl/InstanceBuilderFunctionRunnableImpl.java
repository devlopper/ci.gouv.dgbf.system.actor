package ci.gouv.dgbf.system.actor.server.representation.impl;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

import org.cyk.utility.collection.CollectionHelper;
import org.cyk.utility.instance.AbstractInstanceBuilderFunctionRunnableImpl;
import org.cyk.utility.instance.InstanceHelper;
import org.cyk.utility.string.StringHelper;

import ci.gouv.dgbf.system.actor.server.business.api.person.PersonBusiness;
import ci.gouv.dgbf.system.actor.server.business.api.user.account.RoleBusiness;
import ci.gouv.dgbf.system.actor.server.persistence.api.user.account.request.UserAccountRequestPersonPersistence;
import ci.gouv.dgbf.system.actor.server.persistence.api.user.account.request.UserAccountRequestRolePersistence;
import ci.gouv.dgbf.system.actor.server.persistence.api.user.account.request.UserAccountRequestServicePersistence;
import ci.gouv.dgbf.system.actor.server.persistence.entities.person.Person;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountRequest;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountRequestPerson;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountRequestRole;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountRequestService;
import ci.gouv.dgbf.system.actor.server.representation.entities.person.PersonDto;
import ci.gouv.dgbf.system.actor.server.representation.entities.user.account.RoleDto;
import ci.gouv.dgbf.system.actor.server.representation.entities.user.account.request.UserAccountRequestDto;

public class InstanceBuilderFunctionRunnableImpl extends AbstractInstanceBuilderFunctionRunnableImpl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	protected void __copy__(Object source, Object destination) {
		if(source instanceof UserAccountRequestDto && destination instanceof UserAccountRequest) {
			UserAccountRequestDto representation = (UserAccountRequestDto) source;
			UserAccountRequest persistence = (UserAccountRequest) destination;
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
		}else if(source instanceof UserAccountRequest && destination instanceof UserAccountRequestDto) {
			UserAccountRequest persistence = (UserAccountRequest) source;
			UserAccountRequestDto representation = (UserAccountRequestDto) destination;
			representation.setIdentifier(persistence.getIdentifier().toString());
			representation.setCode(persistence.getCode());
			representation.setLetter(persistence.getLetter());
			representation.setCreationDate(new SimpleDateFormat("dd/MM/yyyy hh:mm", Locale.FRANCE).format(persistence.getCreationDate()));
			
			Collection<UserAccountRequestRole> userAccountRequestRoles = __inject__(UserAccountRequestRolePersistence.class).readByUserAccountRequest(persistence);
			if(__inject__(CollectionHelper.class).isNotEmpty(userAccountRequestRoles)) {
				representation.setRoles(new ArrayList<>());
				for(UserAccountRequestRole index : userAccountRequestRoles) {
					representation.getRoles().add(__inject__(InstanceHelper.class).buildOne(RoleDto.class, index.getRole()));
				}
			}
			
			Collection<UserAccountRequestPerson> userAccountRequestPersons = __inject__(UserAccountRequestPersonPersistence.class).readByUserAccountRequest(persistence);
			if(__inject__(CollectionHelper.class).isNotEmpty(userAccountRequestPersons)) {
				representation.setPersons(new ArrayList<>());
				for(UserAccountRequestPerson index : userAccountRequestPersons) {
					PersonDto person = __inject__(InstanceHelper.class).buildOne(PersonDto.class, index.getPerson());
					person.setAdministrativeUnit(index.getAdministrativeUnit());
					person.setFunction(index.getFunction());
					representation.getPersons().add(person);
				}
			}
			
			Collection<UserAccountRequestService> userAccountRequestServices = __inject__(UserAccountRequestServicePersistence.class).readByUserAccountRequest(persistence);
			if(__inject__(CollectionHelper.class).isNotEmpty(userAccountRequestServices)) {
				representation.setServices(new ArrayList<>());
				for(UserAccountRequestService index : userAccountRequestServices)
					representation.getServices().add(index.getService());
			}
		}else
			super.__copy__(source, destination);
	}
	
}

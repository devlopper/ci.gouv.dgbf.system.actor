package ci.gouv.dgbf.system.actor.client.controller.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import org.cyk.utility.client.controller.AbstractInstanceBuilderFunctionRunnableImpl;
import org.cyk.utility.collection.CollectionHelper;
import org.cyk.utility.instance.InstanceHelper;

import ci.gouv.dgbf.system.actor.client.controller.entities.person.Person;
import ci.gouv.dgbf.system.actor.client.controller.entities.person.PersonImpl;
import ci.gouv.dgbf.system.actor.client.controller.entities.person.Persons;
import ci.gouv.dgbf.system.actor.client.controller.entities.service.Service;
import ci.gouv.dgbf.system.actor.client.controller.entities.service.ServiceImpl;
import ci.gouv.dgbf.system.actor.client.controller.entities.user.account.Role;
import ci.gouv.dgbf.system.actor.client.controller.entities.user.account.RoleImpl;
import ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request.UserAccountsRequest;
import ci.gouv.dgbf.system.actor.server.representation.entities.person.PersonDto;
import ci.gouv.dgbf.system.actor.server.representation.entities.user.account.RoleDto;
import ci.gouv.dgbf.system.actor.server.representation.entities.user.account.request.ServiceDto;
import ci.gouv.dgbf.system.actor.server.representation.entities.user.account.request.UserAccountsRequestDto;

public class InstanceBuilderFunctionRunnableImpl extends AbstractInstanceBuilderFunctionRunnableImpl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	protected void __copy__(Object source, Object destination) {
		if(source instanceof UserAccountsRequestDto && destination instanceof UserAccountsRequest) {
			UserAccountsRequestDto representation = (UserAccountsRequestDto) source;
			UserAccountsRequest data = (UserAccountsRequest) destination;
			data.setCode(representation.getCode());
			data.setLetter(representation.getLetter());
			
			if(__inject__(CollectionHelper.class).isNotEmpty(representation.getRoles())) {
				data.setRoles(new ArrayList<>());
				for(RoleDto index : representation.getRoles())
					data.getRoles().add(__inject__(InstanceHelper.class).buildOne(RoleImpl.class, index));
			}
			
			if(__inject__(CollectionHelper.class).isNotEmpty(representation.getPersons())) {
				data.setPersons(__inject__(Persons.class));
				for(PersonDto index : representation.getPersons())
					data.getPersons(Boolean.TRUE).add(__inject__(InstanceHelper.class).buildOne(PersonImpl.class, index));
			}
			
			if(__inject__(CollectionHelper.class).isNotEmpty(representation.getServices())) {
				data.setServices(new ArrayList<>());
				for(ServiceDto index : representation.getServices())
					data.getServices().add(__inject__(InstanceHelper.class).buildOne(ServiceImpl.class, index));		
			}
			
		}else if(source instanceof UserAccountsRequest && destination instanceof UserAccountsRequestDto) {
			UserAccountsRequest data = (UserAccountsRequest) source;
			UserAccountsRequestDto representation = (UserAccountsRequestDto) destination;
			representation.setCode(data.getCode());
			representation.setLetter(data.getLetter());
			
			Collection<Role> roles = data.getRoles();
			if(__inject__(CollectionHelper.class).isNotEmpty(roles)) {
				representation.setRoles(new ArrayList<>());
				for(Role index : roles) {
					representation.getRoles().add(__inject__(InstanceHelper.class).buildOne(RoleDto.class, index));
				}
			}
			
			Persons persons = data.getPersons();
			if(__inject__(CollectionHelper.class).isNotEmpty(persons)) {
				representation.setPersons(new ArrayList<>());
				for(Person index : persons.get())
					representation.getPersons().add(__inject__(InstanceHelper.class).buildOne(PersonDto.class, index));
			}
			
			Collection<Service> services = data.getServices();
			if(__inject__(CollectionHelper.class).isNotEmpty(services)) {
				representation.setServices(new ArrayList<>());
				for(Service index : services)
					representation.getServices().add(__inject__(InstanceHelper.class).buildOne(ServiceDto.class, index));
			}
		}else
			super.__copy__(source, destination);
	}
	
}
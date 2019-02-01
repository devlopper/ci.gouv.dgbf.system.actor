package ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.cyk.utility.client.controller.component.annotation.Input;
import org.cyk.utility.client.controller.component.annotation.InputChoice;
import org.cyk.utility.client.controller.component.annotation.InputChoiceMany;
import org.cyk.utility.client.controller.component.annotation.InputChoiceManyCheckBox;
import org.cyk.utility.client.controller.component.annotation.InputChoiceOne;
import org.cyk.utility.client.controller.component.annotation.InputChoiceOneRadio;
import org.cyk.utility.client.controller.component.annotation.InputString;
import org.cyk.utility.client.controller.component.annotation.InputStringEditor;
import org.cyk.utility.client.controller.component.annotation.InputStringLineMany;
import org.cyk.utility.client.controller.component.annotation.InputStringLineOne;
import org.cyk.utility.client.controller.data.AbstractDataImpl;
import org.cyk.utility.collection.CollectionHelper;

import ci.gouv.dgbf.system.actor.client.controller.entities.account.Credentials;
import ci.gouv.dgbf.system.actor.client.controller.entities.person.Person;
import ci.gouv.dgbf.system.actor.client.controller.entities.person.Persons;
import ci.gouv.dgbf.system.actor.client.controller.entities.service.Service;
import ci.gouv.dgbf.system.actor.client.controller.entities.software.Software;
import ci.gouv.dgbf.system.user.client.controller.entities.account.Role;

public class UserAccountRequestImpl extends AbstractDataImpl implements UserAccountRequest,Serializable {
	private static final long serialVersionUID = 1L;

	@Input @InputString @InputStringLineOne
	private String creationDate;
	
	@Input @InputString @InputStringLineOne @NotNull
	private Person person;
	
	private Persons persons;
	
	@Input @InputString @InputStringLineMany @NotNull
	private String comments;
	
	@Input @InputString @InputStringEditor @NotNull
	private String letter;
	
	@Input @InputString @InputStringLineOne @NotNull
	private Date processingDate;
	
	@Input @InputChoice @InputChoiceOne @InputChoiceOneRadio @NotNull
	private String status;
	
	@Input @InputChoice @InputChoiceOne @InputChoiceOneRadio @NotNull
	private String accepted;
	
	private Credentials credentials;
	
	@Input @InputChoice @InputChoiceMany @InputChoiceManyCheckBox @NotNull
	private Collection<Role> roles;
	
	@Input @InputChoice @InputChoiceMany @InputChoiceManyCheckBox @NotNull
	private Collection<Software> softwares;
	
	@Input @InputChoice @InputChoiceMany @InputChoiceManyCheckBox @NotNull
	private Collection<Service> services;
	
	private Integer numberOfPerson;
	
	@Override
	public UserAccountRequest setIdentifier(Object identifier) {
		return (UserAccountRequest) super.setIdentifier(identifier);
	}
	
	@Override
	public UserAccountRequest setCode(String code) {
		return (UserAccountRequest) super.setCode(code);
	}
	
	@Override
	public Collection<Role> getRoles() {
		return roles;
	}
	
	@Override
	public UserAccountRequest setRoles(Collection<Role> roles) {
		this.roles = roles;
		return this;
	}
	
	@Override
	public Collection<Software> getSoftwares() {
		return softwares;
	}
	
	@Override
	public UserAccountRequest setSoftwares(Collection<Software> softwares) {
		this.softwares = softwares;
		return this;
	}
	
	@Override
	public Collection<Service> getServices() {
		return services;
	}
	
	@Override
	public UserAccountRequest setServices(Collection<Service> services) {
		this.services = services;
		return this;
	}
	
	@Override
	public String getCreationDate() {
		return creationDate;
	}
	
	@Override
	public UserAccountRequest setCreationDate(String creationDate) {
		this.creationDate = creationDate;
		return this;
	}
	
	@Override
	public Person getPerson() {
		return person;
	}

	@Override
	public UserAccountRequest setPerson(Person person) {
		this.person = person;
		return this;
	}
	
	@Override
	public Persons getPersons() {
		return persons;
	}
	
	@Override
	public UserAccountRequest setPersons(Persons persons) {
		this.persons = persons;
		return this;
	}
	
	@Override
	public UserAccountRequest addPersons(Collection<Person> persons) {
		getPersons(Boolean.TRUE).add(persons);
		return this;
	}
	
	@Override
	public UserAccountRequest addPersons(Person... persons) {
		getPersons(Boolean.TRUE).add(persons);
		return this;
	}
	
	@Override
	public Persons getPersons(Boolean injectIfNull) {
		return (Persons) __getInjectIfNull__(PROPERTY_PERSONS, injectIfNull);
	}

	@Override
	public String getComments() {
		return comments;
	}

	@Override
	public UserAccountRequest setComments(String comments) {
		this.comments = comments;
		return this;
	}
	
	@Override
	public String getLetter() {
		return letter;
	}
	
	@Override
	public UserAccountRequest setLetter(String letter) {
		this.letter = letter;
		return this;
	}

	@Override
	public Date getProcessingDate() {
		return processingDate;
	}

	@Override
	public UserAccountRequest setProcessingDate(Date processingDate) {
		this.processingDate = processingDate;
		return this;
	}

	@Override
	public String getStatus() {
		return status;
	}

	@Override
	public UserAccountRequest setStatus(String status) {
		this.status = status;
		return this;
	}
	
	@Override
	public String getAccepted() {
		return accepted;
	}

	@Override
	public UserAccountRequest setAccepted(String accepted) {
		this.accepted = accepted;
		return this;
	}
	
	@Override
	public Credentials getCredentials() {
		return credentials;
	}
	
	@Override
	public UserAccountRequest setCredentials(Credentials credentials) {
		this.credentials = credentials;
		return this;
	}

	@Override
	public Integer getNumberOfPerson() {
		if(numberOfPerson == null)
			numberOfPerson = __inject__(CollectionHelper.class).getSize(getPersons());
		return numberOfPerson;
	}
	
	@Override
	public UserAccountRequest setNumberOfPerson(Integer numberOfPerson) {
		this.numberOfPerson = numberOfPerson;
		return this;
	}
}

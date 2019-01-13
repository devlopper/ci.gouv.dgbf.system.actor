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
import ci.gouv.dgbf.system.actor.client.controller.entities.role.Role;
import ci.gouv.dgbf.system.actor.client.controller.entities.service.Service;
import ci.gouv.dgbf.system.actor.client.controller.entities.software.Software;

public class UserAccountsRequestImpl extends AbstractDataImpl implements UserAccountsRequest,Serializable {
	private static final long serialVersionUID = 1L;

	@Input @InputString @InputStringLineOne @NotNull
	private Date date;
	
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
	public UserAccountsRequest setIdentifier(Object identifier) {
		return (UserAccountsRequest) super.setIdentifier(identifier);
	}
	
	@Override
	public UserAccountsRequest setCode(String code) {
		return (UserAccountsRequest) super.setCode(code);
	}
	
	@Override
	public Collection<Role> getRoles() {
		return roles;
	}
	
	@Override
	public UserAccountsRequest setRoles(Collection<Role> roles) {
		this.roles = roles;
		return this;
	}
	
	@Override
	public Collection<Software> getSoftwares() {
		return softwares;
	}
	
	@Override
	public UserAccountsRequest setSoftwares(Collection<Software> softwares) {
		this.softwares = softwares;
		return this;
	}
	
	@Override
	public Collection<Service> getServices() {
		return services;
	}
	
	@Override
	public UserAccountsRequest setServices(Collection<Service> services) {
		this.services = services;
		return this;
	}
	
	@Override
	public Date getDate() {
		return date;
	}
	
	@Override
	public UserAccountsRequest setDate(Date date) {
		this.date = date;
		return this;
	}
	
	@Override
	public Person getPerson() {
		return person;
	}

	@Override
	public UserAccountsRequest setPerson(Person person) {
		this.person = person;
		return this;
	}
	
	@Override
	public Persons getPersons() {
		return persons;
	}
	
	@Override
	public UserAccountsRequest setPersons(Persons persons) {
		this.persons = persons;
		return this;
	}
	
	@Override
	public UserAccountsRequest addPersons(Collection<Person> persons) {
		getPersons(Boolean.TRUE).add(persons);
		return this;
	}
	
	@Override
	public UserAccountsRequest addPersons(Person... persons) {
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
	public UserAccountsRequest setComments(String comments) {
		this.comments = comments;
		return this;
	}
	
	@Override
	public String getLetter() {
		return letter;
	}
	
	@Override
	public UserAccountsRequest setLetter(String letter) {
		this.letter = letter;
		return this;
	}

	@Override
	public Date getProcessingDate() {
		return processingDate;
	}

	@Override
	public UserAccountsRequest setProcessingDate(Date processingDate) {
		this.processingDate = processingDate;
		return this;
	}

	@Override
	public String getStatus() {
		return status;
	}

	@Override
	public UserAccountsRequest setStatus(String status) {
		this.status = status;
		return this;
	}
	
	@Override
	public String getAccepted() {
		return accepted;
	}

	@Override
	public UserAccountsRequest setAccepted(String accepted) {
		this.accepted = accepted;
		return this;
	}
	
	@Override
	public Credentials getCredentials() {
		return credentials;
	}
	
	@Override
	public UserAccountsRequest setCredentials(Credentials credentials) {
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
	public UserAccountsRequest setNumberOfPerson(Integer numberOfPerson) {
		this.numberOfPerson = numberOfPerson;
		return this;
	}
}

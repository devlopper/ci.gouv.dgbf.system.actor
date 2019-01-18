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
import org.cyk.utility.client.controller.component.annotation.InputStringLineMany;
import org.cyk.utility.client.controller.component.annotation.InputStringLineOne;
import org.cyk.utility.client.controller.data.AbstractDataImpl;

import ci.gouv.dgbf.system.actor.client.controller.entities.account.Credentials;
import ci.gouv.dgbf.system.actor.client.controller.entities.person.Person;
import ci.gouv.dgbf.system.actor.client.controller.entities.service.Service;
import ci.gouv.dgbf.system.actor.client.controller.entities.user.account.Role;

public class UserAccountRequestImpl extends AbstractDataImpl implements UserAccountRequest,Serializable {
	private static final long serialVersionUID = 1L;

	@Input @InputString @InputStringLineOne @NotNull
	private Date date;
	
	@Input @InputString @InputStringLineOne @NotNull
	private Person person;
	
	@Input @InputString @InputStringLineMany @NotNull
	private String comments;
	
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
	private Collection<Service> services;
	
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
	public Collection<Service> getServices() {
		return services;
	}
	
	@Override
	public UserAccountRequest setServices(Collection<Service> services) {
		this.services = services;
		return this;
	}
	
	@Override
	public Date getDate() {
		return date;
	}
	
	@Override
	public UserAccountRequest setDate(Date date) {
		this.date = date;
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
	public String getComments() {
		return comments;
	}

	@Override
	public UserAccountRequest setComments(String comments) {
		this.comments = comments;
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

}

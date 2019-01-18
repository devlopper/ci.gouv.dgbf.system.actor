package ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Transient;

import org.cyk.utility.server.persistence.jpa.AbstractEntity;
import org.cyk.utility.string.Strings;

import ci.gouv.dgbf.system.actor.server.persistence.entities.person.Person;
import ci.gouv.dgbf.system.actor.server.persistence.entities.person.Persons;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.Role;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.Roles;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity @Getter @Setter @Accessors(chain=true) @Access(AccessType.FIELD)
public class UserAccountsRequest extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private Date creationDate;
	private String comments;
	private Date processingDate;
	private String status;
	
	@Column(name="letter_")
	private String letter;
	
	@Transient private Roles roles;
	@Transient private Strings services;
	@Transient private Persons persons;
	
	@Override
	public UserAccountsRequest setCode(String code) {
		return (UserAccountsRequest) super.setCode(code);
	}
	
	public Roles getRoles(Boolean injectIfNull) {
		return (Roles) __getInjectIfNull__(FIELD_ROLES, injectIfNull);
	}
	
	public UserAccountsRequest addRoles(Collection<Role> roles) {
		getRoles(Boolean.TRUE).add(roles);
		return this;
	}
	
	public UserAccountsRequest addRoles(Role...roles) {
		getRoles(Boolean.TRUE).add(roles);
		return this;
	}
	
	public Persons getPersons(Boolean injectIfNull) {
		return (Persons) __getInjectIfNull__(FIELD_PERSONS, injectIfNull);
	}
	
	public UserAccountsRequest addPersons(Collection<Person> persons) {
		getPersons(Boolean.TRUE).add(persons);
		return this;
	}
	
	public UserAccountsRequest addPersons(Person...persons) {
		getPersons(Boolean.TRUE).add(persons);
		return this;
	}
	
	public Strings getServices(Boolean injectIfNull) {
		return (Strings) __getInjectIfNull__(FIELD_SERVICES, injectIfNull);
	}
	
	public UserAccountsRequest addServices(Collection<String> services) {
		getServices(Boolean.TRUE).add(services);
		return this;
	}
	
	public UserAccountsRequest addServices(String...services) {
		getServices(Boolean.TRUE).add(services);
		return this;
	}
	
	/**/
	
	public static final String FIELD_LETTER = "letter";
	public static final String FIELD_ROLES = "roles";
	public static final String FIELD_SERVICES = "services";
	public static final String FIELD_PERSONS = "persons";
}

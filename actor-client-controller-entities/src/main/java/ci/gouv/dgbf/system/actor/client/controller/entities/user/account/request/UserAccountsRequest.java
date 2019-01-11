package ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request;

import java.util.Collection;
import java.util.Date;

import org.cyk.utility.client.controller.data.Data;

import ci.gouv.dgbf.system.actor.client.controller.entities.account.Credentials;
import ci.gouv.dgbf.system.actor.client.controller.entities.person.Person;
import ci.gouv.dgbf.system.actor.client.controller.entities.person.Persons;
import ci.gouv.dgbf.system.actor.client.controller.entities.role.Role;
import ci.gouv.dgbf.system.actor.client.controller.entities.service.Service;
import ci.gouv.dgbf.system.actor.client.controller.entities.software.Software;

public interface UserAccountsRequest extends Data {

	@Override UserAccountsRequest setIdentifier(Object identifier);
	@Override UserAccountsRequest setCode(String code);
	
	Date getDate();
	UserAccountsRequest setDate(Date date);
	
	Person getPerson();
	UserAccountsRequest setPerson(Person person);
	
	Persons getPersons();
	Persons getPersons(Boolean injectIfNull);
	UserAccountsRequest setPersons(Persons persons);
	UserAccountsRequest addPersons(Collection<Person> persons);
	UserAccountsRequest addPersons(Person...persons);
	
	Integer getNumberOfPerson();
	UserAccountsRequest setNumberOfPerson(Integer numberOfPerson);
	
	Collection<Role> getRoles();
	UserAccountsRequest setRoles(Collection<Role> roles);
	
	Collection<Software> getSoftwares();
	UserAccountsRequest setSoftwares(Collection<Software> softwares);
	
	Collection<Service> getServices();
	UserAccountsRequest setServices(Collection<Service> services);
	
	String getComments();
	UserAccountsRequest setComments(String comments);
	
	String getLetter();
	UserAccountsRequest setLetter(String letter);
	
	Date getProcessingDate();
	UserAccountsRequest setProcessingDate(Date processingDate);
	
	String getStatus();
	UserAccountsRequest setStatus(String status);
	
	String getAccepted();
	UserAccountsRequest setAccepted(String accepted);
	
	Credentials getCredentials();
	UserAccountsRequest setCredentials(Credentials credentials);
	
	/**/
	
	String PROPERTY_DATE = "date";
	String PROPERTY_PERSON = "person";
	String PROPERTY_PERSONS = "persons";
	String PROPERTY_NUMBER_OF_PERSON = "numberOfPerson";
	String PROPERTY_COMMENTS = "comments";
	String PROPERTY_LETTER = "letter";
	String PROPERTY_PROCESSING_DATE = "processingDate";
	String PROPERTY_STATUS = "status";
	String PROPERTY_ACCEPTED = "accepted";
	String PROPERTY_ROLES = "roles";
	String PROPERTY_SERVICES = "services";
	String PROPERTY_SOFTWARES = "softwares";
	String PROPERTY_CREDENTIALS = "credentials";
}

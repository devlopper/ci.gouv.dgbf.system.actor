package ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request;

import java.util.Collection;
import java.util.Date;

import org.cyk.utility.client.controller.data.Data;

import ci.gouv.dgbf.system.actor.client.controller.entities.account.Credentials;
import ci.gouv.dgbf.system.actor.client.controller.entities.person.Person;
import ci.gouv.dgbf.system.actor.client.controller.entities.role.Role;
import ci.gouv.dgbf.system.actor.client.controller.entities.software.Software;

public interface UserAccountRequest extends Data {

	@Override UserAccountRequest setIdentifier(Object identifier);
	@Override UserAccountRequest setCode(String code);
	
	Date getDate();
	UserAccountRequest setDate(Date date);
	
	Person getPerson();
	UserAccountRequest setPerson(Person person);
	
	Collection<Role> getRoles();
	UserAccountRequest setRoles(Collection<Role> roles);
	
	Collection<Software> getSoftwares();
	UserAccountRequest setSoftwares(Collection<Software> softwares);
	
	String getComments();
	UserAccountRequest setComments(String comments);
	
	Date getProcessingDate();
	UserAccountRequest setProcessingDate(Date processingDate);
	
	String getStatus();
	UserAccountRequest setStatus(String status);
	
	Credentials getCredentials();
	UserAccountRequest setCredentials(Credentials credentials);
	
	/**/
	
	String PROPERTY_DATE = "date";
	String PROPERTY_PERSON = "person";
	String PROPERTY_COMMENTS = "comments";
	String PROPERTY_PROCESSING_DATE = "processingDate";
	String PROPERTY_STATUS = "status";
	String PROPERTY_ROLES = "roles";
	String PROPERTY_SOFTWARES = "softwares";
	String PROPERTY_CREDENTIALS = "credentials";
}

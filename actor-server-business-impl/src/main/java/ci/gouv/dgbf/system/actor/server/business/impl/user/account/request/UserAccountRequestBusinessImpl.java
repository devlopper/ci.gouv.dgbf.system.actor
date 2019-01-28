package ci.gouv.dgbf.system.actor.server.business.impl.user.account.request;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.inject.Singleton;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.cyk.utility.__kernel__.properties.Properties;
import org.cyk.utility.random.RandomHelper;
import org.cyk.utility.server.business.AbstractBusinessEntityImpl;
import org.cyk.utility.server.business.BusinessServiceProvider;
import org.cyk.utility.string.StringHelper;
import org.cyk.utility.string.Strings;

import ci.gouv.dgbf.system.actor.server.business.api.user.account.request.UserAccountRequestBusiness;
import ci.gouv.dgbf.system.actor.server.business.api.user.account.request.UserAccountRequestPersonBusiness;
import ci.gouv.dgbf.system.actor.server.business.api.user.account.request.UserAccountRequestRoleBusiness;
import ci.gouv.dgbf.system.actor.server.business.api.user.account.request.UserAccountRequestServiceBusiness;
import ci.gouv.dgbf.system.actor.server.persistence.api.user.account.request.UserAccountRequestPersistence;
import ci.gouv.dgbf.system.actor.server.persistence.api.user.account.request.UserAccountRequestPersonPersistence;
import ci.gouv.dgbf.system.actor.server.persistence.api.user.account.request.UserAccountRequestRolePersistence;
import ci.gouv.dgbf.system.actor.server.persistence.api.user.account.request.UserAccountRequestServicePersistence;
import ci.gouv.dgbf.system.actor.server.persistence.entities.person.Person;
import ci.gouv.dgbf.system.actor.server.persistence.entities.person.Persons;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.Role;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.Roles;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountRequest;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountRequestPerson;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountRequestRole;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountRequestService;

@Singleton
public class UserAccountRequestBusinessImpl extends AbstractBusinessEntityImpl<UserAccountRequest, UserAccountRequestPersistence> implements UserAccountRequestBusiness,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	protected Class<UserAccountRequest> __getEntityClass__() {
		return UserAccountRequest.class;
	}
	
	@Override
	public BusinessServiceProvider<UserAccountRequest> create(UserAccountRequest userAccountRequest, Properties properties) {
		if(__injectStringHelper__().isBlank(userAccountRequest.getCode()))
			userAccountRequest.setCode(__inject__(RandomHelper.class).getAlphanumeric(3));
		userAccountRequest.setCreationDate(new Date());
		super.create(userAccountRequest, properties);
		
		Roles roles = userAccountRequest.getRoles();
		if(__injectCollectionHelper__().isNotEmpty(roles)) {
			Collection<UserAccountRequestRole> userAccountRequestRoles = new ArrayList<>();
			for(Role index : roles.get())
				if(index!=null)
					userAccountRequestRoles.add(new UserAccountRequestRole().setUserAccountRequest(userAccountRequest).setRole(index));
			__inject__(UserAccountRequestRoleBusiness.class).createMany(userAccountRequestRoles);
		}
		
		Strings services = userAccountRequest.getServices();
		if(__injectCollectionHelper__().isNotEmpty(services)) {
			Collection<UserAccountRequestService> userAccountRequestServices = new ArrayList<>();
			for(String index : services.get())
				if(__inject__(StringHelper.class).isNotBlank(index))
					userAccountRequestServices.add(new UserAccountRequestService().setUserAccountRequest(userAccountRequest).setService(index));
			__inject__(UserAccountRequestServiceBusiness.class).createMany(userAccountRequestServices);
		}
		
		Persons persons = userAccountRequest.getPersons();
		if(__injectCollectionHelper__().isNotEmpty(persons)) {
			Collection<UserAccountRequestPerson> userAccountRequestPersons = new ArrayList<>();
			for(Person index : persons.get())
				if(index!=null) {
					UserAccountRequestPerson userAccountRequestPerson = new UserAccountRequestPerson().setUserAccountRequest(userAccountRequest).setPerson(index)
						.setAdministrativeUnit(index.getAdministrativeUnit()).setFunction(index.getFunction());
					
					userAccountRequestPersons.add(userAccountRequestPerson);
				}
			__inject__(UserAccountRequestPersonBusiness.class).createMany(userAccountRequestPersons);
		}
		/*
		try {
			String emailPort = "587";//gmail's smtp port

			java.util.Properties emailProperties = System.getProperties();
			emailProperties.put("mail.smtp.port", emailPort);
			emailProperties.put("mail.smtp.auth", "true");
			emailProperties.put("mail.smtp.starttls.enable", "true");
			
			String[] toEmails = { persons.getAt(0).getElectronicMailAddress() };
			String emailSubject = "SIB - Demande de compte utilisateur";
			String emailBody = userAccountRequest.getPersons().getAt(0).getFirstName()+" "+userAccountRequest.getPersons().getAt(0).getLastNames()
					+" , votre demande de compte utilisateur a été enregistrée avec succès. Le code de cette demande est "+userAccountRequest.getCode();

			Session mailSession = Session.getDefaultInstance(emailProperties, null);
			MimeMessage emailMessage = new MimeMessage(mailSession);

			for (int i = 0; i < toEmails.length; i++) {
				emailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmails[i]));
			}

			emailMessage.setSubject(emailSubject);
			emailMessage.setContent(emailBody, "text/html");//for a html email
			//emailMessage.setText(emailBody);// for a text email
			
			String emailHost = "smtp.gmail.com";
			String fromUser = "dgbfdtideveloppers";//just the id alone without @gmail.com
			String fromUserEmailPassword = "dgbf2016dti";

			Transport transport = mailSession.getTransport("smtp");

			transport.connect(emailHost, fromUser, fromUserEmailPassword);
			transport.sendMessage(emailMessage, emailMessage.getAllRecipients());
			transport.close();
		}catch(Exception exception) {
			throw new RuntimeException(exception);
		}
		*/
		return this;
	}
	
	@Override
	public BusinessServiceProvider<UserAccountRequest> delete(UserAccountRequest userAccountRequest, Properties properties) {
		__inject__(UserAccountRequestRoleBusiness.class).deleteMany(
				__inject__(UserAccountRequestRolePersistence.class).readByUserAccountRequest(userAccountRequest));
		
		__inject__(UserAccountRequestServiceBusiness.class).deleteMany(
				__inject__(UserAccountRequestServicePersistence.class).readByUserAccountRequest(userAccountRequest));
		
		__inject__(UserAccountRequestPersonBusiness.class).deleteMany(
				__inject__(UserAccountRequestPersonPersistence.class).readByUserAccountRequest(userAccountRequest));
		return super.delete(userAccountRequest, properties);
	}
}

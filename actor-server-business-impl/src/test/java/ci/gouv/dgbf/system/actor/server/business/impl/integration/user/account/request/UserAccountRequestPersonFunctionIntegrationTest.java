package ci.gouv.dgbf.system.actor.server.business.impl.integration.user.account.request;

import org.cyk.utility.server.business.test.TestBusinessCreate;
import org.cyk.utility.server.business.test.arquillian.AbstractBusinessArquillianIntegrationTestWithDefaultDeploymentAsSwram;
import org.junit.Test;

import ci.gouv.dgbf.system.actor.server.business.api.person.PersonBusiness;
import ci.gouv.dgbf.system.actor.server.business.api.user.account.request.UserAccountRequestBusiness;
import ci.gouv.dgbf.system.actor.server.persistence.entities.person.Person;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountRequest;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountRequestPerson;

public class UserAccountRequestPersonFunctionIntegrationTest extends AbstractBusinessArquillianIntegrationTestWithDefaultDeploymentAsSwram {
	private static final long serialVersionUID = 1L;
	
	/* Create */
	
	//@Test
	public void createOneUserAccountRequestPersonWithPersonExist() throws Exception{
		Person person = new Person().setCode("p01");
		__inject__(PersonBusiness.class).create(person);
		UserAccountRequest userAccountRequest = new UserAccountRequest().setCode("uar01");
		__inject__(UserAccountRequestBusiness.class).create(userAccountRequest);
		__inject__(TestBusinessCreate.class).addObjects(new UserAccountRequestPerson().setCode("a").setUserAccountRequest(userAccountRequest).setPerson(person)).execute();
	}
	

	@Test
	public void createOneUserAccountRequestPersonWithPersonNotExist() throws Exception{
		Person person = new Person().setCode("p01");
		UserAccountRequest userAccountRequest = new UserAccountRequest().setCode("uar01");
		__inject__(UserAccountRequestBusiness.class).create(userAccountRequest);
		__inject__(TestBusinessCreate.class).addObjects(new UserAccountRequestPerson().setCode("a").setUserAccountRequest(userAccountRequest).setPerson(person)).execute();
	}
}

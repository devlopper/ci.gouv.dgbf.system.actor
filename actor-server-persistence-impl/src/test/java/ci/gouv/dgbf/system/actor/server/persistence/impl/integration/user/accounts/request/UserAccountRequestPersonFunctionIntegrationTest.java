package ci.gouv.dgbf.system.actor.server.persistence.impl.integration.user.accounts.request;

import org.cyk.utility.server.persistence.test.TestPersistenceCreate;
import org.cyk.utility.server.persistence.test.arquillian.AbstractPersistenceArquillianIntegrationTestWithDefaultDeploymentAsSwram;
import org.junit.Test;

import ci.gouv.dgbf.system.actor.server.persistence.api.person.PersonPersistence;
import ci.gouv.dgbf.system.actor.server.persistence.api.user.account.request.UserAccountRequestPersistence;
import ci.gouv.dgbf.system.actor.server.persistence.entities.person.Person;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountRequest;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountRequestPerson;

public class UserAccountRequestPersonFunctionIntegrationTest extends AbstractPersistenceArquillianIntegrationTestWithDefaultDeploymentAsSwram {
	private static final long serialVersionUID = 1L;
	
	/* Create */
	
	@Test
	public void createOneUserAccountRequestPerson() throws Exception{
		userTransaction.begin();
		Person person = new Person().setCode("c01").setFirstName("konan").setLastNames("eric");
		__inject__(PersonPersistence.class).create(person);
		UserAccountRequest userAccountRequest = new UserAccountRequest().setCode("c01");
		__inject__(UserAccountRequestPersistence.class).create(userAccountRequest);
		userTransaction.commit();
		__inject__(TestPersistenceCreate.class).addObjects(new UserAccountRequestPerson().setCode("uar01p01").setUserAccountRequest(userAccountRequest).setPerson(person)).execute();
		
	}
	
}

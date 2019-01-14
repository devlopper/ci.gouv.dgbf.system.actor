package ci.gouv.dgbf.system.actor.server.persistence.impl.integration.user.accounts.request;

import org.cyk.utility.server.persistence.test.TestPersistenceCreate;
import org.cyk.utility.server.persistence.test.arquillian.AbstractPersistenceArquillianIntegrationTestWithDefaultDeploymentAsSwram;
import org.junit.Test;

import ci.gouv.dgbf.system.actor.server.persistence.api.person.PersonPersistence;
import ci.gouv.dgbf.system.actor.server.persistence.api.user.account.request.UserAccountsRequestPersistence;
import ci.gouv.dgbf.system.actor.server.persistence.entities.person.Person;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountsRequest;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountsRequestPerson;

public class UserAccountsRequestPersonFunctionIntegrationTest extends AbstractPersistenceArquillianIntegrationTestWithDefaultDeploymentAsSwram {
	private static final long serialVersionUID = 1L;
	
	/* Create */
	
	@Test
	public void createOneUserAccountsRequestPerson() throws Exception{
		userTransaction.begin();
		Person person = new Person().setCode("c01").setFirstName("konan").setLastNames("eric");
		__inject__(PersonPersistence.class).create(person);
		UserAccountsRequest userAccountsRequest = new UserAccountsRequest().setCode("c01");
		__inject__(UserAccountsRequestPersistence.class).create(userAccountsRequest);
		userTransaction.commit();
		__inject__(TestPersistenceCreate.class).addObjects(new UserAccountsRequestPerson().setCode("uar01p01").setUserAccountsRequest(userAccountsRequest).setPerson(person)).execute();
		
	}
	
}

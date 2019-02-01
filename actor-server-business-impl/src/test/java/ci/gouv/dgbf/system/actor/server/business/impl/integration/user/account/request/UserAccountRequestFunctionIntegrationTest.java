package ci.gouv.dgbf.system.actor.server.business.impl.integration.user.account.request;

import org.cyk.utility.server.business.test.TestBusinessCreate;
import org.cyk.utility.server.business.test.arquillian.AbstractBusinessArquillianIntegrationTestWithDefaultDeploymentAsSwram;
import org.junit.Test;

import ci.gouv.dgbf.system.actor.server.persistence.entities.person.Person;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountRequest;

public class UserAccountRequestFunctionIntegrationTest extends AbstractBusinessArquillianIntegrationTestWithDefaultDeploymentAsSwram {
	private static final long serialVersionUID = 1L;
	
	/* Create */
	
	@Test
	public void createOneUserAccountRequest() throws Exception{
		UserAccountRequest userAccountRequest = new UserAccountRequest();
		userAccountRequest.addRoles("R01","R04");
		userAccountRequest.addServices("EL","EX");
		userAccountRequest.addPersons(new Person().setCode("P01"));
		__inject__(TestBusinessCreate.class).addObjects(userAccountRequest).execute();
	}
	

}

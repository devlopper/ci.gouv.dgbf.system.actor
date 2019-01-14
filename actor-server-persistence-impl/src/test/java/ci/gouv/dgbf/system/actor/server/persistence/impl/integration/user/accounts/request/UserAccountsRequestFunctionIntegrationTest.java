package ci.gouv.dgbf.system.actor.server.persistence.impl.integration.user.accounts.request;

import org.cyk.utility.server.persistence.test.TestPersistenceCreate;
import org.cyk.utility.server.persistence.test.arquillian.AbstractPersistenceArquillianIntegrationTestWithDefaultDeploymentAsSwram;
import org.junit.Test;

import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountsRequest;

public class UserAccountsRequestFunctionIntegrationTest extends AbstractPersistenceArquillianIntegrationTestWithDefaultDeploymentAsSwram {
	private static final long serialVersionUID = 1L;
	
	/* Create */
	
	@Test
	public void createOneUserAccountsRequest() throws Exception{
		__inject__(TestPersistenceCreate.class).addObjects(new UserAccountsRequest().setCode("c01")).execute();
	}
	
}

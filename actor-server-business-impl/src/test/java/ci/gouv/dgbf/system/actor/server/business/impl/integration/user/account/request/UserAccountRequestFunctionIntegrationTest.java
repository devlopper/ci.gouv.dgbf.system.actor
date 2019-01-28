package ci.gouv.dgbf.system.actor.server.business.impl.integration.user.account.request;

import org.cyk.utility.collection.CollectionHelper;
import org.cyk.utility.server.business.test.TestBusinessCreate;
import org.cyk.utility.server.business.test.arquillian.AbstractBusinessArquillianIntegrationTestWithDefaultDeploymentAsSwram;
import org.junit.Test;

import ci.gouv.dgbf.system.actor.server.business.api.user.account.RoleBusiness;
import ci.gouv.dgbf.system.actor.server.persistence.api.user.account.RolePersistence;
import ci.gouv.dgbf.system.actor.server.persistence.entities.person.Person;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.Role;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountRequest;

public class UserAccountRequestFunctionIntegrationTest extends AbstractBusinessArquillianIntegrationTestWithDefaultDeploymentAsSwram {
	private static final long serialVersionUID = 1L;
	
	/* Create */
	
	@Test
	public void createOneUserAccountRequest() throws Exception{
		__inject__(RoleBusiness.class).createMany(__inject__(CollectionHelper.class).instanciate(
				new Role().setCode("R01"),new Role().setCode("R02"),new Role().setCode("R03"),new Role().setCode("R04"),new Role().setCode("R05")
				));
		
		UserAccountRequest userAccountRequest = new UserAccountRequest();
		userAccountRequest.addRoles(__inject__(RolePersistence.class).readOneByBusinessIdentifier("R01"),__inject__(RolePersistence.class).readOneByBusinessIdentifier("R04"));
		userAccountRequest.addServices("EL","EX");
		userAccountRequest.addPersons(new Person().setCode("P01"));
		__inject__(TestBusinessCreate.class).addObjects(userAccountRequest).execute();
	}
	

}
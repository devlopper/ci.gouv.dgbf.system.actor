package ci.gouv.dgbf.system.actor.server.business.impl.integration.user.account.request;

import org.cyk.utility.server.business.test.TestBusinessCreate;
import org.cyk.utility.server.business.test.arquillian.AbstractBusinessArquillianIntegrationTestWithDefaultDeploymentAsSwram;
import org.junit.Test;

import ci.gouv.dgbf.system.actor.server.business.api.person.PersonBusiness;
import ci.gouv.dgbf.system.actor.server.business.api.user.account.request.UserAccountsRequestBusiness;
import ci.gouv.dgbf.system.actor.server.persistence.entities.person.Person;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountsRequest;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountsRequestPerson;

public class UserAccountsRequestPersonFunctionIntegrationTest extends AbstractBusinessArquillianIntegrationTestWithDefaultDeploymentAsSwram {
	private static final long serialVersionUID = 1L;
	
	/* Create */
	
	//@Test
	public void createOneUserAccountsRequestPersonWithPersonExist() throws Exception{
		Person person = new Person().setCode("p01");
		__inject__(PersonBusiness.class).create(person);
		UserAccountsRequest userAccountsRequest = new UserAccountsRequest().setCode("uar01");
		__inject__(UserAccountsRequestBusiness.class).create(userAccountsRequest);
		__inject__(TestBusinessCreate.class).addObjects(new UserAccountsRequestPerson().setCode("a").setUserAccountsRequest(userAccountsRequest).setPerson(person)).execute();
	}
	

	@Test
	public void createOneUserAccountsRequestPersonWithPersonNotExist() throws Exception{
		Person person = new Person().setCode("p01");
		UserAccountsRequest userAccountsRequest = new UserAccountsRequest().setCode("uar01");
		__inject__(UserAccountsRequestBusiness.class).create(userAccountsRequest);
		__inject__(TestBusinessCreate.class).addObjects(new UserAccountsRequestPerson().setCode("a").setUserAccountsRequest(userAccountsRequest).setPerson(person)).execute();
	}
}

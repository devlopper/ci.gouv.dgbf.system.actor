package ci.gouv.dgbf.system.actor.server.business.impl.integration.person;

import org.cyk.utility.server.business.test.TestBusinessCreate;
import org.cyk.utility.server.business.test.arquillian.AbstractBusinessArquillianIntegrationTestWithDefaultDeploymentAsSwram;
import org.junit.Test;

import ci.gouv.dgbf.system.actor.server.persistence.entities.person.Person;

public class PersonFunctionIntegrationTest extends AbstractBusinessArquillianIntegrationTestWithDefaultDeploymentAsSwram {
	private static final long serialVersionUID = 1L;
	
	/* Create */
	
	@Test
	public void createOnePerson() throws Exception{
		__inject__(TestBusinessCreate.class).addObjects(new Person().setCode("a")).execute();
	}
	

}

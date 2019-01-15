package ci.gouv.dgbf.system.actor.client.controller.impl.person;

import org.cyk.utility.client.controller.test.TestControllerCreate;
import org.cyk.utility.client.controller.test.arquillian.AbstractControllerArquillianIntegrationTestWithDefaultDeploymentAsSwram;
import org.junit.Test;

import ci.gouv.dgbf.system.actor.client.controller.entities.person.Person;

public class PersonControllerFunctionIntegrationTest extends AbstractControllerArquillianIntegrationTestWithDefaultDeploymentAsSwram {
	private static final long serialVersionUID = 1L;
	
	/* Create */
	
	@Test
	public void createOnePerson() throws Exception{
		__inject__(TestControllerCreate.class).addObjects(__inject__(Person.class).setCode("a")).execute();
	}
	
	/**/
	
	
	
}

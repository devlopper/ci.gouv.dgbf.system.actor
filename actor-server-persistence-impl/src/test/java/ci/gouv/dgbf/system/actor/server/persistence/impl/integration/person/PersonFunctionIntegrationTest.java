package ci.gouv.dgbf.system.actor.server.persistence.impl.integration.person;

import org.cyk.utility.server.persistence.test.TestPersistenceCreate;
import org.cyk.utility.server.persistence.test.arquillian.AbstractPersistenceArquillianIntegrationTestWithDefaultDeploymentAsSwram;
import org.junit.Test;

import ci.gouv.dgbf.system.actor.server.persistence.entities.person.Person;

public class PersonFunctionIntegrationTest extends AbstractPersistenceArquillianIntegrationTestWithDefaultDeploymentAsSwram {
	private static final long serialVersionUID = 1L;
	
	/* Create */
	
	@Test
	public void createOnePerson() throws Exception{
		__inject__(TestPersistenceCreate.class).addObjects(new Person().setCode("c01").setFirstName("konan").setLastNames("eric")).execute();
	}
	
	
}

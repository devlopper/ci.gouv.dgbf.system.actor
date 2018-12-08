package ci.gouv.dgbf.system.actor.client.controller.entities.employer;

import org.cyk.utility.client.controller.data.Data;

public interface Employer extends Data {

	@Override Employer setIdentifier(Object identifier);
	@Override Employer setCode(String code);
	
	String getName();
	Employer setName(String name);
	
	/**/
	
	String PROPERTY_NAME = "name";
	
}

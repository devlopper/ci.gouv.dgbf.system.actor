package ci.gouv.dgbf.system.actor.client.controller.entities.role;

import org.cyk.utility.client.controller.data.Data;

public interface Role extends Data {

	@Override Role setIdentifier(Object identifier);
	@Override Role setCode(String code);
	
	String getName();
	Role setName(String name);
	
	String getDescription();
	Role setDescription(String description);
	
	/**/
	
	String PROPERTY_NAME = "name";
	String PROPERTY_DESCRIPTION = "description";
	
}

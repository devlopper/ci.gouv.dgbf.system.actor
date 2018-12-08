package ci.gouv.dgbf.system.actor.client.controller.entities.software;

import org.cyk.utility.client.controller.data.Data;

public interface Software extends Data {

	@Override Software setIdentifier(Object identifier);
	@Override Software setCode(String code);
	
	String getName();
	Software setName(String name);
	
	String getDescription();
	Software setDescription(String description);
	
	/**/
	
	String PROPERTY_NAME = "name";
	String PROPERTY_DESCRIPTION = "description";
	
}

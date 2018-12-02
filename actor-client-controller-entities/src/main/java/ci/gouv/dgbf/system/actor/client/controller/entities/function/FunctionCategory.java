package ci.gouv.dgbf.system.actor.client.controller.entities.function;

import org.cyk.utility.client.controller.data.Data;

public interface FunctionCategory extends Data {

	@Override FunctionCategory setIdentifier(Object identifier);
	@Override FunctionCategory setCode(String code);
	
	String getName();
	FunctionCategory setName(String name);
	
	String getDescription();
	FunctionCategory setDescription(String description);
	
	/**/
	
	String PROPERTY_NAME = "name";
	String PROPERTY_DESCRIPTION = "description";
	
}

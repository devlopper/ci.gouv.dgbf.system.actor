package ci.gouv.dgbf.system.actor.client.controller.entities.function;

import org.cyk.utility.client.controller.data.Data;

public interface Function extends Data {

	@Override Function setIdentifier(Object identifier);
	@Override Function setCode(String code);
	
	String getName();
	Function setName(String name);
	
	String getDescription();
	Function setDescription(String description);
	
	FunctionCategory getCategory();
	Function setCategory(FunctionCategory category);
	
	/**/
	
	String PROPERTY_NAME = "name";
	String PROPERTY_DESCRIPTION = "description";
	String PROPERTY_CATEGORY = "category";
	
}

package ci.gouv.dgbf.system.actor.client.controller.entities.function;

import java.util.Collection;

import org.cyk.utility.__kernel__.DependencyInjection;
import org.cyk.utility.client.controller.data.Data;
import org.cyk.utility.collection.CollectionHelper;

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
	
	/**/
	
	Collection<FunctionCategory> COLLECTION = DependencyInjection.inject(CollectionHelper.class).instanciate(
			DependencyInjection.inject(FunctionCategory.class).setIdentifier("1").setCode("ADM").setName("Administrative").setDescription("")
			,DependencyInjection.inject(FunctionCategory.class).setIdentifier("2").setCode("BUD").setName("Budgétaire").setDescription("")
			
			);
}

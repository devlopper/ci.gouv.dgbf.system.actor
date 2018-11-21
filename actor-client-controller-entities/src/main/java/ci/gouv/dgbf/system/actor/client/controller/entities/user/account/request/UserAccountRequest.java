package ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request;

import java.util.Collection;

import org.cyk.utility.__kernel__.DependencyInjection;
import org.cyk.utility.client.controller.data.Data;
import org.cyk.utility.collection.CollectionHelper;

import ci.gouv.dgbf.system.actor.client.controller.entities.function.Function;
import ci.gouv.dgbf.system.actor.client.controller.entities.function.FunctionImpl;

public interface UserAccountRequest extends Data {

	@Override UserAccountRequest setIdentifier(Object identifier);
	@Override UserAccountRequest setCode(String code);
	
	String getFirstName();
	UserAccountRequest setFirstName(String firstName);
	
	String getLastNames();
	UserAccountRequest setLastNames(String lastNames);
	
	String getEmployer();
	UserAccountRequest setEmployer(String employer);
	
	String getEmployeeIdentifier();
	UserAccountRequest setEmployeeIdentifier(String employeeIdentifier);
	
	Function getFunction();
	UserAccountRequest setFunction(Function function);
	
	String getHierarchyFirstName();
	UserAccountRequest setHierarchyFirstName(String hierarchyFirstName);
	
	String getHierarchyLastNames();
	UserAccountRequest setHierarchyLastNames(String hierarchyLastNames);
	
	/**/
	
	String PROPERTY_FIRST_NAME = "firstName";
	String PROPERTY_LAST_NAMES = "lastNames";
	String PROPERTY_EMPLOYER = "employer";
	String PROPERTY_EMPLOYEE_IDENTIFIER = "employeeIdentifier";
	String PROPERTY_FUNCTION = "function";
	String PROPERTY_HIERARCHY_FIRST_NAME = "hierarchyFirstName";
	String PROPERTY_HIERARCHY_LAST_NAMES = "hierarchyLastNames";
	
	/**/
	
	Collection<UserAccountRequest> COLLECTION = DependencyInjection.inject(CollectionHelper.class).instanciate(
			DependencyInjection.inject(UserAccountRequest.class).setIdentifier("1").setCode("DC0001").setFirstName("Zadi").setLastNames("Jean Jacques")
			.setEmployer("Fonction publique").setEmployeeIdentifier("2001005").setFunction(FunctionImpl.getByCode("CHARGE_ETUDE"))
			.setHierarchyFirstName("Koffi").setHierarchyLastNames("Paul")
			
			,DependencyInjection.inject(UserAccountRequest.class).setIdentifier("2").setCode("DC0002").setFirstName("Kadio").setLastNames("Marc")
			.setEmployer("FMI").setEmployeeIdentifier("FM035").setFunction(FunctionImpl.getByCode("OBSERVATEUR"))
			.setHierarchyFirstName("Harry").setHierarchyLastNames("John")
			);
}

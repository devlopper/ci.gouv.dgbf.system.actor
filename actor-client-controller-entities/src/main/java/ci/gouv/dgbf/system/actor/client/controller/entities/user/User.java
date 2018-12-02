package ci.gouv.dgbf.system.actor.client.controller.entities.user;

import org.cyk.utility.client.controller.data.Data;

import ci.gouv.dgbf.system.actor.client.controller.entities.function.Function;

public interface User extends Data {

	@Override User setIdentifier(Object identifier);
	@Override User setCode(String code);
	
	String getFirstName();
	User setFirstName(String firstName);
	
	String getLastNames();
	User setLastNames(String lastNames);
	
	String getEmployer();
	User setEmployer(String employer);
	
	String getEmployeeIdentifier();
	User setEmployeeIdentifier(String employeeIdentifier);
	
	Function getFunction();
	User setFunction(Function function);
	
	String getHierarchyFirstName();
	User setHierarchyFirstName(String hierarchyFirstName);
	
	String getHierarchyLastNames();
	User setHierarchyLastNames(String hierarchyLastNames);
	
	/**/
	
	String PROPERTY_FIRST_NAME = "firstName";
	String PROPERTY_LAST_NAMES = "lastNames";
	String PROPERTY_EMPLOYER = "employer";
	String PROPERTY_EMPLOYEE_IDENTIFIER = "employeeIdentifier";
	String PROPERTY_FUNCTION = "function";
	String PROPERTY_HIERARCHY_FIRST_NAME = "hierarchyFirstName";
	String PROPERTY_HIERARCHY_LAST_NAMES = "hierarchyLastNames";
	
	
}

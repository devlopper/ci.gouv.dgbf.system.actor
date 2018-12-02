package ci.gouv.dgbf.system.actor.client.controller.entities.user.account;

import org.cyk.utility.client.controller.data.Data;

import ci.gouv.dgbf.system.actor.client.controller.entities.function.Function;

public interface UserAccount extends Data {

	@Override UserAccount setIdentifier(Object identifier);
	@Override UserAccount setCode(String code);
	
	String getFirstName();
	UserAccount setFirstName(String firstName);
	
	String getLastNames();
	UserAccount setLastNames(String lastNames);
	
	String getEmployer();
	UserAccount setEmployer(String employer);
	
	String getEmployeeIdentifier();
	UserAccount setEmployeeIdentifier(String employeeIdentifier);
	
	Function getFunction();
	UserAccount setFunction(Function function);
	
	String getHierarchyFirstName();
	UserAccount setHierarchyFirstName(String hierarchyFirstName);
	
	String getHierarchyLastNames();
	UserAccount setHierarchyLastNames(String hierarchyLastNames);
	
	/**/
	
	String PROPERTY_FIRST_NAME = "firstName";
	String PROPERTY_LAST_NAMES = "lastNames";
	String PROPERTY_EMPLOYER = "employer";
	String PROPERTY_EMPLOYEE_IDENTIFIER = "employeeIdentifier";
	String PROPERTY_FUNCTION = "function";
	String PROPERTY_HIERARCHY_FIRST_NAME = "hierarchyFirstName";
	String PROPERTY_HIERARCHY_LAST_NAMES = "hierarchyLastNames";
	
}

package ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request;

import org.cyk.utility.client.controller.data.Data;

import ci.gouv.dgbf.system.actor.client.controller.entities.function.Function;

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
	
}

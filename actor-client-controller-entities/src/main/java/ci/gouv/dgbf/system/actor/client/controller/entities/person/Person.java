package ci.gouv.dgbf.system.actor.client.controller.entities.person;

import org.cyk.utility.client.controller.data.Data;

import ci.gouv.dgbf.system.actor.client.controller.entities.employer.Employer;
import ci.gouv.dgbf.system.actor.client.controller.entities.function.Function;

public interface Person extends Data {

	@Override Person setIdentifier(Object identifier);
	@Override Person setCode(String code);
	
	String getFirstName();
	Person setFirstName(String firstName);
	
	String getLastNames();
	Person setLastNames(String lastNames);
	
	Sex getSex();
	Person setSex(Sex sex);
	
	String getFirstNameAndLastNames();
	
	String getHomeAddress();
	Person setHomeAddress(String homeAddress);
	
	String getElectronicMailAddress();
	Person setElectronicMailAddress(String electronicMailAddress);
	
	String getPhoneNumber();
	Person setPhoneNumber(String phoneNumber);
	
	String getPostalBoxAddress();
	Person setPostalBoxAddress(String postalBoxAddress);
	
	Employer getEmployer();
	Person setEmployer(Employer employer);
	
	String getEmployeeIdentifier();
	Person setEmployeeIdentifier(String employeeIdentifier);
	
	Function getFunction();
	Person setFunction(Function function);
	
	Person getHierarchy();
	Person setHierarchy(Person hierarchy);
	
	/**/
	
	String PROPERTY_FIRST_NAME = "firstName";
	String PROPERTY_LAST_NAMES = "lastNames";
	String PROPERTY_SEX = "sex";
	String PROPERTY_FIRST_NAME_AND_LAST_NAMES = "firstNameAndLastNames";
	String PROPERTY_ELECTRONIC_MAIL_ADDRESS = "electronicMailAddress";
	String PROPERTY_PHONE_NUMBER = "phoneNumber";
	String PROPERTY_POSTAL_BOX_ADDRESS = "postalBoxAddress";
	String PROPERTY_HOME_ADDRESS = "homeAddress";
	String PROPERTY_EMPLOYER = "employer";
	String PROPERTY_EMPLOYEE_IDENTIFIER = "employeeIdentifier";
	String PROPERTY_FUNCTION = "function";
	String PROPERTY_HIERARCHY = "hierarchy";
	
}

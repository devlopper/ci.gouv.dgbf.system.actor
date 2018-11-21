package ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.cyk.utility.client.controller.component.annotation.Input;
import org.cyk.utility.client.controller.component.annotation.InputString;
import org.cyk.utility.client.controller.component.annotation.InputStringLineOne;
import org.cyk.utility.client.controller.data.AbstractDataImpl;

import ci.gouv.dgbf.system.actor.client.controller.entities.function.Function;

public class UserAccountRequestImpl extends AbstractDataImpl implements UserAccountRequest,Serializable {
	private static final long serialVersionUID = 1L;

	@Input @InputString @InputStringLineOne @NotNull
	private String firstName;
	
	@Input @InputString @InputStringLineOne @NotNull
	private String lastNames;
	
	@Input @InputString @InputStringLineOne @NotNull
	private String employer;
	
	@Input @InputString @InputStringLineOne @NotNull
	private String employeeIdentifier;
	
	@Input @InputString @InputStringLineOne @NotNull
	private Function function;
	
	@Input @InputString @InputStringLineOne @NotNull
	private String hierarchyFirstName;
	
	@Input @InputString @InputStringLineOne @NotNull
	private String hierarchyLastNames;
	
	@Override
	public UserAccountRequest setIdentifier(Object identifier) {
		return (UserAccountRequest) super.setIdentifier(identifier);
	}
	
	@Override
	public UserAccountRequest setCode(String code) {
		return (UserAccountRequest) super.setCode(code);
	}
	
	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public UserAccountRequest setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	@Override
	public String getLastNames() {
		return lastNames;
	}

	@Override
	public UserAccountRequest setLastNames(String lastNames) {
		this.lastNames = lastNames;
		return this;
	}

	@Override
	public String getEmployer() {
		return employer;
	}

	@Override
	public UserAccountRequest setEmployer(String employer) {
		this.employer = employer;
		return this;
	}

	@Override
	public String getEmployeeIdentifier() {
		return employeeIdentifier;
	}

	@Override
	public UserAccountRequest setEmployeeIdentifier(String employeeIdentifier) {
		this.employeeIdentifier = employeeIdentifier;
		return this;
	}

	@Override
	public Function getFunction() {
		return function;
	}

	@Override
	public UserAccountRequest setFunction(Function function) {
		this.function = function;
		return this;
	}

	@Override
	public String getHierarchyFirstName() {
		return hierarchyFirstName;
	}

	@Override
	public UserAccountRequest setHierarchyFirstName(String hierarchyFirstName) {
		this.hierarchyFirstName = hierarchyFirstName;
		return this;
	}

	@Override
	public String getHierarchyLastNames() {
		return hierarchyLastNames;
	}

	@Override
	public UserAccountRequest setHierarchyLastNames(String hierarchyLastNames) {
		this.hierarchyLastNames = hierarchyLastNames;
		return this;
	}	
	
	public static UserAccountRequest getByIdentifier(Object identifier) {
		for(UserAccountRequest index : UserAccountRequest.COLLECTION)
			if(index.getIdentifier().equals(identifier))
				return index;
		return null;
	}
	
}

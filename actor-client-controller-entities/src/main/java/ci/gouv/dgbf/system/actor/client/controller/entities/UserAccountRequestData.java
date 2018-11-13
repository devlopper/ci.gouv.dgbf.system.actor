package ci.gouv.dgbf.system.actor.client.controller.entities;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.cyk.utility.client.controller.component.annotation.Input;
import org.cyk.utility.client.controller.component.annotation.InputString;
import org.cyk.utility.client.controller.component.annotation.InputStringLineOne;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true)
public class UserAccountRequestData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Input @InputString @InputStringLineOne
	@NotNull
	private String firstName;
	
	@Input @InputString @InputStringLineOne
	@NotNull
	private String lastNames;
	
	@Input @InputString @InputStringLineOne
	private String phoneNumber;
	
	@Input @InputString @InputStringLineOne
	private String electronicMailAddress;
	
	@Input @InputString @InputStringLineOne
	private String administrativeFunction;
	
	@Input @InputString @InputStringLineOne
	private String budgetFunction;
	
	@Input @InputString @InputStringLineOne
	private String userName;
	
	@Input @InputString @InputStringLineOne
	private String password;
	
	/**/
	
	public static final String FIELD_FIRST_NAME = "firstName";
	public static final String FIELD_LAST_NAME = "lastNames";
	public static final String FIELD_PHONE_NUMBER = "phoneNumber";
	public static final String FIELD_ELECTRONIC_MAIL_ADDRESS = "electronicMailAddress";
	public static final String FIELD_ADMINISTRATIVE_FUNCTION = "administrativeFunction";
	public static final String FIELD_BUDGET_FUNCTION = "budgetFunction";
	public static final String FIELD_USER_NAME = "userName";
	public static final String FIELD_PASSWORD = "password";
}

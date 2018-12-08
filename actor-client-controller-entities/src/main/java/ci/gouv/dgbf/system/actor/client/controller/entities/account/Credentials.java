package ci.gouv.dgbf.system.actor.client.controller.entities.account;

import org.cyk.utility.client.controller.data.Data;

public interface Credentials extends Data {

	@Override Credentials setIdentifier(Object identifier);
	@Override Credentials setCode(String code);
	
	String getUsername();
	Credentials setUsername(String username);
	
	String getPassword();
	Credentials setPassword(String password);
	
	/**/
	
	String PROPERTY_USERNAME = "username";
	String PROPERTY_PASSWORD = "password";	
	
	
}

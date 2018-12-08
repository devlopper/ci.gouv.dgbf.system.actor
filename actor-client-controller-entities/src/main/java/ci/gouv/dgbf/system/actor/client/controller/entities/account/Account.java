package ci.gouv.dgbf.system.actor.client.controller.entities.account;

import org.cyk.utility.client.controller.data.Data;

public interface Account extends Data {

	@Override Account setIdentifier(Object identifier);
	@Override Account setCode(String code);
	
	Credentials getCredentials();
	Account setCredentials(Credentials credentials);
	
	/**/
	
	String PROPERTY_CREDENTIALS = "credentials";
	
}

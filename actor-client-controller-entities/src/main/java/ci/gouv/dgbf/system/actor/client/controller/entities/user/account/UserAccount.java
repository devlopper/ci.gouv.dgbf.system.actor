package ci.gouv.dgbf.system.actor.client.controller.entities.user.account;

import org.cyk.utility.client.controller.data.Data;

import ci.gouv.dgbf.system.actor.client.controller.entities.account.Account;
import ci.gouv.dgbf.system.actor.client.controller.entities.user.User;

public interface UserAccount extends Data {

	@Override UserAccount setIdentifier(Object identifier);
	@Override UserAccount setCode(String code);
	
	User getUser();
	UserAccount setUser(User user);
	
	Account getAccount();
	UserAccount setAccount(Account account);
	
	/**/
	
	String PROPERTY_USER = "user";
	String PROPERTY_ACCOUNT = "account";
}

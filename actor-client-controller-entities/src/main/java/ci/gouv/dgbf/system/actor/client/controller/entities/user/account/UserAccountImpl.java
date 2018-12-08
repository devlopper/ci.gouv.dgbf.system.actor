package ci.gouv.dgbf.system.actor.client.controller.entities.user.account;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.cyk.utility.client.controller.component.annotation.Input;
import org.cyk.utility.client.controller.component.annotation.InputString;
import org.cyk.utility.client.controller.component.annotation.InputStringLineOne;
import org.cyk.utility.client.controller.data.AbstractDataImpl;

import ci.gouv.dgbf.system.actor.client.controller.entities.account.Account;
import ci.gouv.dgbf.system.actor.client.controller.entities.user.User;

public class UserAccountImpl extends AbstractDataImpl implements UserAccount,Serializable {
	private static final long serialVersionUID = 1L;

	@Input @InputString @InputStringLineOne @NotNull
	private User user;
	
	@Input @InputString @InputStringLineOne @NotNull
	private Account account;
	
	@Override
	public UserAccount setIdentifier(Object identifier) {
		return (UserAccount) super.setIdentifier(identifier);
	}
	
	@Override
	public UserAccount setCode(String code) {
		return (UserAccount) super.setCode(code);
	}
	
	@Override
	public User getUser() {
		return user;
	}
	
	@Override
	public UserAccount setUser(User user) {
		this.user = user;
		return this;
	}

	@Override
	public Account getAccount() {
		return account;
	}

	@Override
	public UserAccount setAccount(Account account) {
		this.account = account;
		return this;
	}
	
	
	
}

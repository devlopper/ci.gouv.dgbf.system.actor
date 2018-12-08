package ci.gouv.dgbf.system.actor.client.controller.entities.account;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.cyk.utility.client.controller.component.annotation.Input;
import org.cyk.utility.client.controller.component.annotation.InputString;
import org.cyk.utility.client.controller.component.annotation.InputStringLineOne;
import org.cyk.utility.client.controller.data.AbstractDataImpl;

public class CredentialsImpl extends AbstractDataImpl implements Credentials,Serializable {
	private static final long serialVersionUID = 1L;

	@Input @InputString @InputStringLineOne @NotNull
	private String username;
	
	@Input @InputString @InputStringLineOne @NotNull
	private String password;
	
	@Override
	public Credentials setIdentifier(Object identifier) {
		return (Credentials) super.setIdentifier(identifier);
	}
	
	@Override
	public Credentials setCode(String code) {
		return (Credentials) super.setCode(code);
	}
	
	@Override
	public String getUsername() {
		return username;
	}
	
	@Override
	public Credentials setUsername(String username) {
		this.username = username;
		return this;
	}
	
	@Override
	public String getPassword() {
		return password;
	}
	
	@Override
	public Credentials setPassword(String password) {
		this.password = password;
		return this;
	}
	
}

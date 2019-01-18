package ci.gouv.dgbf.system.actor.client.controller.entities.user.account;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.cyk.utility.client.controller.component.annotation.Input;
import org.cyk.utility.client.controller.component.annotation.InputString;
import org.cyk.utility.client.controller.component.annotation.InputStringLineOne;
import org.cyk.utility.client.controller.data.AbstractDataImpl;

public class RoleImpl extends AbstractDataImpl implements Role,Serializable {
	private static final long serialVersionUID = 1L;

	@Input @InputString @InputStringLineOne @NotNull
	private String name;
	
	@Input @InputString @InputStringLineOne @NotNull
	private String description;
	
	@Override
	public Role setIdentifier(Object identifier) {
		return (Role) super.setIdentifier(identifier);
	}
	
	@Override
	public Role setCode(String code) {
		return (Role) super.setCode(code);
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public Role setName(String name) {
		this.name = name;
		return this;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public Role setDescription(String description) {
		this.description = description;
		return this;
	}

	@Override
	public String toString() {
		return getName();
	}
}

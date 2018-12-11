package ci.gouv.dgbf.system.actor.client.controller.entities.software;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.cyk.utility.client.controller.component.annotation.Input;
import org.cyk.utility.client.controller.component.annotation.InputString;
import org.cyk.utility.client.controller.component.annotation.InputStringLineOne;
import org.cyk.utility.client.controller.data.AbstractDataImpl;

public class SoftwareImpl extends AbstractDataImpl implements Software,Serializable {
	private static final long serialVersionUID = 1L;

	@Input @InputString @InputStringLineOne @NotNull
	private String name;
	
	@Input @InputString @InputStringLineOne @NotNull
	private String description;
	
	@Override
	public Software setIdentifier(Object identifier) {
		return (Software) super.setIdentifier(identifier);
	}
	
	@Override
	public Software setCode(String code) {
		return (Software) super.setCode(code);
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public Software setName(String name) {
		this.name = name;
		return this;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public Software setDescription(String description) {
		this.description = description;
		return this;
	}

	@Override
	public String toString() {
		return name;
	}
}

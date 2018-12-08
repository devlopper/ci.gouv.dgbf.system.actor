package ci.gouv.dgbf.system.actor.client.controller.entities.employer;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.cyk.utility.client.controller.component.annotation.Input;
import org.cyk.utility.client.controller.component.annotation.InputString;
import org.cyk.utility.client.controller.component.annotation.InputStringLineOne;
import org.cyk.utility.client.controller.data.AbstractDataImpl;

public class EmployerImpl extends AbstractDataImpl implements Employer,Serializable {
	private static final long serialVersionUID = 1L;

	@Input @InputString @InputStringLineOne @NotNull
	private String name;
	
	@Override
	public Employer setIdentifier(Object identifier) {
		return (Employer) super.setIdentifier(identifier);
	}
	
	@Override
	public Employer setCode(String code) {
		return (Employer) super.setCode(code);
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public Employer setName(String name) {
		this.name = name;
		return this;
	}

}

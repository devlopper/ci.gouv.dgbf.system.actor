package ci.gouv.dgbf.system.actor.client.controller.entities;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.cyk.utility.client.controller.component.annotation.Input;
import org.cyk.utility.client.controller.component.annotation.InputString;
import org.cyk.utility.client.controller.component.annotation.InputStringLineMany;
import org.cyk.utility.client.controller.component.annotation.InputStringLineOne;
import org.cyk.utility.client.controller.data.AbstractDataImpl;

public class FunctionCategoryImpl extends AbstractDataImpl implements FunctionCategory,Serializable {
	private static final long serialVersionUID = 1L;

	@Input @InputString @InputStringLineOne
	@NotNull
	private String name;
	
	@Input @InputString @InputStringLineMany
	private String description;
	
	@Override
	public FunctionCategory setIdentifier(Object identifier) {
		return (FunctionCategory) super.setIdentifier(identifier);
	}
	
	@Override
	public FunctionCategory setCode(String code) {
		return (FunctionCategory) super.setCode(code);
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public FunctionCategory setName(String name) {
		this.name = name;
		return this;
	}
	
	@Override
	public String getDescription() {
		return description;
	}
	
	@Override
	public FunctionCategory setDescription(String description) {
		this.description = description;
		return this;
	}
	
	public static FunctionCategory getByIdentifier(Object identifier) {
		for(FunctionCategory index : FunctionCategory.COLLECTION)
			if(index.getIdentifier().equals(identifier))
				return index;
		return null;
	}
	
}

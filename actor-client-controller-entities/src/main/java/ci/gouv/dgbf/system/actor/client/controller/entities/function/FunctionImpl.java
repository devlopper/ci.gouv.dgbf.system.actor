package ci.gouv.dgbf.system.actor.client.controller.entities.function;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.cyk.utility.client.controller.component.annotation.Input;
import org.cyk.utility.client.controller.component.annotation.InputString;
import org.cyk.utility.client.controller.component.annotation.InputStringLineMany;
import org.cyk.utility.client.controller.component.annotation.InputStringLineOne;
import org.cyk.utility.client.controller.data.AbstractDataImpl;

public class FunctionImpl extends AbstractDataImpl implements Function,Serializable {
	private static final long serialVersionUID = 1L;

	@Input @InputString @InputStringLineOne
	@NotNull
	private String name;
	
	@Input @InputString @InputStringLineMany
	private String description;
	
	//@Input @InputString @InputStringLineOne
	private FunctionCategory category;
	
	@Override
	public Function setIdentifier(Object identifier) {
		return (Function) super.setIdentifier(identifier);
	}
	
	@Override
	public Function setCode(String code) {
		return (Function) super.setCode(code);
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public Function setName(String name) {
		this.name = name;
		return this;
	}
	
	@Override
	public String getDescription() {
		return description;
	}
	
	@Override
	public Function setDescription(String description) {
		this.description = description;
		return this;
	}
	
	@Override
	public FunctionCategory getCategory() {
		return category;
	}
	
	@Override
	public Function setCategory(FunctionCategory category) {
		this.category = category;
		return this;
	}
	
	public static Function getByIdentifier(Object identifier) {
		for(Function index : Function.COLLECTION)
			if(index.getIdentifier().equals(identifier))
				return index;
		return null;
	}
	
	public static Function getByCode(String code) {
		for(Function index : Function.COLLECTION)
			if(index.getCode().equals(code))
				return index;
		return null;
	}
	
}

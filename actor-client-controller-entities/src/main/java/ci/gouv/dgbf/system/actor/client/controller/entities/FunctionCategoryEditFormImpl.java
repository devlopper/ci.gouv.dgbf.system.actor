package ci.gouv.dgbf.system.actor.client.controller.entities;

import java.io.Serializable;

import org.cyk.utility.client.controller.data.AbstractFormDataImpl;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true)
public class FunctionCategoryEditFormImpl extends AbstractFormDataImpl<FunctionCategory> implements FunctionCategoryEditForm,Serializable {
	private static final long serialVersionUID = 1L;
	
}

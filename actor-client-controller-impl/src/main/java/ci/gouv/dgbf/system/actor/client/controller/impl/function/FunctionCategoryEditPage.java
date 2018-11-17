package ci.gouv.dgbf.system.actor.client.controller.impl.function;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.cyk.utility.client.controller.component.window.WindowBuilder;

import ci.gouv.dgbf.system.actor.client.controller.entities.function.FunctionCategoryEditWindowBuilder;
import ci.gouv.dgbf.system.actor.client.controller.impl.AbstractPageContainerManagedImpl;
import lombok.Getter;
import lombok.Setter;

@Named @ViewScoped @Getter @Setter
public class FunctionCategoryEditPage extends AbstractPageContainerManagedImpl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	protected WindowBuilder __getWindowBuilder__() {
		return __inject__(FunctionCategoryEditWindowBuilder.class).execute().getOutput();
	}
	
}

package ci.gouv.dgbf.system.actor.client.controller.impl;

import java.io.Serializable;

import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.cyk.utility.client.controller.component.ComponentRole;
import org.cyk.utility.client.controller.component.command.CommandableBuilder;
import org.cyk.utility.client.controller.component.view.ViewBuilder;
import org.cyk.utility.client.controller.data.Form;

import ci.gouv.dgbf.system.actor.client.controller.entities.FunctionCategory;
import ci.gouv.dgbf.system.actor.client.controller.entities.FunctionCategoryEditForm;
import ci.gouv.dgbf.system.actor.client.controller.entities.FunctionCategoryImpl;
import lombok.Getter;
import lombok.Setter;

@Named @ViewScoped @Getter @Setter
public class FunctionCategoryEditPage extends AbstractPageContainerManagedImpl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	protected String __getWindowTitleValue__() {
		return "Création/Mise à jour/Suppression de catégorie de fonction";
	}
	
	@Override
	protected ViewBuilder __getViewBuilder__() {
		Object identifier = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("identifier");
		Object action = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("action");
		FunctionCategory functionCategory = FunctionCategoryImpl.getByIdentifier(identifier);
		
		FunctionCategoryEditForm form = __inject__(FunctionCategoryEditForm.class);
		form.setData(functionCategory == null ? __inject__(FunctionCategory.class) : functionCategory);
		form.setTitle(__getWindowTitleValue__());
		
		ViewBuilder viewBuilder = __inject__(ViewBuilder.class);
		
		viewBuilder.addComponentBuilderByObjectByFieldNames(form, Form.PROPERTY_TITLE).addRoles(ComponentRole.TITLE);
	
		viewBuilder.addComponentBuilderByObjectByFieldNames(form.getData(), FunctionCategory.PROPERTY_CODE);
		viewBuilder.addComponentBuilderByObjectByFieldNames(form.getData(), FunctionCategory.PROPERTY_NAME);
		viewBuilder.addComponentBuilderByObjectByFieldNames(form.getData(), FunctionCategory.PROPERTY_DESCRIPTION);
		
		CommandableBuilder commandableBuilder = (CommandableBuilder) viewBuilder.addComponentBuilderByObjectByMethodName(form, Form.METHOD_SUBMIT);
		if(action!=null) {
			commandableBuilder.setName(action.toString());	
		}
		
		return viewBuilder;
	}
	
}

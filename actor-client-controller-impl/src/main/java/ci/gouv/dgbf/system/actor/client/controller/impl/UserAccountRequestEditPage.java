package ci.gouv.dgbf.system.actor.client.controller.impl;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.cyk.utility.client.controller.web.jsf.primefaces.AbstractPageContainerManagedImpl;

import lombok.Getter;
import lombok.Setter;

@Named @ViewScoped @Getter @Setter
public class UserAccountRequestEditPage extends AbstractPageContainerManagedImpl implements Serializable {
	private static final long serialVersionUID = 1L;
/*
	private View formView;
	
	@Override
	protected void __listenPostConstruct__() {
		super.__listenPostConstruct__();
		UserAccountRequestEditForm form = __inject__(UserAccountRequestEditForm.class);
		ViewBuilder viewBuilder = __inject__(ViewBuilder.class);
		
		//viewBuilder.addComponentBuilderByObjectByFieldNames(data, "__title__");
		viewBuilder.addComponentBuilderByObjectByFieldNames(form.getData(), UserAccountRequestData.FIELD_FIRST_NAME);
		viewBuilder.addComponentBuilderByObjectByFieldNames(form.getData(), UserAccountRequestData.FIELD_LAST_NAME);
		viewBuilder.addComponentBuilderByObjectByFieldNames(form.getData(), UserAccountRequestData.FIELD_PHONE_NUMBER);
		viewBuilder.addComponentBuilderByObjectByFieldNames(form.getData(), UserAccountRequestData.FIELD_ELECTRONIC_MAIL_ADDRESS);
		viewBuilder.addComponentBuilderByObjectByFieldNames(form.getData(), UserAccountRequestData.FIELD_ADMINISTRATIVE_FUNCTION);
		viewBuilder.addComponentBuilderByObjectByFieldNames(form.getData(), UserAccountRequestData.FIELD_BUDGET_FUNCTION);
		viewBuilder.addComponentBuilderByObjectByFieldNames(form.getData(), UserAccountRequestData.FIELD_USER_NAME);
		viewBuilder.addComponentBuilderByObjectByFieldNames(form.getData(), UserAccountRequestData.FIELD_PASSWORD);
		
		viewBuilder.addComponentBuilderByObjectByMethodName(form, UserAccountRequestEditForm.METHOD_SUBMIT);
		
		formView =  viewBuilder.execute().getOutput();
	}
	*/
}

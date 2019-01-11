package ci.gouv.dgbf.system.actor.client.controller.impl.user.accounts.request;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.cyk.utility.client.controller.component.output.OutputStringTextBuilder;
import org.cyk.utility.client.controller.component.window.WindowBuilder;
import org.cyk.utility.client.controller.web.jsf.primefaces.AbstractPageContainerManagedImpl;
import org.cyk.utility.collection.CollectionHelper;
import org.primefaces.model.DualListModel;

import lombok.Getter;
import lombok.Setter;

@Named @ViewScoped @Getter @Setter
public class UserAccountsRequestCreateByNotConnectedPage extends AbstractPageContainerManagedImpl implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private DualListModel<String> services;
	private DualListModel<String> roles;
	
	@Override
	protected void __listenPostConstruct__() {
		super.__listenPostConstruct__();
		services = new DualListModel<String>((List<String>) __inject__(CollectionHelper.class).instanciate(List.class, "Elaboration","Execution")
        		, new ArrayList<>());
		
		roles = new DualListModel<String>((List<String>) __inject__(CollectionHelper.class).instanciate(List.class, "Administrateur","RPROG","BOP","UO","RUA")
        		, new ArrayList<>());
	}
	
	@Override
	protected WindowBuilder __getWindowBuilder__() {
		WindowBuilder windowBuilder = super.__getWindowBuilder__().setTitleValue("Demande de compte utilisateur");
		OutputStringTextBuilder outputStringText = __inject__(OutputStringTextBuilder.class);
		outputStringText.setValue("SIB | Gestion des acteurs");
		outputStringText.addStyleClasses("application_name");
		windowBuilder.setOutputStringTexts("applicationName",outputStringText);
		return windowBuilder;
	}
	
	public void submit() {
		System.out.println("UserAccountsRequestCreateByNotConnectedPage.submit()");
	}
}

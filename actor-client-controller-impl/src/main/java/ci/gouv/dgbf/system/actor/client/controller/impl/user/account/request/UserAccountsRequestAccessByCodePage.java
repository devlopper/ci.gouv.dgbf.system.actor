package ci.gouv.dgbf.system.actor.client.controller.impl.user.account.request;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.cyk.utility.client.controller.component.output.OutputStringTextBuilder;
import org.cyk.utility.client.controller.component.window.WindowBuilder;
import org.cyk.utility.client.controller.component.window.WindowContainerManagedWindowBuilder;
import org.cyk.utility.client.controller.component.window.WindowContainerManagedWindowBuilderBlank;
import org.cyk.utility.client.controller.web.jsf.primefaces.AbstractPageContainerManagedImpl;

import lombok.Getter;
import lombok.Setter;

@Named @ViewScoped @Getter @Setter
public class UserAccountsRequestAccessByCodePage extends AbstractPageContainerManagedImpl implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String code;
	
	@Override
	protected WindowContainerManagedWindowBuilder __getWindowContainerManagedWindowBuilder__() {
		return __inject__(WindowContainerManagedWindowBuilderBlank.class);
	}
	
	@Override
	protected WindowBuilder __getWindowBuilder__() {
		WindowBuilder windowBuilder = super.__getWindowBuilder__().setTitleValue("Accès à une demande de compte utilisateur");
		OutputStringTextBuilder outputStringText = __inject__(OutputStringTextBuilder.class);
		outputStringText.setValue("SIB | Gestion des acteurs");
		outputStringText.addStyleClasses("application_name");
		windowBuilder.setOutputStringTexts("applicationName",outputStringText);
		return windowBuilder;
	}
	
	public void submit() {
		__renderMessageError__("La demande de compte utilisateur avec pour numéro <<"+code+">> n'existe pas");
	}
}

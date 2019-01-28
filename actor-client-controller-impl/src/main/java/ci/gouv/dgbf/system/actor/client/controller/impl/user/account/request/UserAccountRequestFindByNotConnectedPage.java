package ci.gouv.dgbf.system.actor.client.controller.impl.user.account.request;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.cyk.utility.client.controller.component.window.WindowContainerManagedWindowBuilder;
import org.cyk.utility.client.controller.component.window.WindowContainerManagedWindowBuilderGetter;
import org.cyk.utility.client.controller.web.jsf.primefaces.AbstractPageContainerManagedImpl;
import org.cyk.utility.system.action.SystemAction;
import org.cyk.utility.system.action.SystemActionRedirect;

import ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request.UserAccountRequest;
import lombok.Getter;
import lombok.Setter;

@Named @ViewScoped @Getter @Setter
public class UserAccountRequestFindByNotConnectedPage extends AbstractPageContainerManagedImpl implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected WindowContainerManagedWindowBuilder __getWindowContainerManagedWindowBuilder__() {
		SystemAction systemAction = __inject__(SystemActionRedirect.class);
		systemAction.setEntityClass(UserAccountRequest.class);
		WindowContainerManagedWindowBuilder windowContainerManagedWindowBuilder = __inject__(WindowContainerManagedWindowBuilderGetter.class)
				.setSystemAction(systemAction).execute().getOutput();
		windowContainerManagedWindowBuilder.getWindow(Boolean.TRUE).setTitleValue("Consultation d'une demande de compte utilisateur");
		return windowContainerManagedWindowBuilder;
	}
	
}
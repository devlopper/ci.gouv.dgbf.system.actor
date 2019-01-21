package ci.gouv.dgbf.system.actor.client.controller.impl.user.account.request;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.cyk.utility.client.controller.component.command.CommandableBuilder;
import org.cyk.utility.client.controller.component.layout.Proportions;
import org.cyk.utility.client.controller.component.window.WindowContainerManagedWindowBuilder;
import org.cyk.utility.client.controller.component.window.WindowContainerManagedWindowBuilderGetter;
import org.cyk.utility.client.controller.web.jsf.primefaces.AbstractPageContainerManagedImpl;
import org.cyk.utility.system.action.SystemAction;
import org.cyk.utility.system.action.SystemActionCreate;

import ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request.UserAccountsRequest;
import lombok.Getter;
import lombok.Setter;

@Named @ViewScoped @Getter @Setter
public class UserAccountsRequestCreateByNotConnectedPage extends AbstractPageContainerManagedImpl implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected WindowContainerManagedWindowBuilder __getWindowContainerManagedWindowBuilder__() {
		SystemAction systemAction = __inject__(SystemActionCreate.class);
		systemAction.setEntityClass(UserAccountsRequest.class);
		WindowContainerManagedWindowBuilder windowContainerManagedWindowBuilder = __inject__(WindowContainerManagedWindowBuilderGetter.class)
				.setSystemAction(systemAction).execute().getOutput();
		windowContainerManagedWindowBuilder.getWindow(Boolean.TRUE).setTitleValue("Demande de compte utilisateur");
		Proportions proportions = windowContainerManagedWindowBuilder.getView(Boolean.TRUE).getComponentsBuilder(Boolean.TRUE).getLayout(Boolean.TRUE)
				.getGridRowModel(Boolean.TRUE).getWidthProportions(Boolean.TRUE);
		proportions.set(0,3,1,6,2,3);
		CommandableBuilder commandableBuilder = windowContainerManagedWindowBuilder.getWindow(Boolean.TRUE).getDialog(Boolean.TRUE).getOkCommandable(Boolean.TRUE);
		//commandableBuilder.setName("MyOkButton");
		return windowContainerManagedWindowBuilder;
	}
	
}

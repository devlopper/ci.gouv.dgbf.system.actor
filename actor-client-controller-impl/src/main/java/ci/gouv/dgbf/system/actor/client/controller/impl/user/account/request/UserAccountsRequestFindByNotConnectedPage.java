package ci.gouv.dgbf.system.actor.client.controller.impl.user.account.request;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.cyk.utility.client.controller.component.window.WindowContainerManagedWindowBuilder;
import org.cyk.utility.client.controller.component.window.WindowContainerManagedWindowBuilderGetter;
import org.cyk.utility.client.controller.navigation.NavigationIdentifierToUrlStringMapper;
import org.cyk.utility.client.controller.web.jsf.primefaces.AbstractPageContainerManagedImpl;
import org.cyk.utility.system.action.SystemAction;
import org.cyk.utility.system.action.SystemActionCreate;
import org.cyk.utility.system.action.SystemActionFind;
import org.cyk.utility.system.action.SystemActionOpen;
import org.cyk.utility.system.action.SystemActionRedirect;

import ci.gouv.dgbf.system.actor.client.controller.api.user.account.request.UserAccountsRequestController;
import ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request.UserAccountRequestRedirectWindowBuilderOLD;
import ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request.UserAccountsRequest;
import lombok.Getter;
import lombok.Setter;

@Named @ViewScoped @Getter @Setter
public class UserAccountsRequestFindByNotConnectedPage extends AbstractPageContainerManagedImpl implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String code;
	
	@Override
	protected WindowContainerManagedWindowBuilder __getWindowContainerManagedWindowBuilder__() {
		SystemAction systemAction = __inject__(SystemActionRedirect.class);
		systemAction.setEntityClass(UserAccountsRequest.class);
		WindowContainerManagedWindowBuilder windowContainerManagedWindowBuilder = __inject__(WindowContainerManagedWindowBuilderGetter.class)
				.setSystemAction(systemAction).execute().getOutput();
		windowContainerManagedWindowBuilder.getWindow(Boolean.TRUE).setTitleValue("Consulter une demande de compte utilisateur");
		return windowContainerManagedWindowBuilder;
	}
	
	/*
	@Override
	protected WindowContainerManagedWindowBuilder __getWindowContainerManagedWindowBuilder__() {
		SystemAction systemAction = __inject__(SystemActionRedirect.class);
		systemAction.setEntityClass(UserAccountsRequest.class);
		
		WindowContainerManagedWindowBuilder windowContainerManagedWindowBuilder = __inject__(UserAccountRequestRedirectWindowBuilderOLD.class)
				.setSystemAction(systemAction);
		windowContainerManagedWindowBuilder.getWindow(Boolean.TRUE).setTitleValue("Consulter une demande de compte utilisateur");
		return windowContainerManagedWindowBuilder;
	}
	*/
	public void find() {
		UserAccountsRequest userAccountsRequest = null;
		try {
			userAccountsRequest = __inject__(UserAccountsRequestController.class).readOneByBusinessIdentifier(code);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		if(userAccountsRequest == null)
			__renderMessageError__("La demande de compte utilisateur avec pour code "+code+" n'existe pas.");
		else {
			String url = __inject__(NavigationIdentifierToUrlStringMapper.class).setIdentifier("userAccountsRequestReadByNotConnectedUserView").execute().getOutput()
					+"?entityidentifier="+userAccountsRequest.getIdentifier();
			try {
				FacesContext.getCurrentInstance().getExternalContext().redirect(url);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

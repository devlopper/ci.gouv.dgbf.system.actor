package ci.gouv.dgbf.system.actor.client.controller.impl.user.account.request;
import java.io.Serializable;

import org.cyk.utility.client.controller.component.view.ViewBuilder;
import org.cyk.utility.client.controller.component.window.AbstractWindowContainerManagedWindowBuilderImpl;
import org.cyk.utility.client.controller.component.window.WindowBuilder;
import org.cyk.utility.client.controller.data.Form;
import org.cyk.utility.client.controller.data.Row;
import org.cyk.utility.system.action.SystemAction;

import ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request.UserAccountRequestRedirectWindowBuilderOLD;
import ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request.UserAccountsRequest;
import ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request.UserAccountsRequestEditForm;

public class UserAccountRequestRedirectWindowBuilderImpl extends AbstractWindowContainerManagedWindowBuilderImpl implements UserAccountRequestRedirectWindowBuilderOLD, Serializable {
	private static final long serialVersionUID = 1L;
		
	@Override
	protected void __execute__(WindowBuilder window, SystemAction systemAction, Class<? extends Form> formClass,Class<? extends Row> rowClass) {
		UserAccountsRequestEditForm form = __inject__(UserAccountsRequestEditForm.class);
		form.setData(__inject__(UserAccountsRequest.class));
		ViewBuilder view = window.getView(Boolean.TRUE);
		//view.addComponentBuilderByObjectByFieldNames(form.getData(), Form.PROPERTY_TITLE).addRoles(ComponentRole.TITLE);
		view.addInputBuilderByObjectByFieldNames(form.getData(), systemAction, UserAccountsRequest.PROPERTY_CODE);
		view.addComponentBuilderByObjectByMethodName(form, Form.METHOD_SUBMIT,systemAction);
		setView(view);
	}

}

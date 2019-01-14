package ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request;

import java.io.Serializable;

import org.cyk.utility.client.controller.component.grid.GridBuilder;
import org.cyk.utility.client.controller.component.window.AbstractWindowContainerManagedWindowBuilderSelectDataImpl;
import org.cyk.utility.client.controller.data.RowData;
import org.cyk.utility.system.action.SystemAction;
import org.cyk.utility.system.action.SystemActionCreate;

import ci.gouv.dgbf.system.actor.client.controller.entities.user.accounts.request.UserAccountsRequest;

public class UserAccountRequestSelectWindowBuilderImpl extends AbstractWindowContainerManagedWindowBuilderSelectDataImpl implements UserAccountRequestSelectWindowBuilder, Serializable {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void __listenPostConstruct__() {
		super.__listenPostConstruct__();
		addGridColumnsFieldNamesWithPrefix(RowData.PROPERTY_DATA, UserAccountRequest.PROPERTY_CODE
				,UserAccountRequest.PROPERTY_DATE,UserAccountRequest.PROPERTY_PERSON);
	}
	
	@Override
	protected void __execute__(GridBuilder gridBuilder) {
		/* Create new instance */
		SystemAction systemActionCreate = __inject__(SystemActionCreate.class);
		
		/* Create new instance using normal window */
		gridBuilder.getCreateRowCommandable(Boolean.TRUE).getNavigation(Boolean.TRUE).setIdentifierBuilderSystemAction(systemActionCreate.setEntityClass(UserAccountsRequest.class));
		gridBuilder.getCreateRowCommandable(Boolean.TRUE).setName("Identifier et créer un compte utilisateur");
	}
	
}

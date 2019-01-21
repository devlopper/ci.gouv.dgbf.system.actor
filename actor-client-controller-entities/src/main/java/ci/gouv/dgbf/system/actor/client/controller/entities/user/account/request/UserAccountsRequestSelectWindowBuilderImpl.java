package ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request;

import java.io.Serializable;

import org.cyk.utility.client.controller.component.grid.GridBuilder;
import org.cyk.utility.client.controller.component.window.AbstractWindowContainerManagedWindowBuilderSelectDataImpl;
import org.cyk.utility.client.controller.data.RowData;

public class UserAccountsRequestSelectWindowBuilderImpl extends AbstractWindowContainerManagedWindowBuilderSelectDataImpl implements UserAccountsRequestSelectWindowBuilder, Serializable {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void __listenPostConstruct__() {
		super.__listenPostConstruct__();
		addGridColumnsFieldNamesWithPrefix(RowData.PROPERTY_DATA, UserAccountsRequest.PROPERTY_CODE
				,UserAccountsRequest.PROPERTY_CREATION_DATE,UserAccountsRequest.PROPERTY_NUMBER_OF_PERSON);
	}
	
	@Override
	protected void __execute__(GridBuilder gridBuilder) {
		
	}
	
}

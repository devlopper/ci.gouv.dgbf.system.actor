package ci.gouv.dgbf.system.actor.client.controller.entities.account;
import java.io.Serializable;

import org.cyk.utility.client.controller.component.grid.GridBuilder;
import org.cyk.utility.client.controller.component.window.AbstractWindowContainerManagedWindowBuilderListDataImpl;
import org.cyk.utility.client.controller.data.RowData;

public class AccountListWindowBuilderImpl extends AbstractWindowContainerManagedWindowBuilderListDataImpl implements AccountListWindowBuilder, Serializable {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void __listenPostConstruct__() {
		super.__listenPostConstruct__();
		setRowClass(AccountReadRow.class);
		addGridColumnsFieldNamesWithPrefix(RowData.PROPERTY_DATA,Account.PROPERTY_CREDENTIALS);
	}
	
	@Override
	protected void __execute__(GridBuilder gridBuilder) {
		
	}
	
}

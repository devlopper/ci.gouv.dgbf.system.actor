package ci.gouv.dgbf.system.actor.client.controller.entities.user.account;
import java.io.Serializable;

import org.cyk.utility.client.controller.component.grid.GridBuilder;
import org.cyk.utility.client.controller.component.window.AbstractWindowContainerManagedWindowBuilderListDataImpl;
import org.cyk.utility.client.controller.data.RowData;

public class UserAccountListWindowBuilderImpl extends AbstractWindowContainerManagedWindowBuilderListDataImpl implements UserAccountListWindowBuilder, Serializable {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void __listenPostConstruct__() {
		super.__listenPostConstruct__();
		setRowClass(UserAccountReadRow.class);
		addGridColumnsFieldNamesWithPrefix(RowData.PROPERTY_DATA, UserAccount.PROPERTY_CODE,UserAccount.PROPERTY_FIRST_NAME
				,UserAccount.PROPERTY_LAST_NAMES,UserAccount.PROPERTY_EMPLOYER);
	}
	
	@Override
	protected void __execute__(GridBuilder gridBuilder) {
		
	}
	
}

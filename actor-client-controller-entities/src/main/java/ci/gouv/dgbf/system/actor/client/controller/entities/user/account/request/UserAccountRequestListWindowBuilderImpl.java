package ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request;
import java.io.Serializable;

import org.cyk.utility.client.controller.component.grid.GridBuilder;
import org.cyk.utility.client.controller.component.window.AbstractWindowContainerManagedWindowBuilderListDataImpl;
import org.cyk.utility.client.controller.data.RowData;

public class UserAccountRequestListWindowBuilderImpl extends AbstractWindowContainerManagedWindowBuilderListDataImpl implements UserAccountRequestListWindowBuilder, Serializable {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void __listenPostConstruct__() {
		super.__listenPostConstruct__();
		setRowClass(UserAccountRequestReadRow.class);
		addGridColumnsFieldNamesWithPrefix(RowData.PROPERTY_DATA, UserAccountRequest.PROPERTY_CODE,UserAccountRequest.PROPERTY_FIRST_NAME
				,UserAccountRequest.PROPERTY_LAST_NAMES,UserAccountRequest.PROPERTY_EMPLOYER);
	}
	
	@Override
	protected void __execute__(GridBuilder gridBuilder) {
		
	}
	
}

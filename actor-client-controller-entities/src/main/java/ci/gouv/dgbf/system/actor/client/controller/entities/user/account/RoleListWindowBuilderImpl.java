package ci.gouv.dgbf.system.actor.client.controller.entities.user.account;
import java.io.Serializable;

import org.cyk.utility.client.controller.component.grid.GridBuilder;
import org.cyk.utility.client.controller.component.window.AbstractWindowContainerManagedWindowBuilderListDataImpl;
import org.cyk.utility.client.controller.data.RowData;

public class RoleListWindowBuilderImpl extends AbstractWindowContainerManagedWindowBuilderListDataImpl implements RoleListWindowBuilder, Serializable {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void __listenPostConstruct__() {
		super.__listenPostConstruct__();
		setRowClass(RoleReadRow.class);
		addGridColumnsFieldNamesWithPrefix(RowData.PROPERTY_DATA, Role.PROPERTY_CODE,Role.PROPERTY_NAME);
	}
	
	@Override
	protected void __execute__(GridBuilder gridBuilder) {
		
	}
	
}

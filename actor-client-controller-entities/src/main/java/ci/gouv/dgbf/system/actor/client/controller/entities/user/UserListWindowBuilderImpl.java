package ci.gouv.dgbf.system.actor.client.controller.entities.user;
import java.io.Serializable;

import org.cyk.utility.client.controller.component.grid.GridBuilder;
import org.cyk.utility.client.controller.component.window.AbstractWindowContainerManagedWindowBuilderListDataImpl;
import org.cyk.utility.client.controller.data.RowData;

public class UserListWindowBuilderImpl extends AbstractWindowContainerManagedWindowBuilderListDataImpl implements UserListWindowBuilder, Serializable {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void __listenPostConstruct__() {
		super.__listenPostConstruct__();
		setRowClass(UserReadRow.class);
		addGridColumnsFieldNamesWithPrefix(RowData.PROPERTY_DATA, User.PROPERTY_CODE,User.PROPERTY_FIRST_NAME
				,User.PROPERTY_LAST_NAMES,User.PROPERTY_EMPLOYER);
	}
	
	@Override
	protected void __execute__(GridBuilder gridBuilder) {
		
	}
	
}

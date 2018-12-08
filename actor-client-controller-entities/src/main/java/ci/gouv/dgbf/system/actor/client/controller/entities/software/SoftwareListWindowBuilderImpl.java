package ci.gouv.dgbf.system.actor.client.controller.entities.software;
import java.io.Serializable;

import org.cyk.utility.client.controller.component.grid.GridBuilder;
import org.cyk.utility.client.controller.component.window.AbstractWindowContainerManagedWindowBuilderListDataImpl;
import org.cyk.utility.client.controller.data.RowData;

public class SoftwareListWindowBuilderImpl extends AbstractWindowContainerManagedWindowBuilderListDataImpl implements SoftwareListWindowBuilder, Serializable {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void __listenPostConstruct__() {
		super.__listenPostConstruct__();
		setRowClass(SoftwareReadRow.class);
		addGridColumnsFieldNamesWithPrefix(RowData.PROPERTY_DATA, Software.PROPERTY_CODE,Software.PROPERTY_NAME);
	}
	
	@Override
	protected void __execute__(GridBuilder gridBuilder) {
		
	}
	
}

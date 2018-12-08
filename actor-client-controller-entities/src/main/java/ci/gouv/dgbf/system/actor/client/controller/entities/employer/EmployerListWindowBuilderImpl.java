package ci.gouv.dgbf.system.actor.client.controller.entities.employer;
import java.io.Serializable;

import org.cyk.utility.client.controller.component.grid.GridBuilder;
import org.cyk.utility.client.controller.component.window.AbstractWindowContainerManagedWindowBuilderListDataImpl;
import org.cyk.utility.client.controller.data.RowData;

public class EmployerListWindowBuilderImpl extends AbstractWindowContainerManagedWindowBuilderListDataImpl implements EmployerListWindowBuilder, Serializable {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void __listenPostConstruct__() {
		super.__listenPostConstruct__();
		setRowClass(EmployerReadRow.class);
		addGridColumnsFieldNamesWithPrefix(RowData.PROPERTY_DATA, Employer.PROPERTY_CODE,Employer.PROPERTY_NAME);
	}
	
	@Override
	protected void __execute__(GridBuilder gridBuilder) {
		
	}
	
}

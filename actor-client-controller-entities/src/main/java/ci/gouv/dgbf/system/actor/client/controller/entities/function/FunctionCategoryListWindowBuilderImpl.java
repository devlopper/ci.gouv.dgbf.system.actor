package ci.gouv.dgbf.system.actor.client.controller.entities.function;
import java.io.Serializable;

import org.cyk.utility.client.controller.component.grid.GridBuilder;
import org.cyk.utility.client.controller.component.window.AbstractWindowContainerManagedWindowBuilderListDataImpl;
import org.cyk.utility.client.controller.data.RowData;

public class FunctionCategoryListWindowBuilderImpl extends AbstractWindowContainerManagedWindowBuilderListDataImpl implements FunctionCategoryListWindowBuilder, Serializable {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void __listenPostConstruct__() {
		super.__listenPostConstruct__();
		setRowClass(FunctionCategoryReadRow.class);
		addGridColumnsFieldNamesWithPrefix(RowData.PROPERTY_DATA, FunctionCategory.PROPERTY_CODE,FunctionCategory.PROPERTY_NAME,FunctionCategory.PROPERTY_DESCRIPTION);
		setGridObjects(FunctionCategory.COLLECTION);
	}
	
	@Override
	protected void __execute__(GridBuilder gridBuilder) {
		
	}
	
}

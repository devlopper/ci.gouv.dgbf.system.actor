package ci.gouv.dgbf.system.actor.client.controller.entities.function;
import java.io.Serializable;

import org.cyk.utility.client.controller.component.grid.GridBuilder;
import org.cyk.utility.client.controller.component.window.AbstractWindowContainerManagedWindowBuilderListDataImpl;
import org.cyk.utility.client.controller.data.RowData;

public class FunctionListWindowBuilderImpl extends AbstractWindowContainerManagedWindowBuilderListDataImpl implements FunctionListWindowBuilder, Serializable {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void __listenPostConstruct__() {
		super.__listenPostConstruct__();
		setRowClass(FunctionReadRow.class);
		addGridColumnsFieldNamesWithPrefix(RowData.PROPERTY_DATA, Function.PROPERTY_CODE,Function.PROPERTY_NAME,__injectFieldHelper__().concatenate(Function.PROPERTY_CATEGORY,FunctionCategory.PROPERTY_NAME));
		setGridObjects(Function.COLLECTION);
	}
	
	@Override
	protected void __execute__(GridBuilder gridBuilder) {
		
	}
	
}

package ci.gouv.dgbf.system.actor.client.controller.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.cyk.utility.client.controller.component.grid.GridBuilder;
import org.cyk.utility.client.controller.component.grid.column.ColumnBuilder;
import org.cyk.utility.client.controller.component.layout.LayoutTypeGrid;
import org.cyk.utility.client.controller.component.view.ViewBuilder;
import org.cyk.utility.system.action.SystemActionDelete;
import org.cyk.utility.system.action.SystemActionUpdate;

import ci.gouv.dgbf.system.actor.client.controller.entities.FunctionCategory;
import lombok.Getter;
import lombok.Setter;

@Named @ViewScoped @Getter @Setter
public class FunctionCategoryListPage extends AbstractPageContainerManagedImpl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	protected String __getWindowTitleValue__() {
		return "Liste de catégorie de fonction";
	}
	
	@SuppressWarnings("unchecked")
	@Override
	protected ViewBuilder __getViewBuilder__() {
		@SuppressWarnings({ "rawtypes" })
		GridBuilder gridBuilder = __inject__(GridBuilder.class)
				.addColumns(__inject__(ColumnBuilder.class).setHeaderTextValue("Code").addFieldNameStrings(FunctionCategoryReadRow.PROPERTY_DATA,FunctionCategory.PROPERTY_CODE)
						,__inject__(ColumnBuilder.class).setHeaderTextValue("Nom").addFieldNameStrings(FunctionCategoryReadRow.PROPERTY_DATA,FunctionCategory.PROPERTY_NAME)
						,__inject__(ColumnBuilder.class).setHeaderTextValue("Description").addFieldNameStrings(FunctionCategoryReadRow.PROPERTY_DATA,FunctionCategory.PROPERTY_DESCRIPTION)
						)
				
				.addObjects((Collection)FunctionCategory.COLLECTION)
				;
		
		gridBuilder.getRows(Boolean.TRUE).setRowClass(FunctionCategoryReadRow.class);
		gridBuilder.getCommandablesColumnBodyView(Boolean.TRUE).addNavigationCommandablesBySystemActionClasses(SystemActionUpdate.class,SystemActionDelete.class);
		
		LayoutTypeGrid layoutTypeGrid = __inject__(LayoutTypeGrid.class);
		gridBuilder.getView(Boolean.TRUE).getComponentsBuilder(Boolean.TRUE).getLayout(Boolean.TRUE).setType(layoutTypeGrid);
		layoutTypeGrid.setIsHasHeader(Boolean.TRUE).setIsHasFooter(Boolean.TRUE).setIsHasOrderNumberColumn(Boolean.TRUE).setIsHasCommandablesColumn(Boolean.TRUE);
		
		ViewBuilder viewBuilder = __inject__(ViewBuilder.class);
		viewBuilder.getComponentsBuilder(Boolean.TRUE).setIsCreateLayoutItemOnAddComponent(Boolean.TRUE)
		.addComponents(gridBuilder)
		
		;
		return viewBuilder;
	}
	
	/**/
	
}

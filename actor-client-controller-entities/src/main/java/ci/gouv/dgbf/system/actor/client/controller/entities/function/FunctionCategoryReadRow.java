package ci.gouv.dgbf.system.actor.client.controller.entities.function;

import org.cyk.utility.client.controller.data.RowData;

public interface FunctionCategoryReadRow extends RowData<FunctionCategory> {

	@Override FunctionCategoryReadRow setData(FunctionCategory data);
	
}

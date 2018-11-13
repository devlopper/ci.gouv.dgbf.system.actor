package ci.gouv.dgbf.system.actor.client.controller.impl;

import org.cyk.utility.client.controller.data.RowData;

import ci.gouv.dgbf.system.actor.client.controller.entities.FunctionCategory;

public interface FunctionCategoryReadRow extends RowData<FunctionCategory> {

	@Override FunctionCategoryReadRow setData(FunctionCategory data);
	
}

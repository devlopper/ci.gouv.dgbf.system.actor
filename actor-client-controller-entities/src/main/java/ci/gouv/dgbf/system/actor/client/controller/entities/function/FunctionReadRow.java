package ci.gouv.dgbf.system.actor.client.controller.entities.function;

import org.cyk.utility.client.controller.data.RowData;

public interface FunctionReadRow extends RowData<Function> {

	@Override FunctionReadRow setData(Function data);
	
}

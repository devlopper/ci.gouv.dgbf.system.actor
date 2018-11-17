package ci.gouv.dgbf.system.actor.client.controller.entities.function;
import java.io.Serializable;

import org.cyk.utility.client.controller.data.AbstractRowDataImpl;

public class FunctionCategoryReadRowImpl extends AbstractRowDataImpl<FunctionCategory> implements FunctionCategoryReadRow,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public FunctionCategoryReadRow setData(FunctionCategory data) {
		return (FunctionCategoryReadRow) super.setData(data);
	}
	
}

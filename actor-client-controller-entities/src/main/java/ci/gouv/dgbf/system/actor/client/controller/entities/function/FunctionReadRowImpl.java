package ci.gouv.dgbf.system.actor.client.controller.entities.function;
import java.io.Serializable;

import org.cyk.utility.client.controller.data.AbstractRowDataImpl;

public class FunctionReadRowImpl extends AbstractRowDataImpl<Function> implements FunctionReadRow,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public FunctionReadRow setData(Function data) {
		return (FunctionReadRow) super.setData(data);
	}
	
}

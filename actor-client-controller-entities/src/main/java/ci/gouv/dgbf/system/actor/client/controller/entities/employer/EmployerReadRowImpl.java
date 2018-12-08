package ci.gouv.dgbf.system.actor.client.controller.entities.employer;
import java.io.Serializable;

import org.cyk.utility.client.controller.data.AbstractRowDataImpl;

public class EmployerReadRowImpl extends AbstractRowDataImpl<Employer> implements EmployerReadRow,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public EmployerReadRow setData(Employer data) {
		return (EmployerReadRow) super.setData(data);
	}
	
}

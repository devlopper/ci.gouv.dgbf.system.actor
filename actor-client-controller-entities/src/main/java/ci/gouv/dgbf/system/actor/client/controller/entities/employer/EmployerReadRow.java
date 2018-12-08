package ci.gouv.dgbf.system.actor.client.controller.entities.employer;

import org.cyk.utility.client.controller.data.RowData;

public interface EmployerReadRow extends RowData<Employer> {

	@Override EmployerReadRow setData(Employer data);
	
}

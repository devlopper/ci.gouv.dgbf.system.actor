package ci.gouv.dgbf.system.actor.client.controller.entities.software;

import org.cyk.utility.client.controller.data.RowData;

public interface SoftwareReadRow extends RowData<Software> {

	@Override SoftwareReadRow setData(Software data);
	
}

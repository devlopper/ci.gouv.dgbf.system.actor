package ci.gouv.dgbf.system.actor.client.controller.entities.service;

import org.cyk.utility.client.controller.data.RowData;

public interface ServiceReadRow extends RowData<Service> {

	@Override ServiceReadRow setData(Service data);
	
}

package ci.gouv.dgbf.system.actor.client.controller.entities.service;
import java.io.Serializable;

import org.cyk.utility.client.controller.data.AbstractRowDataImpl;

public class ServiceReadRowImpl extends AbstractRowDataImpl<Service> implements ServiceReadRow,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public ServiceReadRow setData(Service data) {
		return (ServiceReadRow) super.setData(data);
	}
	
}

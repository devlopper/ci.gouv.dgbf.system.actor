package ci.gouv.dgbf.system.actor.client.controller.entities.software;
import java.io.Serializable;

import org.cyk.utility.client.controller.data.AbstractRowDataImpl;

public class SoftwareReadRowImpl extends AbstractRowDataImpl<Software> implements SoftwareReadRow,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public SoftwareReadRow setData(Software data) {
		return (SoftwareReadRow) super.setData(data);
	}
	
}

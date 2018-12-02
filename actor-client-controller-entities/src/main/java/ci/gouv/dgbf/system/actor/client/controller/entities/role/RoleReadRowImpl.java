package ci.gouv.dgbf.system.actor.client.controller.entities.role;
import java.io.Serializable;

import org.cyk.utility.client.controller.data.AbstractRowDataImpl;

public class RoleReadRowImpl extends AbstractRowDataImpl<Role> implements RoleReadRow,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public RoleReadRow setData(Role data) {
		return (RoleReadRow) super.setData(data);
	}
	
}

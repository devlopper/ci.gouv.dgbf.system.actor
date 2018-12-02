package ci.gouv.dgbf.system.actor.client.controller.entities.role;

import org.cyk.utility.client.controller.data.RowData;

public interface RoleReadRow extends RowData<Role> {

	@Override RoleReadRow setData(Role data);
	
}

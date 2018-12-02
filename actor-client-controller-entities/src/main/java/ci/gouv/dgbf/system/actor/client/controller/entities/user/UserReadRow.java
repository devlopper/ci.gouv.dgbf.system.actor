package ci.gouv.dgbf.system.actor.client.controller.entities.user;

import org.cyk.utility.client.controller.data.RowData;

public interface UserReadRow extends RowData<User> {

	@Override UserReadRow setData(User data);
	
}

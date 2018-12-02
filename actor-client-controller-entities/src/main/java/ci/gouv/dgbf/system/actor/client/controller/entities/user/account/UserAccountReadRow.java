package ci.gouv.dgbf.system.actor.client.controller.entities.user.account;

import org.cyk.utility.client.controller.data.RowData;

public interface UserAccountReadRow extends RowData<UserAccount> {

	@Override UserAccountReadRow setData(UserAccount data);
	
}

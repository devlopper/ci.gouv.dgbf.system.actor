package ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request;

import org.cyk.utility.client.controller.data.RowData;

public interface UserAccountRequestReadRow extends RowData<UserAccountRequest> {

	@Override UserAccountRequestReadRow setData(UserAccountRequest data);
	
}

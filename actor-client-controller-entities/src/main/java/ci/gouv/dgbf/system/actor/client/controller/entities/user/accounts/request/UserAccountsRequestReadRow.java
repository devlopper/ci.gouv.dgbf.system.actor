package ci.gouv.dgbf.system.actor.client.controller.entities.user.accounts.request;

import org.cyk.utility.client.controller.data.RowData;

public interface UserAccountsRequestReadRow extends RowData<UserAccountsRequest> {

	@Override UserAccountsRequestReadRow setData(UserAccountsRequest data);
	
}

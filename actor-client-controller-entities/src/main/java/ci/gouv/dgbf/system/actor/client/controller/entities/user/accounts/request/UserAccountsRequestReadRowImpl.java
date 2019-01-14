package ci.gouv.dgbf.system.actor.client.controller.entities.user.accounts.request;
import java.io.Serializable;

import org.cyk.utility.client.controller.data.AbstractRowDataImpl;

public class UserAccountsRequestReadRowImpl extends AbstractRowDataImpl<UserAccountsRequest> implements UserAccountsRequestReadRow,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public UserAccountsRequestReadRow setData(UserAccountsRequest data) {
		return (UserAccountsRequestReadRow) super.setData(data);
	}
	
}

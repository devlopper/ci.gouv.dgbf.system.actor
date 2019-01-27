package ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request;
import java.io.Serializable;

import org.cyk.utility.client.controller.data.AbstractRowDataImpl;

public class UserAccountRequestReadRowImpl extends AbstractRowDataImpl<UserAccountRequest> implements UserAccountRequestReadRow,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public UserAccountRequestReadRow setData(UserAccountRequest data) {
		return (UserAccountRequestReadRow) super.setData(data);
	}
	
}

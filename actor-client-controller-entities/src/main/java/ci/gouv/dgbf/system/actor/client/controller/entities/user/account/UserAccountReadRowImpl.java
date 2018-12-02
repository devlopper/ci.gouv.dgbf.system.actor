package ci.gouv.dgbf.system.actor.client.controller.entities.user.account;
import java.io.Serializable;

import org.cyk.utility.client.controller.data.AbstractRowDataImpl;

public class UserAccountReadRowImpl extends AbstractRowDataImpl<UserAccount> implements UserAccountReadRow,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public UserAccountReadRow setData(UserAccount data) {
		return (UserAccountReadRow) super.setData(data);
	}
	
}

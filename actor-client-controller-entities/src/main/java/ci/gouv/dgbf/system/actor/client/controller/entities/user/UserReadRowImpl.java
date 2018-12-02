package ci.gouv.dgbf.system.actor.client.controller.entities.user;
import java.io.Serializable;

import org.cyk.utility.client.controller.data.AbstractRowDataImpl;

public class UserReadRowImpl extends AbstractRowDataImpl<User> implements UserReadRow,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public UserReadRow setData(User data) {
		return (UserReadRow) super.setData(data);
	}
	
}

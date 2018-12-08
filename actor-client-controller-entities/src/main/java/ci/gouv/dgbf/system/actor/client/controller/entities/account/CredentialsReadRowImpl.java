package ci.gouv.dgbf.system.actor.client.controller.entities.account;
import java.io.Serializable;

import org.cyk.utility.client.controller.data.AbstractRowDataImpl;

public class CredentialsReadRowImpl extends AbstractRowDataImpl<Credentials> implements CredentialsReadRow,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public CredentialsReadRow setData(Credentials data) {
		return (CredentialsReadRow) super.setData(data);
	}
	
}

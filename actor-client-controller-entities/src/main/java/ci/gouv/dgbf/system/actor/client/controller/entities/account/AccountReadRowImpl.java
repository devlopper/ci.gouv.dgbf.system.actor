package ci.gouv.dgbf.system.actor.client.controller.entities.account;
import java.io.Serializable;

import org.cyk.utility.client.controller.data.AbstractRowDataImpl;

public class AccountReadRowImpl extends AbstractRowDataImpl<Account> implements AccountReadRow,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public AccountReadRow setData(Account data) {
		return (AccountReadRow) super.setData(data);
	}
	
}

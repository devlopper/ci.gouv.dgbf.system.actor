package ci.gouv.dgbf.system.actor.client.controller.entities.account;

import org.cyk.utility.client.controller.data.RowData;

public interface AccountReadRow extends RowData<Account> {

	@Override AccountReadRow setData(Account data);
	
}

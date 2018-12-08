package ci.gouv.dgbf.system.actor.client.controller.entities.account;

import org.cyk.utility.client.controller.data.RowData;

public interface CredentialsReadRow extends RowData<Credentials> {

	@Override CredentialsReadRow setData(Credentials data);
	
}

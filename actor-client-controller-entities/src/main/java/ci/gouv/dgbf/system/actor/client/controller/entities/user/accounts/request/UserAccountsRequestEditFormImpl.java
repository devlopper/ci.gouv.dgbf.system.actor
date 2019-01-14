package ci.gouv.dgbf.system.actor.client.controller.entities.user.accounts.request;

import java.io.Serializable;

import org.cyk.utility.client.controller.data.AbstractFormDataImpl;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true)
public class UserAccountsRequestEditFormImpl extends AbstractFormDataImpl<UserAccountsRequest> implements UserAccountsRequestEditForm,Serializable {
	private static final long serialVersionUID = 1L;
	
}

package ci.gouv.dgbf.system.actor.client.controller.entities.account;

import java.io.Serializable;

import org.cyk.utility.client.controller.data.AbstractFormDataImpl;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true)
public class AccountEditFormImpl extends AbstractFormDataImpl<Account> implements AccountEditForm,Serializable {
	private static final long serialVersionUID = 1L;
	
}

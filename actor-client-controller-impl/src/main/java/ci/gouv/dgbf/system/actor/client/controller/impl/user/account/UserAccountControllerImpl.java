package ci.gouv.dgbf.system.actor.client.controller.impl.user.account;

import java.io.Serializable;
import java.util.Collection;

import javax.inject.Singleton;

import org.cyk.utility.__kernel__.DependencyInjection;
import org.cyk.utility.client.controller.AbstractControllerEntityPersistedInCollectionImpl;
import org.cyk.utility.collection.CollectionHelper;

import ci.gouv.dgbf.system.actor.client.controller.api.user.account.UserAccountController;
import ci.gouv.dgbf.system.actor.client.controller.entities.user.account.UserAccount;

@Singleton
public class UserAccountControllerImpl extends AbstractControllerEntityPersistedInCollectionImpl<UserAccount> implements UserAccountController,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	protected Collection<UserAccount> __getInitialCollection__() {
		return __inject__(CollectionHelper.class).instanciate(
				DependencyInjection.inject(UserAccount.class).setIdentifier("1").setCode("DC0001")
				
				,DependencyInjection.inject(UserAccount.class).setIdentifier("2").setCode("DC0002")
				);
	}
	
}

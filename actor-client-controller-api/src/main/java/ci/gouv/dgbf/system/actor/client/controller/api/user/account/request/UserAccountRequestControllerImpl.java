package ci.gouv.dgbf.system.actor.client.controller.api.user.account.request;

import java.io.Serializable;
import java.util.Collection;

import javax.inject.Singleton;

import org.cyk.utility.__kernel__.DependencyInjection;
import org.cyk.utility.client.controller.AbstractControllerEntityPersistedInCollectionImpl;
import org.cyk.utility.collection.CollectionHelper;

import ci.gouv.dgbf.system.actor.client.controller.api.function.FunctionController;
import ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request.UserAccountRequest;

@Singleton
public class UserAccountRequestControllerImpl extends AbstractControllerEntityPersistedInCollectionImpl<UserAccountRequest> implements UserAccountRequestController,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	protected Collection<UserAccountRequest> __getInitialCollection__() {
		return __inject__(CollectionHelper.class).instanciate(
				DependencyInjection.inject(UserAccountRequest.class).setIdentifier("1").setCode("DC0001").setFirstName("Zadi").setLastNames("Jean Jacques")
				.setEmployer("Fonction publique").setEmployeeIdentifier("2001005").setFunction(__inject__(FunctionController.class).readOneByBusinessIdentifier("CHARGE_ETUDE"))
				.setHierarchyFirstName("Koffi").setHierarchyLastNames("Paul")
				
				,DependencyInjection.inject(UserAccountRequest.class).setIdentifier("2").setCode("DC0002").setFirstName("Kadio").setLastNames("Marc")
				.setEmployer("FMI").setEmployeeIdentifier("FM035").setFunction(__inject__(FunctionController.class).readOneByBusinessIdentifier("OBSERVATEUR"))
				.setHierarchyFirstName("Harry").setHierarchyLastNames("John")
				);
	}
	
}

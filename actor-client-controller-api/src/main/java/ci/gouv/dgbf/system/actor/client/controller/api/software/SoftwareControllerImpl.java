package ci.gouv.dgbf.system.actor.client.controller.api.software;

import java.io.Serializable;
import java.util.Collection;

import javax.inject.Singleton;

import org.cyk.utility.__kernel__.DependencyInjection;
import org.cyk.utility.client.controller.AbstractControllerEntityPersistedInCollectionImpl;
import org.cyk.utility.collection.CollectionHelper;

import ci.gouv.dgbf.system.actor.client.controller.entities.software.Software;

@Singleton
public class SoftwareControllerImpl extends AbstractControllerEntityPersistedInCollectionImpl<Software> implements SoftwareController,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	protected Collection<Software> __getInitialCollection__() {
		return __inject__(CollectionHelper.class).instanciate(
				DependencyInjection.inject(Software.class).setIdentifier("1").setCode("ELB").setName("Elaboration du budget")
				,DependencyInjection.inject(Software.class).setIdentifier("2").setCode("EXB").setName("Exécution du budget")
				);
	}
	
}

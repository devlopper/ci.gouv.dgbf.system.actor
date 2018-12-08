package ci.gouv.dgbf.system.actor.client.controller.api.employer;

import java.io.Serializable;
import java.util.Collection;

import javax.inject.Singleton;

import org.cyk.utility.client.controller.AbstractControllerEntityPersistedInCollectionImpl;
import org.cyk.utility.collection.CollectionHelper;

import ci.gouv.dgbf.system.actor.client.controller.entities.employer.Employer;

@Singleton
public class EmployerControllerImpl extends AbstractControllerEntityPersistedInCollectionImpl<Employer> implements EmployerController,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	protected Collection<Employer> __getInitialCollection__() {
		return __inject__(CollectionHelper.class).instanciate(
				__inject__(Employer.class).setIdentifier("1").setCode("FPCI").setName("Fonction Publique de Côte d'Ivoire")
				,__inject__(Employer.class).setIdentifier("2").setCode("FMI").setName("Fonds Monétaire International")
				);
	}
	
}

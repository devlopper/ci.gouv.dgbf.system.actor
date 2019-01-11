package ci.gouv.dgbf.system.actor.client.controller.api.user.account.request;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.inject.Singleton;

import org.cyk.utility.client.controller.AbstractControllerEntityPersistedInCollectionImpl;
import org.cyk.utility.collection.CollectionHelper;

import ci.gouv.dgbf.system.actor.client.controller.entities.employer.Employer;
import ci.gouv.dgbf.system.actor.client.controller.entities.person.Person;
import ci.gouv.dgbf.system.actor.client.controller.entities.person.Sex;
import ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request.UserAccountRequest;

@Singleton
public class UserAccountRequestControllerImpl extends AbstractControllerEntityPersistedInCollectionImpl<UserAccountRequest> implements UserAccountRequestController,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	protected Collection<UserAccountRequest> __getInitialCollection__() {
		return __inject__(CollectionHelper.class).instanciate(
				__inject__(UserAccountRequest.class).setIdentifier("1").setCode("DC0001").setDate(new Date())
				.setPerson(__inject__(Person.class).setFirstName("Zadi").setLastNames("Jean Jacques").setSex(Sex.MASCULIN).setElectronicMailAddress("zadi@mail.com")
						.setPhoneNumber("11223344").setEmployer(__inject__(Employer.class).setCode("FP").setName("Fonction Publique"))
				.setEmployeeIdentifier("2001005").setPostalBoxAddress("BP Abidjan").setFunction("Chargé d'étude")
				)
				
				);
	}
	
}

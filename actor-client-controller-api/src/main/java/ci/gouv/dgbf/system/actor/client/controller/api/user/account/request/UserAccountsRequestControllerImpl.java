package ci.gouv.dgbf.system.actor.client.controller.api.user.account.request;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

import javax.inject.Singleton;

import org.cyk.utility.client.controller.AbstractControllerEntityPersistedInCollectionImpl;
import org.cyk.utility.collection.CollectionHelper;

import ci.gouv.dgbf.system.actor.client.controller.api.role.RoleController;
import ci.gouv.dgbf.system.actor.client.controller.api.service.ServiceController;
import ci.gouv.dgbf.system.actor.client.controller.entities.employer.Employer;
import ci.gouv.dgbf.system.actor.client.controller.entities.person.Person;
import ci.gouv.dgbf.system.actor.client.controller.entities.person.Sex;
import ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request.UserAccountsRequest;

@Singleton
public class UserAccountsRequestControllerImpl extends AbstractControllerEntityPersistedInCollectionImpl<UserAccountsRequest> implements UserAccountsRequestController,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	protected Collection<UserAccountsRequest> __getInitialCollection__() {
		return __inject__(CollectionHelper.class).instanciate(
				__inject__(UserAccountsRequest.class).setIdentifier("1").setCode("DC0001").setDate(new Date())
				.addPersons(__inject__(Person.class).setFirstName("Zadi").setLastNames("Jean Jacques").setSex(Sex.MASCULIN).setElectronicMailAddress("zadi@mail.com")
						.setPhoneNumber("11223344").setEmployer(__inject__(Employer.class).setCode("FP").setName("Fonction Publique"))
				.setEmployeeIdentifier("2001005").setPostalBoxAddress("BP Abidjan").setFunction("Chargé d'étude")
				)
				.setServices(Arrays.asList(__inject__(ServiceController.class).readOneByBusinessIdentifier("ELB")))
				.setRoles(Arrays.asList(__inject__(RoleController.class).readOneByBusinessIdentifier("CHARGE_ETUDE")))
				
				,__inject__(UserAccountsRequest.class).setIdentifier("2").setCode("DC0002").setDate(new Date())
				.addPersons(__inject__(Person.class).setFirstName("Kadio").setLastNames("Marc").setSex(Sex.MASCULIN).setElectronicMailAddress("kadio@mail.com")
						.setPhoneNumber("99887766").setPostalBoxAddress("BP Bouaké").setEmployer(__inject__(Employer.class).setCode("FMI").setName("Fond Monétaire International"))
				.setEmployeeIdentifier("FM035").setFunction("Directeur des opérations")
				,__inject__(Person.class).setFirstName("Obou").setLastNames("Jeanne").setSex(Sex.FEMININ).setElectronicMailAddress("obou@mail.com")
					.setPhoneNumber("55663322").setPostalBoxAddress("BP Abidjan").setEmployer(__inject__(Employer.class).setCode("FMI").setName("Fond Monétaire International"))
					.setEmployeeIdentifier("FM036").setFunction("Chef de délégation")
				)
				.setServices(Arrays.asList(__inject__(ServiceController.class).readOneByBusinessIdentifier("ELB"),__inject__(ServiceController.class).readOneByBusinessIdentifier("EXB")))
				.setRoles(Arrays.asList(__inject__(RoleController.class).readOneByBusinessIdentifier("ASSISTANT")))
				
				);
	}
	
}

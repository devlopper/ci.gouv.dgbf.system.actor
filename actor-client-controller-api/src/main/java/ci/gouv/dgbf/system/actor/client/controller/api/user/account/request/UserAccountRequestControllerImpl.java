package ci.gouv.dgbf.system.actor.client.controller.api.user.account.request;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

import javax.inject.Singleton;

import org.cyk.utility.client.controller.AbstractControllerEntityPersistedInCollectionImpl;
import org.cyk.utility.collection.CollectionHelper;

import ci.gouv.dgbf.system.actor.client.controller.api.function.FunctionController;
import ci.gouv.dgbf.system.actor.client.controller.api.role.RoleController;
import ci.gouv.dgbf.system.actor.client.controller.api.software.SoftwareController;
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
				.setPerson(__inject__(Person.class).setFirstName("Zadi").setLastNames("Jean Jacques").setSex(Sex.MASCULINE).setElectronicMailAddress("zadi@mail.com")
						.setPhoneNumber("11223344").setEmployer(__inject__(Employer.class).setCode("FP").setName("Fonction Publique"))
				.setEmployeeIdentifier("2001005").setPostalBoxAddress("BP Abidjan").setFunction(__inject__(FunctionController.class).readOneByBusinessIdentifier("CHARGE_ETUDE"))
				.setHierarchy(__inject__(Person.class).setFirstName("Koffi").setLastNames("Paul")))
				.setSoftwares(Arrays.asList(__inject__(SoftwareController.class).readOneByBusinessIdentifier("ELB")))
				.setRoles(Arrays.asList(__inject__(RoleController.class).readOneByBusinessIdentifier("CHARGE_ETUDE")))
				
				,__inject__(UserAccountRequest.class).setIdentifier("2").setCode("DC0002").setDate(new Date())
				.setPerson(__inject__(Person.class).setFirstName("Kadio").setLastNames("Marc").setSex(Sex.MASCULINE).setElectronicMailAddress("kadio@mail.com")
						.setPhoneNumber("99887766").setPostalBoxAddress("BP Bouaké").setEmployer(__inject__(Employer.class).setCode("FMI").setName("Fond Monétaire International"))
				.setEmployeeIdentifier("FM035").setFunction(__inject__(FunctionController.class).readOneByBusinessIdentifier("OBSERVATEUR"))
				.setHierarchy(__inject__(Person.class).setFirstName("Harry").setLastNames("John")))
				.setSoftwares(Arrays.asList(__inject__(SoftwareController.class).readOneByBusinessIdentifier("ELB"),__inject__(SoftwareController.class).readOneByBusinessIdentifier("EXB")))
				.setRoles(Arrays.asList(__inject__(RoleController.class).readOneByBusinessIdentifier("ASSISTANT")))
				.setComments("Je suis un agent du FMI")
				);
	}
	
}

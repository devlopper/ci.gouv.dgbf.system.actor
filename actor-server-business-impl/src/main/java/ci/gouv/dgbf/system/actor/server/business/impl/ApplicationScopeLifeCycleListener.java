package ci.gouv.dgbf.system.actor.server.business.impl;
import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;

import org.cyk.utility.__kernel__.AbstractApplicationScopeLifeCycleListener;
import org.cyk.utility.collection.CollectionHelper;

import ci.gouv.dgbf.system.actor.server.business.api.user.account.RoleBusiness;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.Role;

@ApplicationScoped
public class ApplicationScopeLifeCycleListener extends AbstractApplicationScopeLifeCycleListener implements Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public void __initialize__(Object object) {
		__inject__(RoleBusiness.class).createMany(__inject__(CollectionHelper.class).instanciate(
				new Role().setCode("ADMINISTRATEUR").setName("Administrateur")
				,new Role().setCode("ASSISTANT").setName("Assistants")
				,new Role().setCode("CHARGE_ETUDE").setName("Chargés d’études")
				,new Role().setCode("COORDONNATEUR").setName("Coordonnateur")
				,new Role().setCode("DIRECTEUR").setName("Directeur")
				,new Role().setCode("AGENT_SAISIE").setName("Agent de saisie")
				,new Role().setCode("RUA").setName("Responsable d’unité administrative")
				,new Role().setCode("OBSERVATEUR").setName("Observateur")
				,new Role().setCode("RPROG").setName("Responsable de programme")
				,new Role().setCode("RBOP").setName("Responsable de budget opérationnel de programme")
				,new Role().setCode("RUO").setName("Responsable d’unité opérationnelle")
				,new Role().setCode("RFFIM").setName("Responsable de la fonction financière du ministère")
				,new Role().setCode("AC").setName("Administrateurs de crédits")
				,new Role().setCode("OP").setName("Ordonnateur principal")
				,new Role().setCode("OD").setName("Ordonnateur délégué")
				,new Role().setCode("CF").setName("Contrôleur financier")
				,new Role().setCode("CB").setName("Contrôleur budgétaire")
				,new Role().setCode("CA").setName("Comptable Assignataire")
				));
		
		/*
		UserAccountsRequest userAccountsRequest = new UserAccountsRequest();
		userAccountsRequest.addPersons(new Person().setFirstName("Komenan").setLastNames("Yao Christian").setElectronicMailAddress("dgbfdtideveloppers@gmail.com").setPhoneNumber("07625658")
				.setIsMasculine(Boolean.TRUE).setAdministrativeUnit("DGBF").setFunction("Chargé d'études"));
		userAccountsRequest.addRoles(__inject__(RolePersistence.class).readByCode("ADMINISTRATEUR"),__inject__(RolePersistence.class).readByCode("CHARGE_ETUDE"));
		userAccountsRequest.addServices("ELB");
		userAccountsRequest.setLetter("Ma lettre");
		__inject__(UserAccountsRequestBusiness.class).create(userAccountsRequest);
		*/
	}
	
	@Override
	public void __destroy__(Object object) {}
	
}

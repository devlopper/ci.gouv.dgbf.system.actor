package ci.gouv.dgbf.system.actor.client.controller.api.role;

import java.io.Serializable;
import java.util.Collection;

import javax.inject.Singleton;

import org.cyk.utility.__kernel__.DependencyInjection;
import org.cyk.utility.client.controller.AbstractControllerEntityPersistedInCollectionImpl;
import org.cyk.utility.collection.CollectionHelper;

import ci.gouv.dgbf.system.actor.client.controller.entities.role.Role;

@Singleton
public class RoleControllerImpl extends AbstractControllerEntityPersistedInCollectionImpl<Role> implements RoleController,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	protected Collection<Role> __getInitialCollection__() {
		return __inject__(CollectionHelper.class).instanciate(
				DependencyInjection.inject(Role.class).setIdentifier("1").setCode("ADMINISTRATEUR").setName("Administrateurs")
				,DependencyInjection.inject(Role.class).setIdentifier("2").setCode("ASSISTANT").setName("Assistants")
				,DependencyInjection.inject(Role.class).setIdentifier("3").setCode("CHARGE_ETUDE").setName("Chargés d’études")
				,DependencyInjection.inject(Role.class).setIdentifier("4").setCode("COORDONNATEUR").setName("Coordonnateurs")
				,DependencyInjection.inject(Role.class).setIdentifier("5").setCode("DIRECTEUR").setName("Directeur")
				,DependencyInjection.inject(Role.class).setIdentifier("6").setCode("AGENT_SAISIE").setName("Agents de saisie")
				,DependencyInjection.inject(Role.class).setIdentifier("7").setCode("RUA").setName("Responsable d’unité administrative")
				,DependencyInjection.inject(Role.class).setIdentifier("8").setCode("OBSERVATEUR").setName("Observateurs")
				,DependencyInjection.inject(Role.class).setIdentifier("9").setCode("RPROG").setName("Responsable de programme")
				,DependencyInjection.inject(Role.class).setIdentifier("10").setCode("RBOP").setName("Responsable de budget opérationnel de programme")
				,DependencyInjection.inject(Role.class).setIdentifier("11").setCode("RUO").setName("Responsable d’unité opérationnelle")
				,DependencyInjection.inject(Role.class).setIdentifier("12").setCode("RFFIM").setName("Responsable de la fonction financière du ministère")
				,DependencyInjection.inject(Role.class).setIdentifier("13").setCode("AC").setName("Administrateurs de crédits")
				,DependencyInjection.inject(Role.class).setIdentifier("14").setCode("OP").setName("Ordonnateur principal")
				,DependencyInjection.inject(Role.class).setIdentifier("15").setCode("OD").setName("Ordonnateurs délégué")
				,DependencyInjection.inject(Role.class).setIdentifier("16").setCode("CF").setName("Contrôleurs financier")
				,DependencyInjection.inject(Role.class).setIdentifier("17").setCode("CB").setName("Contrôleurs budgétaires")
				,DependencyInjection.inject(Role.class).setIdentifier("18").setCode("CA").setName("Comptables Assignataires")
				);
	}
	
}

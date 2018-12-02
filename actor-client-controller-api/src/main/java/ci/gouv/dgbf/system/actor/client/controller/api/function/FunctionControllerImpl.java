package ci.gouv.dgbf.system.actor.client.controller.api.function;

import java.io.Serializable;
import java.util.Collection;

import javax.inject.Singleton;

import org.cyk.utility.__kernel__.DependencyInjection;
import org.cyk.utility.client.controller.AbstractControllerEntityPersistedInCollectionImpl;
import org.cyk.utility.collection.CollectionHelper;

import ci.gouv.dgbf.system.actor.client.controller.entities.function.Function;

@Singleton
public class FunctionControllerImpl extends AbstractControllerEntityPersistedInCollectionImpl<Function> implements FunctionController,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	protected Collection<Function> __getInitialCollection__() {
		return __inject__(CollectionHelper.class).instanciate(
				DependencyInjection.inject(Function.class).setIdentifier("1").setCode("ADMINISTRATEUR").setName("Administrateurs").setCategory(__inject__(FunctionCategoryController.class).readOneByBusinessIdentifier("ADM"))
				,DependencyInjection.inject(Function.class).setIdentifier("2").setCode("ASSISTANT").setName("Assistants").setCategory(__inject__(FunctionCategoryController.class).readOneByBusinessIdentifier("ADM"))
				,DependencyInjection.inject(Function.class).setIdentifier("3").setCode("CHARGE_ETUDE").setName("Chargés d’études").setCategory(__inject__(FunctionCategoryController.class).readOneByBusinessIdentifier("ADM"))
				,DependencyInjection.inject(Function.class).setIdentifier("4").setCode("COORDONNATEUR").setName("Coordonnateurs").setCategory(__inject__(FunctionCategoryController.class).readOneByBusinessIdentifier("ADM"))
				,DependencyInjection.inject(Function.class).setIdentifier("5").setCode("DIRECTEUR").setName("Directeur").setCategory(__inject__(FunctionCategoryController.class).readOneByBusinessIdentifier("ADM"))
				,DependencyInjection.inject(Function.class).setIdentifier("6").setCode("AGENT_SAISIE").setName("Agents de saisie").setCategory(__inject__(FunctionCategoryController.class).readOneByBusinessIdentifier("ADM"))
				,DependencyInjection.inject(Function.class).setIdentifier("7").setCode("RUA").setName("Responsable d’unité administrative").setCategory(__inject__(FunctionCategoryController.class).readOneByBusinessIdentifier("ADM"))
				,DependencyInjection.inject(Function.class).setIdentifier("8").setCode("OBSERVATEUR").setName("Observateurs").setCategory(__inject__(FunctionCategoryController.class).readOneByBusinessIdentifier("ADM"))
				,DependencyInjection.inject(Function.class).setIdentifier("9").setCode("RPROG").setName("Responsable de programme").setCategory(__inject__(FunctionCategoryController.class).readOneByBusinessIdentifier("BUD"))
				,DependencyInjection.inject(Function.class).setIdentifier("10").setCode("RBOP").setName("Responsable de budget opérationnel de programme").setCategory(__inject__(FunctionCategoryController.class).readOneByBusinessIdentifier("BUD"))
				,DependencyInjection.inject(Function.class).setIdentifier("11").setCode("RUO").setName("Responsable d’unité opérationnelle").setCategory(__inject__(FunctionCategoryController.class).readOneByBusinessIdentifier("BUD"))
				,DependencyInjection.inject(Function.class).setIdentifier("12").setCode("RFFIM").setName("Responsable de la fonction financière du ministère").setCategory(__inject__(FunctionCategoryController.class).readOneByBusinessIdentifier("BUD"))
				,DependencyInjection.inject(Function.class).setIdentifier("13").setCode("AC").setName("Administrateurs de crédits").setCategory(__inject__(FunctionCategoryController.class).readOneByBusinessIdentifier("BUD"))
				,DependencyInjection.inject(Function.class).setIdentifier("14").setCode("OP").setName("Ordonnateur principal").setCategory(__inject__(FunctionCategoryController.class).readOneByBusinessIdentifier("BUD"))
				,DependencyInjection.inject(Function.class).setIdentifier("15").setCode("OD").setName("Ordonnateurs délégué").setCategory(__inject__(FunctionCategoryController.class).readOneByBusinessIdentifier("BUD"))
				,DependencyInjection.inject(Function.class).setIdentifier("16").setCode("CF").setName("Contrôleurs financier").setCategory(__inject__(FunctionCategoryController.class).readOneByBusinessIdentifier("BUD"))
				,DependencyInjection.inject(Function.class).setIdentifier("17").setCode("CB").setName("Contrôleurs budgétaires").setCategory(__inject__(FunctionCategoryController.class).readOneByBusinessIdentifier("BUD"))
				,DependencyInjection.inject(Function.class).setIdentifier("18").setCode("CA").setName("Comptables Assignataires").setCategory(__inject__(FunctionCategoryController.class).readOneByBusinessIdentifier("BUD"))
				);
	}
	
}

package ci.gouv.dgbf.system.actor.client.controller.entities.function;

import java.util.Collection;

import org.cyk.utility.__kernel__.DependencyInjection;
import org.cyk.utility.client.controller.data.Data;
import org.cyk.utility.collection.CollectionHelper;

public interface Function extends Data {

	@Override Function setIdentifier(Object identifier);
	@Override Function setCode(String code);
	
	String getName();
	Function setName(String name);
	
	String getDescription();
	Function setDescription(String description);
	
	FunctionCategory getCategory();
	Function setCategory(FunctionCategory category);
	
	/**/
	
	String PROPERTY_NAME = "name";
	String PROPERTY_DESCRIPTION = "description";
	String PROPERTY_CATEGORY = "category";
	
	/**/
	
	Collection<Function> COLLECTION = DependencyInjection.inject(CollectionHelper.class).instanciate(
			DependencyInjection.inject(Function.class).setIdentifier("1").setCode("ADMINISTRATEUR").setName("Administrateurs").setCategory(FunctionCategoryImpl.getByCode("ADM"))
			,DependencyInjection.inject(Function.class).setIdentifier("2").setCode("ASSISTANT").setName("Assistants").setCategory(FunctionCategoryImpl.getByCode("ADM"))
			,DependencyInjection.inject(Function.class).setIdentifier("3").setCode("CHARGE_ETUDE").setName("Chargés d’études").setCategory(FunctionCategoryImpl.getByCode("ADM"))
			,DependencyInjection.inject(Function.class).setIdentifier("4").setCode("COORDONNATEUR").setName("Coordonnateurs").setCategory(FunctionCategoryImpl.getByCode("ADM"))
			,DependencyInjection.inject(Function.class).setIdentifier("5").setCode("DIRECTEUR").setName("Directeur").setCategory(FunctionCategoryImpl.getByCode("ADM"))
			,DependencyInjection.inject(Function.class).setIdentifier("6").setCode("AGENT_SAISIE").setName("Agents de saisie").setCategory(FunctionCategoryImpl.getByCode("ADM"))
			,DependencyInjection.inject(Function.class).setIdentifier("7").setCode("RUA").setName("Responsable d’unité administrative").setCategory(FunctionCategoryImpl.getByCode("ADM"))
			,DependencyInjection.inject(Function.class).setIdentifier("8").setCode("OBSERVATEUR").setName("Observateurs").setCategory(FunctionCategoryImpl.getByCode("ADM"))
			,DependencyInjection.inject(Function.class).setIdentifier("9").setCode("RPROG").setName("Responsable de programme").setCategory(FunctionCategoryImpl.getByCode("BUD"))
			,DependencyInjection.inject(Function.class).setIdentifier("10").setCode("RBOP").setName("Responsable de budget opérationnel de programme").setCategory(FunctionCategoryImpl.getByCode("BUD"))
			,DependencyInjection.inject(Function.class).setIdentifier("11").setCode("RUO").setName("Responsable d’unité opérationnelle").setCategory(FunctionCategoryImpl.getByCode("BUD"))
			,DependencyInjection.inject(Function.class).setIdentifier("12").setCode("RFFIM").setName("Responsable de la fonction financière du ministère").setCategory(FunctionCategoryImpl.getByCode("BUD"))
			,DependencyInjection.inject(Function.class).setIdentifier("13").setCode("AC").setName("Administrateurs de crédits").setCategory(FunctionCategoryImpl.getByCode("BUD"))
			,DependencyInjection.inject(Function.class).setIdentifier("14").setCode("OP").setName("Ordonnateur principal").setCategory(FunctionCategoryImpl.getByCode("BUD"))
			,DependencyInjection.inject(Function.class).setIdentifier("15").setCode("OD").setName("Ordonnateurs délégué").setCategory(FunctionCategoryImpl.getByCode("BUD"))
			,DependencyInjection.inject(Function.class).setIdentifier("16").setCode("CF").setName("Contrôleurs financier").setCategory(FunctionCategoryImpl.getByCode("BUD"))
			,DependencyInjection.inject(Function.class).setIdentifier("17").setCode("CB").setName("Contrôleurs budgétaires").setCategory(FunctionCategoryImpl.getByCode("BUD"))
			,DependencyInjection.inject(Function.class).setIdentifier("18").setCode("CA").setName("Comptables Assignataires").setCategory(FunctionCategoryImpl.getByCode("BUD"))
			);
}

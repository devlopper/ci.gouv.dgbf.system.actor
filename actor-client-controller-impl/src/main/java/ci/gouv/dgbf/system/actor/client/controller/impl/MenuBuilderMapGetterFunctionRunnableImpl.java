package ci.gouv.dgbf.system.actor.client.controller.impl;

import java.io.Serializable;

import org.cyk.utility.__kernel__.function.AbstractFunctionRunnableImpl;
import org.cyk.utility.client.controller.component.menu.MenuBuilder;
import org.cyk.utility.client.controller.component.menu.MenuBuilderMap;
import org.cyk.utility.client.controller.component.menu.MenuBuilderMapGetter;
import org.cyk.utility.client.controller.component.menu.MenuItemBuilder;
import org.cyk.utility.client.controller.component.menu.MenuRenderTypeRowBar;
import org.cyk.utility.scope.ScopeSession;
import org.cyk.utility.system.action.SystemActionCreate;

import ci.gouv.dgbf.system.actor.client.controller.entities.function.Function;
import ci.gouv.dgbf.system.actor.client.controller.entities.function.FunctionCategory;
import ci.gouv.dgbf.system.actor.client.controller.entities.role.Role;
import ci.gouv.dgbf.system.actor.client.controller.entities.user.account.UserAccount;
import ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request.UserAccountRequest;

public class MenuBuilderMapGetterFunctionRunnableImpl extends AbstractFunctionRunnableImpl<MenuBuilderMapGetter> implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public MenuBuilderMapGetterFunctionRunnableImpl() {
		setRunnable(new Runnable() {
			@Override
			public void run() {
				MenuBuilder menuBuilder = __inject__(MenuBuilder.class).setRenderType(__inject__(MenuRenderTypeRowBar.class));
				menuBuilder.addItems(
						__inject__(MenuItemBuilder.class).setCommandableName("Paramètres")
							.addEntitiesList(FunctionCategory.class,Function.class,Role.class)
						,__inject__(MenuItemBuilder.class).setCommandableNameInternalizationKeyValue(UserAccountRequest.class).setCommandableNavigationIdentifierBuilderSystemAction(__inject__(SystemActionCreate.class).setEntityClass(UserAccountRequest.class))
						,__inject__(MenuItemBuilder.class).setCommandableName("Identification")
						,__inject__(MenuItemBuilder.class).setCommandableName("Compte utilisateur")
							.addEntitySelect(UserAccountRequest.class,"validate").getLastChild().setCommandableName("Traitements des demandes de compte utilisateur").getParent()
							.addEntitiesCreate(UserAccount.class).getLastChild().setCommandableName("Création de compte utilisateur").getParent()
							/*.addChild(__inject__(MenuItemBuilder.class).setCommandableName("Traitements des demandes de compte utilisateur").setCommandableNavigationIdentifierBuilderSystemAction(__inject__(SystemActionList.class).setEntityClass(UserAccountRequest.class))
								,__inject__(MenuItemBuilder.class).setCommandableName("Création de compte utilisateur"))*/
						,__inject__(MenuItemBuilder.class).setCommandableName("Administration")
							.addChild(__inject__(MenuItemBuilder.class).setCommandableName("Validation de compte utilisateur")
								,__inject__(MenuItemBuilder.class).setCommandableName("Gestion des affectations")
								,__inject__(MenuItemBuilder.class).setCommandableName("Gestion des assignations")
								,__inject__(MenuItemBuilder.class).setCommandableName("Gestion des intérims")
								,__inject__(MenuItemBuilder.class).setCommandableName("Réinitialisation de compte utilisateur")
								)
						,__inject__(MenuItemBuilder.class).setCommandableName("Editions")
							.addChild(__inject__(MenuItemBuilder.class).setCommandableName("Editer la fiche d’identification d’un acteur")
								,__inject__(MenuItemBuilder.class).setCommandableName("Editer la liste des fonctions")
								,__inject__(MenuItemBuilder.class).setCommandableName("Editer la liste des comptes utilisateurs")
								,__inject__(MenuItemBuilder.class).setCommandableName("Editer la liste des demandes de compte utilisateur")
								)
							);
				setOutput(__inject__(MenuBuilderMap.class).set(ScopeSession.class,menuBuilder));
			}
		});
	}
	
}
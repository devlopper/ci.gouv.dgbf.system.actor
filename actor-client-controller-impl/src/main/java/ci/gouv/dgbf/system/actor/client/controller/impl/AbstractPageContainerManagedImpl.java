package ci.gouv.dgbf.system.actor.client.controller.impl;

import org.cyk.utility.client.controller.component.menu.MenuBuilder;
import org.cyk.utility.client.controller.component.menu.MenuBuilderMap;
import org.cyk.utility.client.controller.component.menu.MenuItemBuilder;
import org.cyk.utility.client.controller.component.menu.MenuRenderTypeRowBar;
import org.cyk.utility.scope.ScopeSession;

public abstract class AbstractPageContainerManagedImpl extends org.cyk.utility.client.controller.web.jsf.primefaces.AbstractPageContainerManagedImpl {
	private static final long serialVersionUID = 1L;

	@Override
	protected MenuBuilderMap __getMenuBuilderMap__() {
		MenuBuilder menuBuilder = __inject__(MenuBuilder.class).setRenderType(__inject__(MenuRenderTypeRowBar.class));
		menuBuilder.addItems(
				__inject__(MenuItemBuilder.class).setCommandableName("Paramètres")
					.addChild(__inject__(MenuItemBuilder.class).setCommandableName("Catégorie de fonction").setCommandableNavigationIdentifier("functionCategoryListView")
					,__inject__(MenuItemBuilder.class).setCommandableName("Fonction"))
				,__inject__(MenuItemBuilder.class).setCommandableName("Demande de compte")
				,__inject__(MenuItemBuilder.class).setCommandableName("Identification")
				,__inject__(MenuItemBuilder.class).setCommandableName("Compte utilisateur")
					.addChild(__inject__(MenuItemBuilder.class).setCommandableName("Traitements des demandes de compte utilisateur")
						,__inject__(MenuItemBuilder.class).setCommandableName("Création de compte utilisateur"))
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
		return __inject__(MenuBuilderMap.class).set(ScopeSession.class,menuBuilder);
	}
	
	
}

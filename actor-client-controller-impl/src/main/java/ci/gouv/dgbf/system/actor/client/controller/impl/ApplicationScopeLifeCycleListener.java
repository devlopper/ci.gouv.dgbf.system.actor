package ci.gouv.dgbf.system.actor.client.controller.impl;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;

import org.cyk.utility.__kernel__.AbstractApplicationScopeLifeCycleListener;
import org.cyk.utility.__kernel__.function.FunctionRunnableMap;
import org.cyk.utility.client.controller.component.menu.MenuBuilderMapGetterImpl;
import org.cyk.utility.identifier.resource.UniformResourceIdentifierParameterValueMatrix;
import org.cyk.utility.string.repository.StringRepositoryResourceBundle;

import ci.gouv.dgbf.system.actor.client.controller.entities.function.Function;
import ci.gouv.dgbf.system.actor.client.controller.entities.function.FunctionCategory;
import ci.gouv.dgbf.system.actor.client.controller.entities.role.Role;
import ci.gouv.dgbf.system.actor.client.controller.entities.user.account.UserAccount;
import ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request.UserAccountRequest;

@ApplicationScoped
public class ApplicationScopeLifeCycleListener extends AbstractApplicationScopeLifeCycleListener implements Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public void __initialize__(Object object) {
		__inject__(FunctionRunnableMap.class).set(MenuBuilderMapGetterImpl.class, MenuBuilderMapGetterFunctionRunnableImpl.class,Boolean.TRUE);
		
		__inject__(UniformResourceIdentifierParameterValueMatrix.class).setClass(Role.class);
		__inject__(UniformResourceIdentifierParameterValueMatrix.class).setClass(FunctionCategory.class);
		__inject__(UniformResourceIdentifierParameterValueMatrix.class).setClass(Function.class);
		__inject__(UniformResourceIdentifierParameterValueMatrix.class).setClass(UserAccountRequest.class);
		__inject__(UniformResourceIdentifierParameterValueMatrix.class).setClass(UserAccount.class);
		
		__inject__(StringRepositoryResourceBundle.class).addBundle("ci.gouv.dgbf.system.actor.client.controller.entities.message");
		
	}
	
	@Override
	public void __destroy__(Object object) {}
	
}

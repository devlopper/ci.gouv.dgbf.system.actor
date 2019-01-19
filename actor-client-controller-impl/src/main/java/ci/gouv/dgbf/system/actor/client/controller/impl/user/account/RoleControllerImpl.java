package ci.gouv.dgbf.system.actor.client.controller.impl.user.account;

import java.io.Serializable;

import javax.inject.Singleton;

import org.cyk.utility.client.controller.AbstractControllerEntityImpl;

import ci.gouv.dgbf.system.actor.client.controller.api.user.account.RoleController;
import ci.gouv.dgbf.system.actor.client.controller.entities.user.account.Role;

@Singleton
public class RoleControllerImpl extends AbstractControllerEntityImpl<Role> implements RoleController,Serializable {
	private static final long serialVersionUID = 1L;
	
}

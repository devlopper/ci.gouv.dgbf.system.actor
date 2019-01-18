package ci.gouv.dgbf.system.actor.server.business.impl.user.account;

import javax.inject.Singleton;

import org.cyk.utility.server.business.AbstractBusinessEntityImpl;

import ci.gouv.dgbf.system.actor.server.business.api.user.account.RoleBusiness;
import ci.gouv.dgbf.system.actor.server.persistence.api.user.account.RolePersistence;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.Role;

@Singleton
public class RoleBusinessImpl extends AbstractBusinessEntityImpl<Role, RolePersistence> implements RoleBusiness {
	private static final long serialVersionUID = 1L;

	@Override
	protected Class<Role> __getEntityClass__() {
		return Role.class;
	}
	
}

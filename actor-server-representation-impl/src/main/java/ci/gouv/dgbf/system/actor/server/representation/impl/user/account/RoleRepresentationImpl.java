package ci.gouv.dgbf.system.actor.server.representation.impl.user.account;

import java.io.Serializable;

import javax.inject.Singleton;

import org.cyk.utility.server.representation.AbstractRepresentationEntityImpl;

import ci.gouv.dgbf.system.actor.server.business.api.user.account.RoleBusiness;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.Role;
import ci.gouv.dgbf.system.actor.server.representation.api.user.account.RoleRepresentation;
import ci.gouv.dgbf.system.actor.server.representation.entities.user.account.RoleDto;
import ci.gouv.dgbf.system.actor.server.representation.entities.user.account.RoleDtoCollection;

@Singleton
public class RoleRepresentationImpl extends AbstractRepresentationEntityImpl<Role,RoleBusiness,RoleDto,RoleDtoCollection> implements RoleRepresentation,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public Class<Role> getPersistenceEntityClass() {
		return Role.class;
	}
	
}

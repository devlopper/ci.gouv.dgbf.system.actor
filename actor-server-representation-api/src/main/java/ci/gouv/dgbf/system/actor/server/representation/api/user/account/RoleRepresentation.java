package ci.gouv.dgbf.system.actor.server.representation.api.user.account;

import javax.ws.rs.Path;

import org.cyk.utility.server.representation.RepresentationEntity;

import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.Role;
import ci.gouv.dgbf.system.actor.server.representation.entities.user.account.RoleDto;
import ci.gouv.dgbf.system.actor.server.representation.entities.user.account.RoleDtoCollection;

@Path(RoleRepresentation.PATH)
public interface RoleRepresentation extends RepresentationEntity<Role,RoleDto,RoleDtoCollection> {
	
	String PATH = "/role";
	
}

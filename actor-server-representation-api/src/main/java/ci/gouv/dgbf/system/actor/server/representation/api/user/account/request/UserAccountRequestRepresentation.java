package ci.gouv.dgbf.system.actor.server.representation.api.user.account.request;

import javax.ws.rs.Path;

import org.cyk.utility.server.representation.RepresentationEntity;

import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountRequest;
import ci.gouv.dgbf.system.actor.server.representation.entities.user.account.request.UserAccountRequestDto;
import ci.gouv.dgbf.system.actor.server.representation.entities.user.account.request.UserAccountRequestDtoCollection;

@Path(UserAccountRequestRepresentation.PATH)
public interface UserAccountRequestRepresentation extends RepresentationEntity<UserAccountRequest,UserAccountRequestDto,UserAccountRequestDtoCollection> {
	
	String PATH = "/user/account/request";
	
}

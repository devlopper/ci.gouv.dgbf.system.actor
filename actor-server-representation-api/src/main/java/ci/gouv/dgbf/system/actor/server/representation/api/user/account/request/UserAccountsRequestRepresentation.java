package ci.gouv.dgbf.system.actor.server.representation.api.user.account.request;

import javax.ws.rs.Path;

import org.cyk.utility.server.representation.RepresentationEntity;

import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountsRequest;
import ci.gouv.dgbf.system.actor.server.representation.entities.user.account.request.UserAccountsRequestDto;
import ci.gouv.dgbf.system.actor.server.representation.entities.user.account.request.UserAccountsRequestDtoCollection;

@Path(UserAccountsRequestRepresentation.PATH)
public interface UserAccountsRequestRepresentation extends RepresentationEntity<UserAccountsRequest,UserAccountsRequestDto,UserAccountsRequestDtoCollection> {
	
	String PATH = "/user/account/request";
	
}

package ci.gouv.dgbf.system.actor.server.representation.impl.user.account.request;

import java.io.Serializable;

import javax.inject.Singleton;

import org.cyk.utility.server.representation.AbstractRepresentationEntityImpl;

import ci.gouv.dgbf.system.actor.server.business.api.user.account.request.UserAccountRequestBusiness;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountRequest;
import ci.gouv.dgbf.system.actor.server.representation.api.user.account.request.UserAccountRequestRepresentation;
import ci.gouv.dgbf.system.actor.server.representation.entities.user.account.request.UserAccountRequestDto;
import ci.gouv.dgbf.system.actor.server.representation.entities.user.account.request.UserAccountRequestDtoCollection;

@Singleton
public class UserAccountRequestRepresentationImpl extends AbstractRepresentationEntityImpl<UserAccountRequest,UserAccountRequestBusiness,UserAccountRequestDto,UserAccountRequestDtoCollection> implements UserAccountRequestRepresentation,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public Class<UserAccountRequest> getPersistenceEntityClass() {
		return UserAccountRequest.class;
	}
	
}

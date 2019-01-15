package ci.gouv.dgbf.system.actor.server.representation.impl.user.account.request;

import java.io.Serializable;

import javax.inject.Singleton;

import org.cyk.utility.server.representation.AbstractRepresentationEntityImpl;

import ci.gouv.dgbf.system.actor.server.business.api.user.account.request.UserAccountsRequestBusiness;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountsRequest;
import ci.gouv.dgbf.system.actor.server.representation.api.user.account.request.UserAccountsRequestRepresentation;
import ci.gouv.dgbf.system.actor.server.representation.entities.user.account.request.UserAccountsRequestDto;
import ci.gouv.dgbf.system.actor.server.representation.entities.user.account.request.UserAccountsRequestDtoCollection;

@Singleton
public class UserAccountsRequestRepresentationImpl extends AbstractRepresentationEntityImpl<UserAccountsRequest,UserAccountsRequestBusiness,UserAccountsRequestDto,UserAccountsRequestDtoCollection> implements UserAccountsRequestRepresentation,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public Class<UserAccountsRequest> getPersistenceEntityClass() {
		return UserAccountsRequest.class;
	}
	
}

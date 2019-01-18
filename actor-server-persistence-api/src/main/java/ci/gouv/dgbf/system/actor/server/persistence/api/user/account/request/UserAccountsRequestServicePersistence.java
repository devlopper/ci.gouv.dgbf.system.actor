package ci.gouv.dgbf.system.actor.server.persistence.api.user.account.request;

import java.util.Collection;

import org.cyk.utility.server.persistence.jpa.PersistenceEntity;

import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountsRequest;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountsRequestService;

public interface UserAccountsRequestServicePersistence extends PersistenceEntity<UserAccountsRequestService> {

	Collection<UserAccountsRequestService> readByUserAccountsRequest(UserAccountsRequest userAccountsRequest);
	
}

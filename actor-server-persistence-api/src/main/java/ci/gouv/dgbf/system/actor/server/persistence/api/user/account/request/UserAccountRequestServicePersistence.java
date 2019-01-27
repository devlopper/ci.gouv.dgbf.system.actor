package ci.gouv.dgbf.system.actor.server.persistence.api.user.account.request;

import java.util.Collection;

import org.cyk.utility.server.persistence.jpa.PersistenceEntity;

import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountRequest;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountRequestService;

public interface UserAccountRequestServicePersistence extends PersistenceEntity<UserAccountRequestService> {

	Collection<UserAccountRequestService> readByUserAccountRequest(UserAccountRequest userAccountRequest);
	
}

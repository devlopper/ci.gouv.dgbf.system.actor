package ci.gouv.dgbf.system.actor.server.persistence.api.user.account.request;

import java.util.Collection;

import org.cyk.utility.server.persistence.jpa.PersistenceEntity;

import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountsRequest;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountsRequestRole;

public interface UserAccountsRequestRolePersistence extends PersistenceEntity<UserAccountsRequestRole> {

	Collection<UserAccountsRequestRole> readByUserAccountsRequest(UserAccountsRequest userAccountsRequest);
	
}

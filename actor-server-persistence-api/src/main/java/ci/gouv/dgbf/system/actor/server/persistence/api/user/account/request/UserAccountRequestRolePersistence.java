package ci.gouv.dgbf.system.actor.server.persistence.api.user.account.request;

import java.util.Collection;

import org.cyk.utility.server.persistence.jpa.PersistenceEntity;

import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountRequest;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountRequestRole;

public interface UserAccountRequestRolePersistence extends PersistenceEntity<UserAccountRequestRole> {

	Collection<UserAccountRequestRole> readByUserAccountRequest(UserAccountRequest userAccountRequest);
	
}

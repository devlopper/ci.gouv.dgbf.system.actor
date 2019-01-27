package ci.gouv.dgbf.system.actor.server.persistence.api.user.account.request;

import java.util.Collection;

import org.cyk.utility.server.persistence.jpa.PersistenceEntity;

import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountRequest;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountRequestPerson;

public interface UserAccountRequestPersonPersistence extends PersistenceEntity<UserAccountRequestPerson> {

	Collection<UserAccountRequestPerson> readByUserAccountRequest(UserAccountRequest userAccountRequest);
	
}

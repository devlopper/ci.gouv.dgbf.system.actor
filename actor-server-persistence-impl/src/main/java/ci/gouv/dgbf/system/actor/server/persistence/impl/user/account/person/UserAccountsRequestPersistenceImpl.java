package ci.gouv.dgbf.system.actor.server.persistence.impl.user.account.person;

import java.io.Serializable;

import javax.inject.Singleton;

import org.cyk.utility.server.persistence.jpa.AbstractPersistenceEntityImpl;

import ci.gouv.dgbf.system.actor.server.persistence.api.user.account.request.UserAccountsRequestPersistence;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountsRequest;

@Singleton
public class UserAccountsRequestPersistenceImpl extends AbstractPersistenceEntityImpl<UserAccountsRequest> implements UserAccountsRequestPersistence,Serializable {
	private static final long serialVersionUID = 1L;

}

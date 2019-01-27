package ci.gouv.dgbf.system.actor.server.persistence.impl.user.account.request;

import java.io.Serializable;

import javax.inject.Singleton;

import org.cyk.utility.server.persistence.jpa.AbstractPersistenceEntityImpl;

import ci.gouv.dgbf.system.actor.server.persistence.api.user.account.request.UserAccountRequestPersistence;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountRequest;

@Singleton
public class UserAccountRequestPersistenceImpl extends AbstractPersistenceEntityImpl<UserAccountRequest> implements UserAccountRequestPersistence,Serializable {
	private static final long serialVersionUID = 1L;

}

package ci.gouv.dgbf.system.actor.server.persistence.impl.user.account;

import java.io.Serializable;

import javax.inject.Singleton;

import org.cyk.utility.server.persistence.jpa.AbstractPersistenceEntityImpl;

import ci.gouv.dgbf.system.actor.server.persistence.api.user.account.RolePersistence;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.Role;

@Singleton
public class RolePersistenceImpl extends AbstractPersistenceEntityImpl<Role> implements RolePersistence,Serializable {
	private static final long serialVersionUID = 1L;

}

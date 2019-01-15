package ci.gouv.dgbf.system.actor.server.persistence.impl.person;

import java.io.Serializable;

import javax.inject.Singleton;

import org.cyk.utility.server.persistence.jpa.AbstractPersistenceEntityImpl;

import ci.gouv.dgbf.system.actor.server.persistence.api.person.PersonPersistence;
import ci.gouv.dgbf.system.actor.server.persistence.entities.person.Person;

@Singleton
public class PersonPersistenceImpl extends AbstractPersistenceEntityImpl<Person> implements PersonPersistence,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public Class<Person> getEntityClass() {
		return Person.class;
	}
	
}

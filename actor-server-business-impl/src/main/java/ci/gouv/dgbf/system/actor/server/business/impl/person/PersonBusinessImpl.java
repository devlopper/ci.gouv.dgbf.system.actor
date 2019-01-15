package ci.gouv.dgbf.system.actor.server.business.impl.person;

import javax.inject.Singleton;

import org.cyk.utility.server.business.AbstractBusinessEntityImpl;

import ci.gouv.dgbf.system.actor.server.business.api.person.PersonBusiness;
import ci.gouv.dgbf.system.actor.server.persistence.api.person.PersonPersistence;
import ci.gouv.dgbf.system.actor.server.persistence.entities.person.Person;

@Singleton
public class PersonBusinessImpl extends AbstractBusinessEntityImpl<Person, PersonPersistence> implements PersonBusiness {
	private static final long serialVersionUID = 1L;

	@Override
	public Class<Person> getPersistenceEntityClass() {
		return Person.class;
	}
	
}

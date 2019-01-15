package ci.gouv.dgbf.system.actor.server.representation.impl.person;

import java.io.Serializable;

import javax.inject.Singleton;

import org.cyk.utility.server.representation.AbstractRepresentationEntityImpl;

import ci.gouv.dgbf.system.actor.server.business.api.person.PersonBusiness;
import ci.gouv.dgbf.system.actor.server.persistence.entities.person.Person;
import ci.gouv.dgbf.system.actor.server.representation.api.person.PersonRepresentation;
import ci.gouv.dgbf.system.actor.server.representation.entities.person.PersonDto;
import ci.gouv.dgbf.system.actor.server.representation.entities.person.PersonDtoCollection;

@Singleton
public class PersonRepresentationImpl extends AbstractRepresentationEntityImpl<Person,PersonBusiness,PersonDto,PersonDtoCollection> implements PersonRepresentation,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public Class<Person> getPersistenceEntityClass() {
		return Person.class;
	}
	
}

package ci.gouv.dgbf.system.actor.server.representation.api.person;

import javax.ws.rs.Path;

import org.cyk.utility.server.representation.RepresentationEntity;

import ci.gouv.dgbf.system.actor.server.persistence.entities.person.Person;
import ci.gouv.dgbf.system.actor.server.representation.entities.person.PersonDto;
import ci.gouv.dgbf.system.actor.server.representation.entities.person.PersonDtoCollection;

@Path(PersonRepresentation.PATH)
public interface PersonRepresentation extends RepresentationEntity<Person,PersonDto,PersonDtoCollection> {
	
	String PATH = "/person";
	
}

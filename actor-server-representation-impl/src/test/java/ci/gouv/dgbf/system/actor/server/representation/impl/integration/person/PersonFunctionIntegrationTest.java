package ci.gouv.dgbf.system.actor.server.representation.impl.integration.person;

import org.cyk.utility.server.representation.AbstractEntityCollection;
import org.cyk.utility.server.representation.RepresentationEntity;
import org.cyk.utility.server.representation.test.arquillian.AbstractRepresentationEntityIntegrationTestWithDefaultDeploymentAsSwram;

import ci.gouv.dgbf.system.actor.server.representation.api.person.PersonRepresentation;
import ci.gouv.dgbf.system.actor.server.representation.entities.person.PersonDto;
import ci.gouv.dgbf.system.actor.server.representation.entities.person.PersonDtoCollection;

public class PersonFunctionIntegrationTest extends AbstractRepresentationEntityIntegrationTestWithDefaultDeploymentAsSwram<PersonDto> {
	private static final long serialVersionUID = 1L;
	
	/* Create */
	
	@SuppressWarnings("rawtypes")
	@Override
	public Class<? extends RepresentationEntity> __getLayerEntityInterfaceClass__() {
		return PersonRepresentation.class;
	}

	@SuppressWarnings("unchecked")
	@Override
	protected <ENTITY> Class<? extends AbstractEntityCollection<ENTITY>> __getEntityCollectionClass__(Class<ENTITY> aClass) {
		try {
			return (Class<? extends AbstractEntityCollection<ENTITY>>) Class.forName(PersonDtoCollection.class.getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}	
	

}

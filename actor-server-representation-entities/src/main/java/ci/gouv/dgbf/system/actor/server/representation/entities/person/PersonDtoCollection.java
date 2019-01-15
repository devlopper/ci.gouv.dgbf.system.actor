package ci.gouv.dgbf.system.actor.server.representation.entities.person;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.cyk.utility.server.representation.AbstractEntityCollection;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@XmlRootElement @Getter @Setter @Accessors(chain=true) @NoArgsConstructor
@XmlSeeAlso(PersonDto.class)
public class PersonDtoCollection extends AbstractEntityCollection<PersonDto> implements Serializable {
	private static final long serialVersionUID = 1L;

	
}

package ci.gouv.dgbf.system.actor.server.representation.entities.user.account.request;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import org.cyk.utility.server.representation.AbstractEntityFromPersistenceEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@XmlRootElement @Getter @Setter @Accessors(chain=true) @NoArgsConstructor
public class UserAccountsRequestDto extends AbstractEntityFromPersistenceEntity implements Serializable {
	private static final long serialVersionUID = 1L;

}

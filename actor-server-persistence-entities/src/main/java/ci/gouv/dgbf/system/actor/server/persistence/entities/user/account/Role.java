package ci.gouv.dgbf.system.actor.server.persistence.entities.user.account;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

import org.cyk.utility.server.persistence.jpa.AbstractEntity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity @Getter @Setter @Accessors(chain=true) @Access(AccessType.FIELD)
public class Role extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	
	@Override
	public Role setCode(String code) {
		return (Role) super.setCode(code);
	}
	
	/**/
	
	public static final String FIELD_NAME = "name";
}

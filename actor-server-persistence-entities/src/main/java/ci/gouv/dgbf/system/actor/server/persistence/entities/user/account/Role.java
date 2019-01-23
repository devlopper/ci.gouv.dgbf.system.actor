package ci.gouv.dgbf.system.actor.server.persistence.entities.user.account;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.cyk.utility.server.persistence.jpa.AbstractEntity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity @Getter @Setter @Accessors(chain=true) @Access(AccessType.FIELD)
@Table(name=Role.TABLE_NAME)
public class Role extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name=COLUMN_NAME) private String name;
	
	@Override
	public Role setCode(String code) {
		return (Role) super.setCode(code);
	}
	
	/**/
	
	public static final String FIELD_NAME = "name";
	
	public static final String TABLE_NAME = "role";
	
	public static final String COLUMN_NAME = "nom";
}

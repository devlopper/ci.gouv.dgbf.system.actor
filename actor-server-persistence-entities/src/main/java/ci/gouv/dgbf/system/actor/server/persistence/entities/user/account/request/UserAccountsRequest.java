package ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Transient;

import org.cyk.utility.server.persistence.jpa.AbstractEntity;

import ci.gouv.dgbf.system.actor.server.persistence.entities.person.Person;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity @Getter @Setter @Accessors(chain=true) @Access(AccessType.FIELD)
public class UserAccountsRequest extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="letter_")
	private String letter;
	
	@Transient private Collection<Person> persons;
	
	@Override
	public UserAccountsRequest setCode(String code) {
		return (UserAccountsRequest) super.setCode(code);
	}
}

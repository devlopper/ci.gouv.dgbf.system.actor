package ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import org.cyk.utility.server.persistence.jpa.AbstractEntity;

import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.Role;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity @Getter @Setter @Accessors(chain=true) @Table(uniqueConstraints= {
		@UniqueConstraint(name="ucUserAccountsRequestRole",columnNames= {UserAccountsRequestRole.COLUMN_USER_ACCOUNTS_REQUEST,UserAccountsRequestRole.COLUMN_ROLE})
})
@Access(AccessType.FIELD)
public class UserAccountsRequestRole extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@JoinColumn(name=COLUMN_USER_ACCOUNTS_REQUEST) @ManyToOne @NotNull private UserAccountsRequest userAccountsRequest;
	@JoinColumn(name=COLUMN_ROLE) @ManyToOne @NotNull private Role role;
	
	/**/
	
	@Override
	public UserAccountsRequestRole setCode(String code) {
		return (UserAccountsRequestRole) super.setCode(code);
	}
	
	/**/
	
	public static final String FIELD_USER_ACCOUNTS_REQUEST = "userAccountsRequest";
	public static final String FIELD_ROLE = "role";
	
	public static final String COLUMN_USER_ACCOUNTS_REQUEST = FIELD_USER_ACCOUNTS_REQUEST;
	public static final String COLUMN_ROLE = FIELD_ROLE;
}

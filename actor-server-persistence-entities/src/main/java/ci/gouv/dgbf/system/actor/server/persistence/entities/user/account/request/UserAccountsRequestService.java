package ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import org.cyk.utility.server.persistence.jpa.AbstractEntity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity @Getter @Setter @Accessors(chain=true) @Table(uniqueConstraints= {
		@UniqueConstraint(name="ucUserAccountsRequestService",columnNames= {UserAccountsRequestService.COLUMN_USER_ACCOUNTS_REQUEST,UserAccountsRequestService.COLUMN_SERVICE})
})
@Access(AccessType.FIELD)
public class UserAccountsRequestService extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@JoinColumn(name=COLUMN_USER_ACCOUNTS_REQUEST) @ManyToOne @NotNull private UserAccountsRequest userAccountsRequest;
	@Column(name=COLUMN_SERVICE) @NotNull private String service;
	
	/**/
	
	@Override
	public UserAccountsRequestService setCode(String code) {
		return (UserAccountsRequestService) super.setCode(code);
	}
	
	/**/
	
	public static final String FIELD_USER_ACCOUNTS_REQUEST = "userAccountsRequest";
	public static final String FIELD_SERVICE = "service";
	
	public static final String COLUMN_USER_ACCOUNTS_REQUEST = FIELD_USER_ACCOUNTS_REQUEST;
	public static final String COLUMN_SERVICE = FIELD_SERVICE;
}

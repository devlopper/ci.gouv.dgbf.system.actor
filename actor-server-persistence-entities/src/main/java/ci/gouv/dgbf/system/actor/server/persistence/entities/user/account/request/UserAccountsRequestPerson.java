package ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request;

import java.io.Serializable;
import java.util.Date;

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

import ci.gouv.dgbf.system.actor.server.persistence.entities.person.Person;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity @Getter @Setter @Accessors(chain=true) @Table(
		name=UserAccountsRequestPerson.TABLE_NAME,
		uniqueConstraints= {
		@UniqueConstraint(name="ucUserAccountsRequestPerson",columnNames= {UserAccountsRequestPerson.COLUMN_USER_ACCOUNTS_REQUEST,UserAccountsRequestPerson.COLUMN_PERSON})
})
@Access(AccessType.FIELD) 
public class UserAccountsRequestPerson extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@JoinColumn(name=COLUMN_USER_ACCOUNTS_REQUEST) @ManyToOne @NotNull private UserAccountsRequest userAccountsRequest;
	@JoinColumn(name=COLUMN_PERSON) @ManyToOne @NotNull private Person person;
	//Use boolean for status
	@Column(name=COLUMN_STATUS) private String status;
	@Column(name=COLUMN_ACCOUNT_CREATION_DATE) private Date accountCreationDate;
	
	@Column(name=COLUMN_ADMINISTRATIVE_UNIT) private String administrativeUnit;
	@Column(name=COLUMN_FUNCTION) private String function;
	
	/**/
	
	@Override
	public UserAccountsRequestPerson setCode(String code) {
		return (UserAccountsRequestPerson) super.setCode(code);
	}
	
	/**/
	
	public static final String FIELD_USER_ACCOUNTS_REQUEST = "userAccountsRequest";
	public static final String FIELD_PERSON = "person";
	public static final String FIELD_ADMINISTRATIVE_UNIT = "administrativeUnit";
	public static final String FIELD_FUNCTION = "function";
	
	public static final String TABLE_NAME = UserAccountsRequest.TABLE_NAME+ "_"+Person.TABLE_NAME;
	
	public static final String COLUMN_USER_ACCOUNTS_REQUEST = UserAccountsRequest.TABLE_NAME;
	public static final String COLUMN_PERSON = Person.TABLE_NAME;
	public static final String COLUMN_STATUS = "statut";
	public static final String COLUMN_ACCOUNT_CREATION_DATE = UserAccountsRequest.TABLE_NAME+"_date_creation";
	public static final String COLUMN_ADMINISTRATIVE_UNIT = "unite_administrative";
	public static final String COLUMN_FUNCTION = "fonction";
	
}

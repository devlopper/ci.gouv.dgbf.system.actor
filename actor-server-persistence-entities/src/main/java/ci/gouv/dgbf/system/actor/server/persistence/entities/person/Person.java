package ci.gouv.dgbf.system.actor.server.persistence.entities.person;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

import org.cyk.utility.server.persistence.jpa.AbstractEntity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Entity @Getter @Setter @Accessors(chain=true) @Access(AccessType.FIELD) @ToString
public class Person extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private String firstName;
	private String lastNames;
	private Boolean isMasculine;
	
	//Contacts
	private String electronicMailAddress;
	private String phoneNumber;
	
	
	/**/
	
	@Override
	public Person setCode(String code) {
		return (Person) super.setCode(code);
	}
	
	/**/
	
	public static final String FIELD_FIRST_NAME = "firstName";
	public static final String FIELD_LAST_NAMES = "lastNames";
	public static final String FIELD_IS_MASCULINE = "isMasculine";
	public static final String FIELD_ELECTRONIC_MAIL_ADDRESS = "electronicMailAddress";
	public static final String FIELD_PHONE_NUMBER = "phoneNumber";
	
}

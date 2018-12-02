package ci.gouv.dgbf.system.actor.client.controller.entities.user;

import java.io.Serializable;

import org.cyk.utility.client.controller.data.AbstractFormDataImpl;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true)
public class UserEditFormImpl extends AbstractFormDataImpl<User> implements UserEditForm,Serializable {
	private static final long serialVersionUID = 1L;
	
}

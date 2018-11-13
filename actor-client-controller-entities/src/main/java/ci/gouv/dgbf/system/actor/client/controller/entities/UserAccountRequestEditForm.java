package ci.gouv.dgbf.system.actor.client.controller.entities;

import java.io.Serializable;

import javax.inject.Inject;

import org.cyk.utility.__kernel__.object.dynamic.AbstractObject;
import org.cyk.utility.client.controller.component.annotation.Commandable;
import org.cyk.utility.client.controller.component.annotation.CommandableButton;
import org.cyk.utility.system.action.SystemActionCreate;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true)
public class UserAccountRequestEditForm extends AbstractObject implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject private UserAccountRequestData data;
	
	@Commandable(systemActionClass=SystemActionCreate.class) @CommandableButton
	public void submit() {
		System.out.println("UserAccountRequestEditForm.submit() : "+data);
	}
	
	/**/
	
	public static final String METHOD_SUBMIT = "submit";
}

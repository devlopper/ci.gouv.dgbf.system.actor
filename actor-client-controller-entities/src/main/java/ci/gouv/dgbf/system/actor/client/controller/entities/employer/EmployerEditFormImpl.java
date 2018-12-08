package ci.gouv.dgbf.system.actor.client.controller.entities.employer;

import java.io.Serializable;

import org.cyk.utility.client.controller.data.AbstractFormDataImpl;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true)
public class EmployerEditFormImpl extends AbstractFormDataImpl<Employer> implements EmployerEditForm,Serializable {
	private static final long serialVersionUID = 1L;
	
}

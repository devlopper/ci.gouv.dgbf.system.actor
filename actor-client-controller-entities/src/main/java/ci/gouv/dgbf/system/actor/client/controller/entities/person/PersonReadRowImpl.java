package ci.gouv.dgbf.system.actor.client.controller.entities.person;
import java.io.Serializable;

import org.cyk.utility.client.controller.data.AbstractRowDataImpl;

public class PersonReadRowImpl extends AbstractRowDataImpl<Person> implements PersonReadRow,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public PersonReadRow setData(Person data) {
		return (PersonReadRow) super.setData(data);
	}
	
}

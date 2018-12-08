package ci.gouv.dgbf.system.actor.client.controller.entities.person;

import org.cyk.utility.client.controller.data.RowData;

public interface PersonReadRow extends RowData<Person> {

	@Override PersonReadRow setData(Person data);
	
}

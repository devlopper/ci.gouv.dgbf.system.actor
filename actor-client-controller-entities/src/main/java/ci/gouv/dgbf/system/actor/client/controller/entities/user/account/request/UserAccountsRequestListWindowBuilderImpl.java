package ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request;
import java.io.Serializable;

import org.cyk.utility.client.controller.component.grid.GridBuilder;
import org.cyk.utility.client.controller.component.window.AbstractWindowContainerManagedWindowBuilderListDataImpl;
import org.cyk.utility.client.controller.data.RowData;

import ci.gouv.dgbf.system.actor.client.controller.entities.person.Person;

public class UserAccountsRequestListWindowBuilderImpl extends AbstractWindowContainerManagedWindowBuilderListDataImpl implements UserAccountsRequestListWindowBuilder, Serializable {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void __listenPostConstruct__() {
		super.__listenPostConstruct__();
		setRowClass(UserAccountsRequestReadRow.class);
		addGridColumnsFieldNamesWithPrefix(RowData.PROPERTY_DATA, UserAccountsRequest.PROPERTY_CODE,UserAccountsRequest.PROPERTY_DATE
				,__injectFieldHelper__().concatenate(UserAccountsRequest.PROPERTY_PERSON,Person.PROPERTY_FIRST_NAME_AND_LAST_NAMES));
	}
	
	@Override
	protected void __execute__(GridBuilder gridBuilder) {
		
	}
	
}

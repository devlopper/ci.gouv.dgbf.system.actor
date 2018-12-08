package ci.gouv.dgbf.system.actor.client.controller.entities.account;
import java.io.Serializable;

import org.cyk.utility.client.controller.component.grid.GridBuilder;
import org.cyk.utility.client.controller.component.window.AbstractWindowContainerManagedWindowBuilderListDataImpl;
import org.cyk.utility.client.controller.data.RowData;

public class CredentialsListWindowBuilderImpl extends AbstractWindowContainerManagedWindowBuilderListDataImpl implements CredentialsListWindowBuilder, Serializable {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void __listenPostConstruct__() {
		super.__listenPostConstruct__();
		setRowClass(CredentialsReadRow.class);
		addGridColumnsFieldNamesWithPrefix(RowData.PROPERTY_DATA, Credentials.PROPERTY_CODE,Credentials.PROPERTY_USERNAME,Credentials.PROPERTY_PASSWORD);
	}
	
	@Override
	protected void __execute__(GridBuilder gridBuilder) {
		
	}
	
}

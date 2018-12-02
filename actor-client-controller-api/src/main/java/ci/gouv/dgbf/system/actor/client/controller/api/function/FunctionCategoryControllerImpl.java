package ci.gouv.dgbf.system.actor.client.controller.api.function;

import java.io.Serializable;
import java.util.Collection;

import javax.inject.Singleton;

import org.cyk.utility.__kernel__.DependencyInjection;
import org.cyk.utility.client.controller.AbstractControllerEntityPersistedInCollectionImpl;
import org.cyk.utility.collection.CollectionHelper;

import ci.gouv.dgbf.system.actor.client.controller.entities.function.FunctionCategory;

@Singleton
public class FunctionCategoryControllerImpl extends AbstractControllerEntityPersistedInCollectionImpl<FunctionCategory> implements FunctionCategoryController,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	protected Collection<FunctionCategory> __getInitialCollection__() {
		return __inject__(CollectionHelper.class).instanciate(
				DependencyInjection.inject(FunctionCategory.class).setIdentifier("1").setCode("ADM").setName("Administrative")
				,DependencyInjection.inject(FunctionCategory.class).setIdentifier("2").setCode("BUD").setName("Budgétaire")
				);
	}
	
	@Override
	protected FunctionCategory __instanciateOneRandomly__(Integer index) {
		return super.__instanciateOneRandomly__(index).setName("VseName"+index).setDescription("VSeLine01"+index+"\nVSELine02"+index);
	}
}

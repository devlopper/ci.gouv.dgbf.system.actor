package ci.gouv.dgbf.system.actor.client.controller.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import org.cyk.utility.__kernel__.function.AbstractFunctionRunnableImpl;
import org.cyk.utility.field.FieldName;
import org.cyk.utility.instance.InstanceGetter;

import ci.gouv.dgbf.system.actor.client.controller.entities.function.Function;
import ci.gouv.dgbf.system.actor.client.controller.entities.function.FunctionCategory;
import ci.gouv.dgbf.system.actor.client.controller.entities.function.FunctionCategoryImpl;
import ci.gouv.dgbf.system.actor.client.controller.entities.function.FunctionImpl;
import ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request.UserAccountRequest;
import ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request.UserAccountRequestImpl;

public class InstanceGetterFunctionRunnableImpl extends AbstractFunctionRunnableImpl<InstanceGetter> implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public InstanceGetterFunctionRunnableImpl() {
		setRunnable(new Runnable() {
			@Override
			public void run() {
				InstanceGetter function = getFunction();
				if(FieldName.IDENTIFIER.equals(getFunction().getFieldName())) {
					Object one = null;
					if(function.getClazz().equals(FunctionCategory.class))
						one = FunctionCategoryImpl.getByIdentifier(function.getValue().toString());
					else if(function.getClazz().equals(Function.class))
						one = FunctionImpl.getByIdentifier(function.getValue().toString());
					else if(function.getClazz().equals(UserAccountRequest.class))
						one = UserAccountRequestImpl.getByIdentifier(function.getValue().toString());
					Collection<Object> collection = new ArrayList<>();
					if(one!=null)
						collection.add(one);
					setOutput(collection);
				}
			}
		});
	}
	
}
package ci.gouv.dgbf.system.actor.client.controller.impl;

import java.io.Serializable;

import org.cyk.utility.__kernel__.function.AbstractFunctionRunnableImpl;
import org.cyk.utility.client.controller.proxy.ProxyClassUniformResourceIdentifierStringProvider;

public class ProxyClassUniformResourceIdentifierStringProviderFunctionRunnableImpl extends AbstractFunctionRunnableImpl<ProxyClassUniformResourceIdentifierStringProvider> implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public ProxyClassUniformResourceIdentifierStringProviderFunctionRunnableImpl() {
		setRunnable(new Runnable() {
			@Override
			public void run() {
				setOutput("http://mic-demande-compte-server:8080/");
				//setOutput("http://localhost:8080/actor/server");
			}
		});
	}
	
}
package ci.gouv.dgbf.system.actor.client.controller.impl;

import java.io.Serializable;

import org.cyk.utility.__kernel__.function.AbstractFunctionRunnableImpl;
import org.cyk.utility.client.controller.component.theme.ThemeClassGetter;

public class ThemeClassGetterFunctionRunnableImpl extends AbstractFunctionRunnableImpl<ThemeClassGetter> implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public ThemeClassGetterFunctionRunnableImpl() {
		setRunnable(new Runnable() {
			@Override
			public void run() {
				setOutput(ThemeAtlantisDesktopDefault.class);
			}
		});
	}
	
}
package ci.gouv.dgbf.system.actor.client.controller.impl;

import java.io.Serializable;

import org.cyk.utility.client.controller.component.theme.AbstractThemeImpl;
import org.cyk.utility.client.controller.component.theme.Theme;
import org.cyk.utility.client.controller.component.window.Window;

public class ThemeAtlantisDesktopDefaultImpl extends AbstractThemeImpl implements ThemeAtlantisDesktopDefault,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	protected String __getIdentifier__() {
		return "ci.gouv.dgbf.system.actor.client.controller.web.jsf.primefaces.atlantis.desktop.default";
	}
	
	@Override
	protected String __getTemplateIdentifier__() {
		return "/template/default.xhtml";
	}
	
	@Override
	public Theme process(Window window) {
		__north__(window);
		__center__(window);
		__south__(window);
		return this;
	}
	
	private void __north__(Window window) {
		
	}
	
	private void __center__(Window window) {
		mapViews("center",window.getView());
	}

	private void __south__(Window window) {
		
	}
}

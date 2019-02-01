package ci.gouv.dgbf.system.actor.server.business.impl;
import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;

import org.cyk.utility.__kernel__.AbstractApplicationScopeLifeCycleListener;

@ApplicationScoped
public class ApplicationScopeLifeCycleListener extends AbstractApplicationScopeLifeCycleListener implements Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public void __initialize__(Object object) {
		
		/*
		UserAccountRequest userAccountRequest = new UserAccountRequest();
		userAccountRequest.addPersons(new Person().setFirstName("Komenan").setLastNames("Yao Christian").setElectronicMailAddress("dgbfdtideveloppers@gmail.com").setPhoneNumber("07625658")
				.setIsMasculine(Boolean.TRUE).setAdministrativeUnit("DGBF").setFunction("Chargé d'études"));
		userAccountRequest.addRoles(__inject__(RolePersistence.class).readByCode("ADMINISTRATEUR"),__inject__(RolePersistence.class).readByCode("CHARGE_ETUDE"));
		userAccountRequest.addServices("ELB");
		userAccountRequest.setLetter("Ma lettre");
		__inject__(UserAccountRequestBusiness.class).create(userAccountRequest);
		*/
	}
	
	@Override
	public void __destroy__(Object object) {}
	
}

package ci.gouv.dgbf.system.actor.client.controller.api.user.account.request;

import java.io.Serializable;

import javax.inject.Singleton;

import org.cyk.utility.__kernel__.properties.Properties;
import org.cyk.utility.client.controller.AbstractControllerEntityImpl;
import org.cyk.utility.client.controller.ControllerServiceProvider;
import org.cyk.utility.notification.NotificationBuilder;
import org.cyk.utility.notification.NotificationBuilders;

import ci.gouv.dgbf.system.actor.client.controller.entities.user.account.request.UserAccountRequest;

@Singleton
public class UserAccountRequestControllerImpl extends AbstractControllerEntityImpl<UserAccountRequest> implements UserAccountRequestController,Serializable {
	private static final long serialVersionUID = 1L;

	/*@Override
	public ControllerServiceProvider<UserAccountRequest> create(UserAccountRequest object, Properties properties) {
		properties.setNotificationBuilders(__inject__(NotificationBuilders.class).add(__inject__(NotificationBuilder.class)
				.setSummary("Veuillez consulter votre boite électronique pour récuperer le code de votre demande.")));
		return super.create(object, properties);
	}
	*/
	
	@Override
	public ControllerServiceProvider<UserAccountRequest> create(UserAccountRequest userAccountRequest, Properties properties) {
		properties.setNotificationBuilders(__inject__(NotificationBuilders.class).add(__inject__(NotificationBuilder.class)
				.setSummary("Veuillez consulter votre boite électronique pour récuperer le code de votre demande.")));
		super.create(userAccountRequest, properties);
		
		return this;
	}
}

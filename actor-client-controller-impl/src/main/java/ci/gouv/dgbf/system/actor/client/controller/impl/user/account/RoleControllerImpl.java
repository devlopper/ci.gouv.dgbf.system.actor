package ci.gouv.dgbf.system.actor.client.controller.impl.user.account;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.inject.Singleton;
import javax.ws.rs.core.Response;

import org.cyk.utility.__kernel__.properties.Properties;
import org.cyk.utility.client.controller.AbstractControllerEntityImpl;
import org.cyk.utility.client.controller.proxy.ProxyGetter;
import org.cyk.utility.instance.InstanceHelper;
import org.cyk.utility.type.TypeHelper;

import ci.gouv.dgbf.system.actor.client.controller.api.user.account.RoleController;
import ci.gouv.dgbf.system.actor.client.controller.entities.user.account.Role;
import ci.gouv.dgbf.system.actor.client.controller.entities.user.account.RoleImpl;
import ci.gouv.dgbf.system.actor.server.representation.api.user.account.RoleRepresentation;
import ci.gouv.dgbf.system.actor.server.representation.entities.user.account.RoleDto;

@Singleton
public class RoleControllerImpl extends AbstractControllerEntityImpl<Role> implements RoleController,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public Collection<Role> readMany(Properties properties) {
		Collection<Role> roles = new ArrayList<>();

		Object request = Properties.getFromPath(properties, Properties.REQUEST);
		RoleRepresentation representation = (RoleRepresentation) __inject__(ProxyGetter.class).setProxyClassUniformResourceIdentifierStringBuilderRequest(request)
			.setClazz(RoleRepresentation.class).execute().getOutput();
		Response response = representation.getMany();
		@SuppressWarnings("unchecked")
		Collection<RoleDto> dtos = (Collection<RoleDto>) response.readEntity(__inject__(TypeHelper.class)
				.instanciateGenericCollectionParameterizedTypeForJaxrs(Collection.class,RoleDto.class));
		
		for(RoleDto index : dtos)
			roles.add(__inject__(InstanceHelper.class).buildOne(RoleImpl.class, index));
					
		return roles;
	}
	
}

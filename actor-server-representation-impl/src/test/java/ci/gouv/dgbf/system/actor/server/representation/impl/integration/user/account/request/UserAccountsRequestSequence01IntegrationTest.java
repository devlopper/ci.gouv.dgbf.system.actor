package ci.gouv.dgbf.system.actor.server.representation.impl.integration.user.account.request;

import org.cyk.utility.server.representation.AbstractEntityCollection;
import org.cyk.utility.server.representation.test.arquillian.AbstractRepresentationArquillianIntegrationTestWithDefaultDeploymentAsSwram;
import org.jboss.arquillian.junit.InSequence;
import org.junit.Test;

import ci.gouv.dgbf.system.actor.server.representation.api.user.account.RoleRepresentation;
import ci.gouv.dgbf.system.actor.server.representation.api.user.account.request.UserAccountsRequestRepresentation;
import ci.gouv.dgbf.system.actor.server.representation.entities.user.account.RoleDtoCollection;
import ci.gouv.dgbf.system.actor.server.representation.entities.user.account.request.UserAccountsRequestDto;

/**
 * Not connected user 
 * 1 - create user account request
 * 2 - consult user account request
 * 3 - print user account request
 * 
 * @author CYK
 *
 */
public class UserAccountsRequestSequence01IntegrationTest extends AbstractRepresentationArquillianIntegrationTestWithDefaultDeploymentAsSwram {
	private static final long serialVersionUID = 1L;
	
	/* Setup */
	
	@Test @InSequence(1)
	public void setup() throws Exception{
		__inject__(RoleRepresentation.class).createMany(new RoleDtoCollection().add("r01").add("r02").add("r03").add("r04").add("r05"));
		assertionHelper.assertEqualsNumber(5, __inject__(RoleRepresentation.class).count().getEntity());
	}
	
	@Test @InSequence(2)
	public void createUserAccountsRequest() throws Exception{
		UserAccountsRequestDto userAccountsRequestDto = new UserAccountsRequestDto();
		userAccountsRequestDto.setCode("uar001");
		userAccountsRequestDto.addRoles("r02","r04");
		userAccountsRequestDto.addServices("EL");
		userAccountsRequestDto.addPerson("konan", "marc");
		__inject__(UserAccountsRequestRepresentation.class).createOne(userAccountsRequestDto);
		
		userAccountsRequestDto = (UserAccountsRequestDto) __inject__(UserAccountsRequestRepresentation.class).getOne("uar001", "business").getEntity();
		
		assertionHelper.assertNotNull(userAccountsRequestDto);
		assertionHelper.assertNotNull(userAccountsRequestDto.getRoles());
		assertionHelper.assertEqualsNumber(2, userAccountsRequestDto.getRoles().size());
		assertionHelper.assertNotNull(userAccountsRequestDto.getServices());
		assertionHelper.assertEqualsNumber(1, userAccountsRequestDto.getServices().size());
		assertionHelper.assertNotNull(userAccountsRequestDto.getPersons());
		assertionHelper.assertEqualsNumber(1, userAccountsRequestDto.getPersons().size());
		assertionHelper.assertEquals("konan", userAccountsRequestDto.getPersons().iterator().next().getFirstName());
	}
	
	@Override
	protected <ENTITY> Class<? extends AbstractEntityCollection<ENTITY>> __getEntityCollectionClass__(Class<ENTITY> aClass) {
		return null;
	}
	

}

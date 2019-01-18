package ci.gouv.dgbf.system.actor.server.representation.impl.integration.user.account.request;

import org.cyk.utility.server.representation.AbstractEntityCollection;
import org.cyk.utility.server.representation.test.arquillian.AbstractRepresentationArquillianIntegrationTestWithDefaultDeploymentAsSwram;
import org.junit.Test;

import ci.gouv.dgbf.system.actor.server.representation.api.user.account.request.UserAccountsRequestRepresentation;
import ci.gouv.dgbf.system.actor.server.representation.entities.user.account.request.UserAccountsRequestDto;

public class UserAccountsRequestFunctionIntegrationTestWait extends AbstractRepresentationArquillianIntegrationTestWithDefaultDeploymentAsSwram {
	private static final long serialVersionUID = 1L;
	
	/* Create */
	
	@Test
	public void createOneUserAccountsRequest() throws Exception{
		UserAccountsRequestDto userAccountsRequestDto = new UserAccountsRequestDto();
		userAccountsRequestDto.setCode("uar001");
		__inject__(UserAccountsRequestRepresentation.class).createOne(userAccountsRequestDto);
		
		userAccountsRequestDto = (UserAccountsRequestDto) __inject__(UserAccountsRequestRepresentation.class).getOne("uar001", "business").getEntity();
		
		assertionHelper.assertNull(userAccountsRequestDto.getRoles());
		
		//__inject__(TestRepresentationCreate.class).addObjects(userAccountsRequestDto).execute();
	}
	
	@Override
	protected <ENTITY> Class<? extends AbstractEntityCollection<ENTITY>> __getEntityCollectionClass__(Class<ENTITY> aClass) {
		return null;
	}
	

}

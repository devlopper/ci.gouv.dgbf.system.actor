package ci.gouv.dgbf.system.actor.server.representation.impl.integration.user.account.request;

import org.cyk.utility.server.representation.AbstractEntityCollection;
import org.cyk.utility.server.representation.test.arquillian.AbstractRepresentationArquillianIntegrationTestWithDefaultDeploymentAsSwram;
import org.junit.Test;

import ci.gouv.dgbf.system.actor.server.representation.api.user.account.request.UserAccountRequestRepresentation;
import ci.gouv.dgbf.system.actor.server.representation.entities.user.account.request.UserAccountRequestDto;

public class UserAccountRequestFunctionIntegrationTestWait extends AbstractRepresentationArquillianIntegrationTestWithDefaultDeploymentAsSwram {
	private static final long serialVersionUID = 1L;
	
	/* Create */
	
	@Test
	public void createOneUserAccountRequest() throws Exception{
		UserAccountRequestDto userAccountRequestDto = new UserAccountRequestDto();
		userAccountRequestDto.setCode("uar001");
		__inject__(UserAccountRequestRepresentation.class).createOne(userAccountRequestDto);
		
		userAccountRequestDto = (UserAccountRequestDto) __inject__(UserAccountRequestRepresentation.class).getOne("uar001", "business").getEntity();
		
		assertionHelper.assertNull(userAccountRequestDto.getRoles());
		
		//__inject__(TestRepresentationCreate.class).addObjects(userAccountRequestDto).execute();
	}
	
	@Override
	protected <ENTITY> Class<? extends AbstractEntityCollection<ENTITY>> __getEntityCollectionClass__(Class<ENTITY> aClass) {
		return null;
	}
	

}

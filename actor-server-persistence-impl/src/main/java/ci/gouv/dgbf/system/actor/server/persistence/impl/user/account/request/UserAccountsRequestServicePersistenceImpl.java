package ci.gouv.dgbf.system.actor.server.persistence.impl.user.account.request;

import java.io.Serializable;
import java.util.Collection;

import javax.inject.Singleton;

import org.cyk.utility.__kernel__.computation.ComparisonOperator;
import org.cyk.utility.server.persistence.jpa.AbstractPersistenceEntityImpl;
import org.cyk.utility.server.persistence.query.PersistenceQuery;
import org.cyk.utility.server.persistence.query.PersistenceQueryRepository;
import org.cyk.utility.sql.builder.QueryStringBuilderSelect;

import ci.gouv.dgbf.system.actor.server.persistence.api.user.account.request.UserAccountsRequestServicePersistence;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountsRequest;
import ci.gouv.dgbf.system.actor.server.persistence.entities.user.account.request.UserAccountsRequestService;

@Singleton
public class UserAccountsRequestServicePersistenceImpl extends AbstractPersistenceEntityImpl<UserAccountsRequestService> implements UserAccountsRequestServicePersistence,Serializable {
	private static final long serialVersionUID = 1L;

	private String readByUserAccountsRequest;
	
	@Override
	protected void __listenPostConstructPersistenceQueries__() {
		super.__listenPostConstructPersistenceQueries__();
		addQueryCollectInstances(readByUserAccountsRequest, __instanciateQuerySelect__()
				.getWherePredicateBuilderAsEqual().addOperandBuilderByAttribute(UserAccountsRequestService.FIELD_USER_ACCOUNTS_REQUEST,ComparisonOperator.EQ)
				.getParentAsWhereClause().getParentAs(QueryStringBuilderSelect.class));
	}
	
	@Override
	protected Object[] __getQueryParameters__(String queryIdentifier, Object... objects) {
		PersistenceQuery persistenceQuery = __inject__(PersistenceQueryRepository.class).getBySystemIdentifier(queryIdentifier);
		
		if(persistenceQuery.isIdentifierEqualsToOrQueryDerivedFromQueryIdentifierEqualsTo(readByUserAccountsRequest,queryIdentifier))
			return new Object[]{UserAccountsRequestService.FIELD_USER_ACCOUNTS_REQUEST,objects[0]};
		
		return super.__getQueryParameters__(queryIdentifier, objects);
	}
	
	@Override
	public Collection<UserAccountsRequestService> readByUserAccountsRequest(UserAccountsRequest userAccountsRequest) {
		return __readMany__(____getQueryParameters____(userAccountsRequest));
	}

	
}

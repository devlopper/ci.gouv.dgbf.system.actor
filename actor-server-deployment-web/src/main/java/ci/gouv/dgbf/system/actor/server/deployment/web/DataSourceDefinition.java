package ci.gouv.dgbf.system.actor.server.deployment.web;
/*
@javax.annotation.sql.DataSourceDefinition(
		name="java:global/actor/server/dataSource",
		className="org.h2.jdbcx.JdbcDataSource",
		url="jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE",
		user="sa",
		password="sa"
)
*/
/*
@javax.annotation.sql.DataSourceDefinition(
		name="java:global/actor/server/dataSource",
		className="com.mysql.jdbc.jdbc2.optional.MysqlDataSource",
		url="jdbc:mysql://localhost:3306/sib_actor",
		user="root",
		password="root"
)
*/

//Oracle
@javax.annotation.sql.DataSourceDefinition(
		name="java:global/actor/server/dataSource",
		className="oracle.jdbc.pool.OracleDataSource",
		url="jdbc:oracle:thin:@10.40.40.3:1521:xe",
		user="acteur",
		password="acteur"
)
public class DataSourceDefinition {

}

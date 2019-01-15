package ci.gouv.dgbf.system.actor.client.controller.impl.person;

import java.io.Serializable;

import javax.inject.Singleton;

import org.cyk.utility.client.controller.AbstractControllerEntityImpl;

import ci.gouv.dgbf.system.actor.client.controller.api.person.PersonController;
import ci.gouv.dgbf.system.actor.client.controller.entities.person.Person;

@Singleton
public class PersonControllerImpl extends AbstractControllerEntityImpl<Person> implements PersonController,Serializable {
	private static final long serialVersionUID = 1L;

}

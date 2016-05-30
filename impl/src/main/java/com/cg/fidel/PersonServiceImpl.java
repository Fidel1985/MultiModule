package com.cg.fidel;

import java.util.List;

import com.cg.helix.context.annotation.InjectConstructor;
import com.cg.helix.context.annotation.SingletonScope;
import com.cg.helix.mib.server.annotation.Component;
import com.cg.helix.persistence.PersistenceService;
import com.cg.helix.persistence.query.JoinType;
import com.cg.helix.persistence.transaction.annotation.ReadOnly;
import com.cg.helix.persistence.transaction.annotation.Transactional;

@Transactional
@SingletonScope
@Component
public class PersonServiceImpl implements PersonService {

    private final PersistenceService persistenceService;

    @InjectConstructor
    public PersonServiceImpl(PersistenceService persistenceService) {
        this.persistenceService = persistenceService;
    }

    @ReadOnly
    @Override
    public List<Person> findAll() {
        //return persistenceService.findAll().with("address").list(Person.class);
        return persistenceService.select(true)
                .from("/com/cg/fidel/Person")
                .join("address", JoinType.LEFT_FETCH)
                .orderBy("id")
                .list(Person.class);
    }

    @ReadOnly
    @Override
    public Person findById(String id){
        return persistenceService.findById(id).uniqueResult(Person.class);
    }

    @Override
    public Person saveOrUpdate(String id, String firstName, int age){
        Person person = new Person(id, firstName, age);
        persistenceService.saveOrUpdate().byObject(person).execute();
        return person;
    }

    @Override
    public void delete(String id){
        persistenceService.delete().from(Person.class).byObject(findById(id)).execute();
    }
}

package com.cg.fidel;

import java.util.List;

import com.cg.helix.mib.annotation.ComponentInterface;
import com.cg.helix.mib.annotation.Input;

@ComponentInterface
public interface PersonService {

    Person saveOrUpdate(@Input(name = "id") String id, @Input(name = "firstName") String firstName, @Input(name = "age") int age);
    Person findById(@Input(name = "id") String id);
    void delete(@Input(name = "id") String id);
    List<Person> findAll();
}

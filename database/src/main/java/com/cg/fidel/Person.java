package com.cg.fidel;

import com.cg.helix.persistence.metadata.annotation.BusinessObject;
import com.cg.helix.persistence.metadata.annotation.DatabaseTable;
import com.cg.helix.schemadictionary.annotation.ComplexType;
import com.cg.helix.schemadictionary.annotation.Element;
import com.cg.helix.schemadictionary.annotation.Id;

/**
 * @author Hans Kohlreiter, COREFT
 */
@ComplexType
@DatabaseTable
@BusinessObject
public class Person {

    @Id
    private String id;
    @Element(length = 30)
    private String firstName;
    @Element
    private int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
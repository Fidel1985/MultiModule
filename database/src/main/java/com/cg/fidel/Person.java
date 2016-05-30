package com.cg.fidel;

import java.util.List;
import java.util.Set;

import com.cg.helix.persistence.metadata.annotation.BusinessObject;
import com.cg.helix.persistence.metadata.annotation.BusinessObjectElement;
import com.cg.helix.persistence.metadata.annotation.CardinalityType;
import com.cg.helix.persistence.metadata.annotation.DatabaseTable;
import com.cg.helix.persistence.metadata.annotation.Relation;
import com.cg.helix.persistence.metadata.annotation.RelationJoin;
import com.cg.helix.persistence.metadata.annotation.TableIndex;
import com.cg.helix.schemadictionary.annotation.ComplexType;
import com.cg.helix.schemadictionary.annotation.Element;
import com.cg.helix.schemadictionary.annotation.Id;

@ComplexType
@DatabaseTable(
        indexes = @TableIndex(elementNames = {"firstName", "age"})
)
@BusinessObject
public class Person {

    @Id
    private String id;

    @Element(length = 30)
    private String firstName;

    @Element
    private int age;

    @Relation(
            cardinality = CardinalityType.ONE_TO_MANY,
            join = @RelationJoin(srcElement = "id", targetElement = "idPerson"))
    private List<Address> address;

    Person(){

    }

    Person(String id, String firstName, int age){
        this.id = id;
        this.firstName = firstName;
        this.age = age;
    }

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

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public List<Address> getAddress() {
        return address;
    }
}
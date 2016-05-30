package com.cg.fidel;

import java.util.Set;

import com.cg.helix.persistence.metadata.annotation.BusinessObject;
import com.cg.helix.persistence.metadata.annotation.BusinessObjectElement;
import com.cg.helix.persistence.metadata.annotation.CardinalityType;
import com.cg.helix.persistence.metadata.annotation.DatabaseTable;
import com.cg.helix.persistence.metadata.annotation.Relation;
import com.cg.helix.persistence.metadata.annotation.RelationJoin;
import com.cg.helix.schemadictionary.annotation.ComplexType;
import com.cg.helix.schemadictionary.annotation.Element;
import com.cg.helix.schemadictionary.annotation.Id;

@ComplexType
@DatabaseTable
@BusinessObject
public class Address {

    @Id
    private String id;

    @Element(length = 30)
    private String country;

    @Element(length = 40)
    private String city;

    @BusinessObjectElement(length=12)
    private String idPerson;

    @Relation(
            cardinality = CardinalityType.MANY_TO_ONE,
            join = @RelationJoin(srcElement = "idPerson", targetElement = "id"))
    private Person person;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {

        return id;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setIdPerson(String idPerson) {
        this.idPerson = idPerson;
    }

    public String getIdPerson() {
        return idPerson;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }
}

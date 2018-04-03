package com.videotutoriales.jpa;

import com.videotutoriales.jpa.Caller;
import com.videotutoriales.jpa.Objectcall;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-03T09:03:04")
@StaticMetamodel(Person.class)
public class Person_ { 

    public static volatile CollectionAttribute<Person, Caller> callerCollection;
    public static volatile SingularAttribute<Person, Integer> idPerson;
    public static volatile SingularAttribute<Person, String> sApellido;
    public static volatile SingularAttribute<Person, String> telefContact2;
    public static volatile SingularAttribute<Person, String> pApellido;
    public static volatile SingularAttribute<Person, String> telefContact1;
    public static volatile SingularAttribute<Person, String> nombre;
    public static volatile SingularAttribute<Person, String> email;
    public static volatile CollectionAttribute<Person, Objectcall> objectcallCollection;

}
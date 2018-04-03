package com.videotutoriales.jpa;

import com.videotutoriales.jpa.Calls;
import com.videotutoriales.jpa.Person;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-03T09:03:04")
@StaticMetamodel(Caller.class)
public class Caller_ { 

    public static volatile SingularAttribute<Caller, Person> idpersona;
    public static volatile CollectionAttribute<Caller, Calls> callsCollection;
    public static volatile SingularAttribute<Caller, Integer> idCaller;

}
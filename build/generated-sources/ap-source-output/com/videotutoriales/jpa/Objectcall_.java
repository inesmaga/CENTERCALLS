package com.videotutoriales.jpa;

import com.videotutoriales.jpa.Calls;
import com.videotutoriales.jpa.Person;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-03T09:03:04")
@StaticMetamodel(Objectcall.class)
public class Objectcall_ { 

    public static volatile SingularAttribute<Objectcall, Person> idpersona;
    public static volatile SingularAttribute<Objectcall, Integer> idObjectCall;
    public static volatile CollectionAttribute<Objectcall, Calls> callsCollection;

}
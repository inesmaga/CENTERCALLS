package com.videotutoriales.jpa;

import com.videotutoriales.jpa.Caller;
import com.videotutoriales.jpa.Objectcall;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-03T09:03:04")
@StaticMetamodel(Calls.class)
public class Calls_ { 

    public static volatile SingularAttribute<Calls, String> estado;
    public static volatile SingularAttribute<Calls, Objectcall> idObjetCall;
    public static volatile SingularAttribute<Calls, String> asunto;
    public static volatile SingularAttribute<Calls, Integer> idCalls;
    public static volatile SingularAttribute<Calls, String> telefonCall;
    public static volatile SingularAttribute<Calls, Caller> idllamante;
    public static volatile SingularAttribute<Calls, String> menssage;

}
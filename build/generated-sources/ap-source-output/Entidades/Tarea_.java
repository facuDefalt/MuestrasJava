package Entidades;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2025-01-15T20:54:00")
@StaticMetamodel(Tarea.class)
public class Tarea_ { 

    public static volatile SingularAttribute<Tarea, LocalDateTime> fecha;
    public static volatile SingularAttribute<Tarea, String> estado;
    public static volatile SingularAttribute<Tarea, String> nombreTarea;
    public static volatile SingularAttribute<Tarea, Integer> id;

}
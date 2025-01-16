package Servicios;

import Entidades.Tarea;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Persistence;


public class tareaService implements Serializable {
    EntityManagerFactory emf =Persistence.createEntityManagerFactory("listaDeTareasPU");
    EntityManager em = emf.createEntityManager();
    
    //gestiono la conexión y desconexión a la base de datos mediante JPA
    public void Conectar(){
        if(!em.isOpen()){
            em=emf.createEntityManager();
        }
    }
    public void Desconectar() {
        if (em.isOpen()) {
            em.close();
        }
    }
    
    public List<Tarea> RevisarTareas(){
        Conectar();
        List <Tarea> tareas=em.createQuery("SELECT t FROM Tarea t WHERE t.estado LIKE :Pendiente", Tarea.class).setParameter("Pendiente", "Pendiente").getResultList();
        Desconectar();
        return tareas;
    }
    
    public void GuardarTarea(Tarea tarea){
        Conectar();
        em.getTransaction().begin();
        em.persist(tarea);
        em.getTransaction().commit();
        
        Desconectar();
    }
    
    public void editar(Tarea tarea){
        Conectar();
        em.getTransaction().begin();
        em.merge(tarea);
        em.getTransaction().commit();
        Desconectar();
        
    }
    
}

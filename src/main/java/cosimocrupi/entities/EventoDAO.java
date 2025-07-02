package cosimocrupi.entities;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class EventoDAO {
    private EntityManager entityManager;
    public EventoDAO(EntityManager entityManager){
        this.entityManager=entityManager;
    }
    public void save(Evento newEvento){
        EntityTransaction transaction= entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newEvento);
        transaction.commit();
        System.out.println("Inserito correttamente del database!");
    }
    public Evento getIdEvento(long eventoId){
        return entityManager.find(Evento.class, eventoId);
    }
    public void deleteEvento(long eventoId){
        Evento id= getIdEvento(eventoId);
        EntityTransaction tran= entityManager.getTransaction();
        tran.begin();
        entityManager.remove(id);
        tran.commit();
        System.out.println("L'evento è stato eliminato");
    }
}

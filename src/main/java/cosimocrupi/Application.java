package cosimocrupi;

import cosimocrupi.entities.Evento;
import cosimocrupi.entities.EventoDAO;
import cosimocrupi.entities.Tipo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.Random;

public class Application {
    private static final EntityManagerFactory emf= Persistence.createEntityManagerFactory("B-S3-L2");
    private static final EntityManager em= emf.createEntityManager();
    public static void main(String[] args) {
        LocalDate today= LocalDate.now();
        Random random=new Random();
        LocalDate rndDay=today.plusDays(random.nextInt(10));
        EventoDAO ev= new EventoDAO(em);
        Evento e1= new Evento("White party", rndDay, "vestirsi di bianco", Tipo.PUBBLICO, 150);
        ev.save(e1);
    }
}

package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Persistencia {
    private final EntityManagerFactory emf;
    private final EntityManager em;
        
    public Persistencia() {
        this.emf = Persistence.createEntityManagerFactory("PrincipalPU");
        this.em = emf.createEntityManager();            
    }
    
    public void insertar(Object o) {
        this.em.getTransaction().begin();
        this.em.persist(o);
        this.em.getTransaction().commit();
    }
    
    public void modificar(Object o){
        this.em.getTransaction().begin();
        this.em.merge(o);
        this.em.getTransaction().commit();
    }

    public void eliminar(Object o){
        this.em.getTransaction().begin();
        this.em.remove(o);
        this.em.getTransaction().commit();
    }
    
    public Object buscar(Class clase, Object id) {
        Object o = em.find(clase,id);
        return o;
    }

    public void refrescar(Object o) {
        this.em.refresh(o);
    }
   
}

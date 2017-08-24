package jpacontrol;

import entity.Customer;
import entity.User;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Populate
{
    public static void main(String[] args)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaPU");
        
        EntityManager em = emf.createEntityManager();
                
        em.getTransaction().begin();

        User u = new User();
        u.setFirstName("William");
        em.persist(u);

        Customer c = new Customer();
        c.setFirstName("FN");
        c.setLastName("LN");
        c.setType(Customer.CustomerType.GOLD);
        em.persist(c);

        em.getTransaction().commit();
        
        em.close();
    }
}

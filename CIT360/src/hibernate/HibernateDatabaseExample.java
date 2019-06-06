/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import java.util.Iterator;
import java.util.List;
import javax.imageio.spi.ServiceRegistry;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import view.ErrorView;

/**
 *
 * @author Bryan
 */
public class HibernateDatabaseExample {

    public static SessionFactory factory;

    public HibernateDatabaseExample() {
        // Empty constructor
    }

    public void hibernateExample() {

        Configuration cfg = new Configuration().addAnnotatedClass(Subscriber.class).configure("hibernate.cfg.xml");

        try {
            factory = cfg.buildSessionFactory();

        } catch (Throwable ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
            System.out.println("Failed to start session.");
        }

        showSubscribers();

        factory.close();
    }

    /* Method to  READ all the subscribers */
    public void showSubscribers() {
        Session session = factory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            List subscribers = session.createQuery("FROM Subscriber").list();
            for (Iterator iterator = subscribers.iterator(); iterator.hasNext();) {
                Subscriber subscriber = (Subscriber) iterator.next();
                System.out.println("Id#: " + subscriber.getSubscriberKey());
                System.out.println("First name: " + subscriber.getFirstName());
                System.out.println("Last name: " + subscriber.getLastName());
                System.out.println("City: " + subscriber.getCity());
            }

            transaction.commit();
        } catch (HibernateException e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}

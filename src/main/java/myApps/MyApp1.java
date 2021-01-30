package myApps;

import daoService.Factory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class MyApp1 {
    private SessionFactory factory;
    public void createTable(){
        factory = Factory.getSessionFactory();
        try(Session session = factory.getCurrentSession()) {
            session.beginTransaction();

            session.createNativeQuery("DROP TABLE IF EXISTS test_work.records cascade;").executeUpdate();
            session.createNativeQuery("CREATE TABLE test_work.records (" +
                    "full_name  VARCHAR(250) NOT NULL, " +
                    "date_of_birth DATE NOT NULL," +
                    "gender VARCHAR(40) NOT NULL, PRIMARY KEY (full_name, date_of_birth));").executeUpdate();
            session.getTransaction().commit();
        }
    }
}

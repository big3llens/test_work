package daoService;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Factory {
    public static SessionFactory getSessionFactory (){
        SessionFactory factory = new Configuration().configure("configs/config.hibernate.xml").buildSessionFactory();
        return factory;
    }
}

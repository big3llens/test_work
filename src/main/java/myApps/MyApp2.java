package myApps;

import daoService.Factory;
import model.PrimaryKey;
import model.Record;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyApp2 {
    SessionFactory factory;
    public void createRecord(String fullName, int year, int month, int day, String gender){
        factory = Factory.getSessionFactory();
        try(Session session = factory.getCurrentSession()){
            Record newRecord = new Record(fullName, new GregorianCalendar(year, month, day), gender);
            session.beginTransaction();
            session.save(newRecord);
            session.getTransaction().commit();
        }
    }
}

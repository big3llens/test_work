package myApps;

import daoService.Factory;
import model.Record;
import model.RecordWithAge;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.Query;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class MyApp3 {
    Calendar currentData = new GregorianCalendar(2021,01,01);
    List<Record> list;
    SessionFactory factory;
    public void findUniqueValues(){
        factory = Factory.getSessionFactory();
        try (Session session = factory.getCurrentSession()){
            session.beginTransaction();
//            Query query = session.createNativeQuery("SELECT distinct full_name, date_of_birth, gender FROM test_work.records;");
            Query query = session.createQuery("select distinct r from Record r");
            list = query.getResultList();
            session.getTransaction().commit();
        }
        for (Record r: list) {
            System.out.println(new RecordWithAge(r.getFullName(), r.getDateOfBirth(), r.getGender(), (currentData.getTimeInMillis() - r.getDateOfBirth().getTimeInMillis())/1000/60/60/24/366).toString());
        }

    }

}

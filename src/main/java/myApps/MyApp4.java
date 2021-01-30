package myApps;

import daoService.Factory;
import model.Record;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utilitiess.DataGeneration;
import utilitiess.ListNames;

public class MyApp4 {
    SessionFactory factory;
    private boolean isMale = false;

    public void generationRecords(){
        factory = Factory.getSessionFactory();
        ListNames.addNames();
//        try(Session session = factory.getCurrentSession()){

            for (int i = 0; i < 500; i++){
                try(Session session = factory.getCurrentSession()){
                    session.beginTransaction();
                    if(i % 2 == 0) isMale = true;
                    else isMale = false;
                    Record record = DataGeneration.generationRecords(isMale);
                    session.saveOrUpdate(record);
                    session.getTransaction().commit();
                }
            }

//        }
    }
}

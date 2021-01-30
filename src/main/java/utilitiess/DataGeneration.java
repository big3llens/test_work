package utilitiess;

import model.Record;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DataGeneration {

    public static String generationFullName(boolean male){
        StringBuilder name = new StringBuilder();
        if(male){
            String firstName = ListNames.getListOfMaleFirstNames().get((int)(Math.random()*14));
            String surname = ListNames.getListOfSurnames().get((int)(Math.random()*24));
            String lastName = ListNames.getListOfMaleFirstNames().get((int)(Math.random()*14));
            name.append(firstName + " " + surname + " " + lastName);
            return name.toString();
        }
        String firstName = ListNames.getListOfFemaleFirstNames().get((int)(Math.random()*14));
        String surname = ListNames.getListOfSurnames().get((int)(Math.random()*24));
        String lastName = ListNames.getListOfMaleFirstNames().get((int)(Math.random()*14));
        name.append(firstName + " " + surname + " " + lastName);
        return name.toString();
    }

    public static GregorianCalendar generationDateOfBirth(){
        Calendar calendar = new GregorianCalendar((1975 + (int)(Math.random()*(2007 - 1975))), (int)(Math.random()*12), (int)(Math.random()*30));
        return (GregorianCalendar) calendar;
    }

    public static Record generationRecords(boolean male){
        String gender;
        if(male) gender = "male";
        else gender = "female";
        return new Record(generationFullName(male), generationDateOfBirth(), gender);
    }
}

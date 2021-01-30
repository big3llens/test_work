package utilitiess;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ListNames {
    private static List<String> listOfMaleFirstNames = new ArrayList<>();
    private static List<String> listOfFemaleFirstNames = new ArrayList<>();
    private static List<String> listOfSurnames = new ArrayList<>();

    public static void addNames(){
        listOfFemaleFirstNames.add("Emilу");
        listOfFemaleFirstNames.add("Hannah");
        listOfFemaleFirstNames.add("Natalie");
        listOfFemaleFirstNames.add("Sophia");
        listOfFemaleFirstNames.add("Ella");
        listOfFemaleFirstNames.add("Madison");
        listOfFemaleFirstNames.add("Sydney");
        listOfFemaleFirstNames.add("Anna");
        listOfFemaleFirstNames.add("Taylor");
        listOfFemaleFirstNames.add("Isabella");
        listOfFemaleFirstNames.add("Kayla");
        listOfFemaleFirstNames.add("Victoria");
        listOfFemaleFirstNames.add("Elizabeth");
        listOfFemaleFirstNames.add("Ashley");
        listOfFemaleFirstNames.add("Rachel");

        listOfMaleFirstNames.add("Anthony");
        listOfMaleFirstNames.add("James");
        listOfMaleFirstNames.add("Aidan");
        listOfMaleFirstNames.add("Jackson");
        listOfMaleFirstNames.add("David");
        listOfMaleFirstNames.add("Mason");
        listOfMaleFirstNames.add("Logan");
        listOfMaleFirstNames.add("Alexander");
        listOfMaleFirstNames.add("Charles");
        listOfMaleFirstNames.add("Bryan");
        listOfMaleFirstNames.add("Tyler");
        listOfMaleFirstNames.add("Isaac");
        listOfMaleFirstNames.add("John");
        listOfMaleFirstNames.add("Luis");
        listOfMaleFirstNames.add("Benjamin");

        listOfSurnames.add("Smith");
        listOfSurnames.add("Johnson");
        listOfSurnames.add("Williams");
        listOfSurnames.add("Jones");
        listOfSurnames.add("Brown");
        listOfSurnames.add("Davis");
        listOfSurnames.add("Miller");
        listOfSurnames.add("Wilson");
        listOfSurnames.add("Moore");
        listOfSurnames.add("Taylor");
        listOfSurnames.add("Anderson");
        listOfSurnames.add("Thomas");
        listOfSurnames.add("Jackson");
        listOfSurnames.add("White");
        listOfSurnames.add("Harris");
        listOfSurnames.add("Martin");
        listOfSurnames.add("Thompson");
        listOfSurnames.add("Wood");
        listOfSurnames.add("Lewis");
        listOfSurnames.add("Scott");
        listOfSurnames.add("Cooper");
        listOfSurnames.add("King");
        listOfSurnames.add("Green");
        listOfSurnames.add("Walker");
        listOfSurnames.add("Hill");
    }

    public static List<String> getListOfMaleFirstNames() {
        return listOfMaleFirstNames;
    }

    public static List<String> getListOfFemaleFirstNames() {
        return listOfFemaleFirstNames;
    }

    public static List<String> getListOfSurnames() {
        return listOfSurnames;
    }
}

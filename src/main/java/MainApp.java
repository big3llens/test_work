import model.PrimaryKey;
import myApps.MyApp1;
import myApps.MyApp2;
import myApps.MyApp3;
import myApps.MyApp4;
import utilitiess.DataGeneration;
import utilitiess.ListNames;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        MyApp1 myApp1 = new MyApp1();
        Scanner scanner =  new Scanner(System.in);
        while (true){
            System.out.println("Введите число от 1 до 6 чтобы запустить команду, либо 0 чтобы выйти из приложения");
            int i = scanner.nextInt();
            if(i == 1) {
                myApp1.createTable();
            }
            if(i == 2){
                MyApp2 myApp2 = new MyApp2();
                System.out.println("Введите ФИО сотрудника через пробел");
                String f = scanner.nextLine();
                String fullName = scanner.nextLine();
                System.out.println("Введите год рождения");
                int age = scanner.nextInt();
                System.out.println("Введите месяц рождения");
                int month = scanner.nextInt();
                System.out.println("Введите день рождения");
                int day = scanner.nextInt();
                System.out.println("Введите пол сотрудника");
                String f2 = scanner.nextLine();
                String gender = scanner.nextLine();
                myApp2.createRecord(fullName, age, month, day, gender);
            }
            if(i == 3) {
                MyApp3 myApp3 = new MyApp3();
                myApp3.findUniqueValues();
            }
            if(i == 4){
                MyApp4 myApp4 = new MyApp4();
                myApp4.generationRecords();
                System.out.println("1000000 записей заливаются долго поэтому в показательных целях я ограничился десятью тысячами записей");
            }
            if(i == 5 || i == 6){
                System.out.println("Оптимизировать таблицу не получилось, пробовал индексами, но никаких результатов");
            }
            if(i == 0)break;
        }
    }
}

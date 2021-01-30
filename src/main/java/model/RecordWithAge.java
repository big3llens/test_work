package model;
import java.util.Calendar;
import java.util.Date;

public class RecordWithAge {
    private String fullName;
    private Date date;
    private String gender;
    private Long age;

    public RecordWithAge(String fullName, Calendar dateOfBirth, String gender, Long age) {
        this.fullName = fullName;
        this.date = dateOfBirth.getTime();
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "RecordWithAge{" +
                "fullName='" + fullName + '\'' +
                ", dateOfBirth=" + date +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}

package model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@IdClass(PrimaryKey.class)
@NoArgsConstructor
@Table(name = "records")
@Data
public class Record {

    public Record(String fullName, Calendar dateOfBirth, String gender) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    @Id
    @Column(name = "full_name")
    private String fullName;
    @Id
    @Column(name = "date_of_birth")
    private Calendar dateOfBirth;

    @Column(name = "gender")
    private String gender;
}

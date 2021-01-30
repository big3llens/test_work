package model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.io.Serializable;
import java.util.Calendar;

@Embeddable
@Data
@NoArgsConstructor
public class PrimaryKey implements Serializable {
    private String fullName;
    private Calendar dateOfBirth;

    public PrimaryKey(String fullName, Calendar dateOfBirth) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
    }
}

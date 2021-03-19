package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private String name;
    private String surname;
    private int age;
    private String groupNumber;
    private String faculty;

}

package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class Student {

    private Long id;
    private String name;
    private String surname;
    private int age;
    private String groupNumber;
    private String faculty;

}


import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    public boolean equals(Object compared) {
        
        if (this == compared) {
            return true;
        }

        // if the object is not instance of SimpleDate, the objects are not the same
        if (!(compared instanceof Person)) {
            return false;
        }
        
        Person p=(Person)compared;
        
        
        if (this.name.equals(p.name) && this.height == p.height && this.weight == p.weight && this.birthday.equals(p.birthday)) {
            return true;
        } else {
            return false;
        }
    }

}

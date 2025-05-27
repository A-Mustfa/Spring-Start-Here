package Spring.Examples.Classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String Name;

    private Person person;
    @Autowired
    public Vehicle(Person person) {
        this.person = person;
    }




    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Name='" + Name + '\'' +
                '}';
    }
}

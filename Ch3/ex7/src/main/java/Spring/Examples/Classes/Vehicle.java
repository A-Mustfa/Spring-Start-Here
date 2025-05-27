package Spring.Examples.Classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Vehicle {
    private String Name;

    private Person person;

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

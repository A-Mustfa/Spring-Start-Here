package Spring.Examples.Classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "ziad";

    private final Vehicle vehicle;
    @Autowired
    public Person(Vehicle ve){
        this.vehicle = ve;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", vehicle=" + vehicle +
                '}';
    }
}

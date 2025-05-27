package Spring.Examples.Classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "islam";

    private Vehicle vehicle;
    @Autowired
    public Person(Vehicle v1) {
        this.vehicle = v1;
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

package Spring.Examples.Classes;

import org.springframework.stereotype.Component;


public class Person {
    private String name;
    private Vehicle vehicle;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
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

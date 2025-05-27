package Spring.Examples.Classes;

public class Vehicle {
    private String Name;

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

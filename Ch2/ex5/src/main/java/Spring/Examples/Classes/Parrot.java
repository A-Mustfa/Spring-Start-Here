package Spring.Examples.Classes;

import org.springframework.stereotype.Component;
// adding beans via stereotype annotations
@Component
public class Parrot {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

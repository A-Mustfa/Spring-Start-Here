package Spring.Examples.Classes;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

public class Parrot {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

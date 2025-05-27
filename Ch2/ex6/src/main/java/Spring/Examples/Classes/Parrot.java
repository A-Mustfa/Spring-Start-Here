package Spring.Examples.Classes;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
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

//    runs after added to context -- dependency : jakarta annotation api
    @PostConstruct
    public void init() {
        this.name = "init";

    }
    @PreDestroy
    public void destroy(){
        System.out.println("destroyed");
    }

}

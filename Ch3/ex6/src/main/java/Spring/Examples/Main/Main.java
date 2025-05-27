package Spring.Examples.Main;

import Spring.Examples.Classes.Person;
import Spring.Examples.Config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);

        Person p = context.getBean(Person.class);

    }
}
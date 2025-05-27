package Spring.Examples.Main;

import Spring.Examples.Classes.Parrot;
import Spring.Examples.Config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


// adding bean and config file
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        Parrot PFromContext = context.getBean(Parrot.class);
        System.out.println(PFromContext.getName());
    }
}
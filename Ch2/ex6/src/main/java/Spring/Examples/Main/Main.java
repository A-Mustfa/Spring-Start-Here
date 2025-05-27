package Spring.Examples.Main;

import Spring.Examples.Classes.Parrot;
import Spring.Examples.Config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
// @PostConstruct annotation
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);


        Parrot p1 = context.getBean(Parrot.class);
        System.out.println(p1.getName());
        context.close();

        
    }
}
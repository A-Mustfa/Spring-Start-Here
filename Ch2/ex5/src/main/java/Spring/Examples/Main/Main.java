package Spring.Examples.Main;

import Spring.Examples.Classes.Parrot;
import Spring.Examples.Config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
// adding @Primary annotation to be the default bean
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);


        Parrot p1 = context.getBean(Parrot.class);
        // we cannot modify instance before it being in the context we only have access to it after getting it via context
        p1.setName("test");
        System.out.println(p1.getName());

    }
}
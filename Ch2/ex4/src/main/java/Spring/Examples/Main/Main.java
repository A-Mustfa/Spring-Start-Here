package Spring.Examples.Main;

import Spring.Examples.Classes.Parrot;
import Spring.Examples.Config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
// adding @Primary annotation to be the default bean
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);

//      calling the default bean
        Parrot P1 = context.getBean(Parrot.class);
        System.out.println(P1.getName());



    }
}
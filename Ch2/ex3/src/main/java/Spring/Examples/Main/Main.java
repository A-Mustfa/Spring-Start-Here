package Spring.Examples.Main;

import Spring.Examples.Classes.Parrot;
import Spring.Examples.Config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);


        Parrot P1 = context.getBean("first",Parrot.class);
        System.out.println(P1.getName());

        Parrot P2 = context.getBean("second",Parrot.class);
        System.out.println(P2.getName());

        Parrot P3 = context.getBean("third",Parrot.class);
        System.out.println(P3.getName());


    }
}
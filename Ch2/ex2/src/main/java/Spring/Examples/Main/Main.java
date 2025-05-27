package Spring.Examples.Main;

import Spring.Examples.Classes.Parrot;
import Spring.Examples.Config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// calling bean by method name

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);

//      this will get an error cause there are multiple instances from same class
//      Parrot PFromContext = context.getBean("parrot2",Parrot.class);
//     -->   so we had to specify the method name
        Parrot P = context.getBean("parrot2",Parrot.class);
        System.out.println(P.getName());
    }
}
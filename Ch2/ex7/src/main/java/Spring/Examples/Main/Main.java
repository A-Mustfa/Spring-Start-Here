package Spring.Examples.Main;

import Spring.Examples.Classes.Parrot;
import Spring.Examples.Config.Config;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

// adding bean programmatically
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);

// declare the instance that you want to put inside the context
        Parrot p1 = new Parrot();
        p1.setName("kiki");

//      implement supplier that return the instance to pass it as a parameter
        Supplier<Parrot> parrotSupplier = ()-> p1;

        Supplier<Parrot> SeconedSupplier = () ->{
                Parrot p2 = new Parrot();
                p2.setName("nemo");
                return p2;
        };

        int random = (int) (Math.random()*10);
        System.out.println("randome val = "+random);

        if(random%2 == 0){
            context.registerBean("firstBean",Parrot.class,parrotSupplier);
        }else {
            context.registerBean("SecondBean",Parrot.class,SeconedSupplier);
        }
        Parrot result = null;
        try{
            result = context.getBean("firstBean",Parrot.class);
        }catch (NoSuchBeanDefinitionException ex){
            System.out.println("failed to register first bean ");
        }
        try{
            result = context.getBean("SecondBean",Parrot.class);
        }catch (NoSuchBeanDefinitionException ex){
            System.out.println("failed to register Seconed bean");
        }

        System.out.println("the bean in the context named : "+result.getName());



//      register bean into context via registerBean method
//        context.registerBean("firstBean",Parrot.class,parrotSupplier,x -> x.setPrimary(true));


        
    }
}
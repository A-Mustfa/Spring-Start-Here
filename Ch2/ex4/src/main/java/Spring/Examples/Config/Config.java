package Spring.Examples.Config;

import Spring.Examples.Classes.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Config {

//  there are different attributes to name the bean and use them to get that bean from the context
    @Bean(value = "first")
    Parrot parrot(){
        Parrot p = new Parrot();
        p.setName("koko");
        return p;
    }
    @Bean(name = "second")
    Parrot parrot2(){
        Parrot p = new Parrot();
        p.setName("lolo");
        return p;
    }
    @Bean("third")
    @Primary
    Parrot parrot3(){
        Parrot p = new Parrot();
        p.setName("kike");
        return p;
    }
}

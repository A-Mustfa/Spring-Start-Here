package Spring.Examples.Config;

import Spring.Examples.Classes.Person;
import Spring.Examples.Classes.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "Spring.Examples")
public class Config {

    @Bean
    Vehicle v1(){
        Vehicle v1 = new Vehicle();
        v1.setName("mercedes");
        return v1;
    }
    @Bean
    Vehicle v2(){
        Vehicle v2 = new Vehicle();
        v2.setName("BMW");
        return v2;
    }





}

package Spring.Examples.Config;

import Spring.Examples.Classes.Person;
import Spring.Examples.Classes.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Config {
    @Bean
    Vehicle vehicle(){
        Vehicle v = new Vehicle();
        v.setName("Honda");
        return v;
    }

    @Bean
    Person person(){
        Person p = new Person();
        p.setName("ahmed");
        p.setVehicle(vehicle());
        return p;
    }


}

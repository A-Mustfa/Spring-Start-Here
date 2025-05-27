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
        v.setName("Toyota");
        return v;
    }

    @Bean
    Person person(Vehicle v){
        Person p = new Person();
        p.setName("mohamed");
        p.setVehicle(v);
        return p;
    }


}

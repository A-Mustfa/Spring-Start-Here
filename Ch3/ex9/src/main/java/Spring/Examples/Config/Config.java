package Spring.Examples.Config;

import Spring.Examples.Classes.Person;
import Spring.Examples.Classes.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
@ComponentScan(basePackages = "Spring.Examples")
public class Config {

    @Bean("firstVehicle")

    Vehicle vehicle(){
        Vehicle v1 = new Vehicle();
        v1.setName("mercedes");
        return v1;
    }
    @Bean("secondVehicle")
    Vehicle v2(){
        Vehicle v2 = new Vehicle();
        v2.setName("BMW");
        return v2;
    }





}

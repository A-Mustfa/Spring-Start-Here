package Spring.Examples.Config;

import Spring.Examples.Classes.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    Parrot parrot(){
        Parrot p = new Parrot();
        p.setName("koko");
        return p;
    }

}

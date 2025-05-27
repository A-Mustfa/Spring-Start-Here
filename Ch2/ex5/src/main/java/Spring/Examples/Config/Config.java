package Spring.Examples.Config;

import Spring.Examples.Classes.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// added @ComponentScan annotation to struct spring scan for the components inside the given package
@ComponentScan(basePackages = "Spring.Examples")
@Configuration
public class Config {


}

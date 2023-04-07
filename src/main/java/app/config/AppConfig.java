package app.config;

import app.model.Dog;
import app.model.Timer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {
    @Bean(name = "dog")
    public Dog getHelloWorld() {
        Dog dog1 = new Dog();
        dog1.setName("Шарик");
        return dog1;
    }
    @Bean(name = "timer")
    public Long getTime() {
        Timer timer = new Timer();
        return timer.getTime();
    }
}

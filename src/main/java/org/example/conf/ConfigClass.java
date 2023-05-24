package org.example.conf;


import org.example.model.Broker;
import org.example.model.Car;
import org.example.model.Engineer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "org.example.model")
public class ConfigClass {

    @Bean
    @Qualifier("bmw")
    public Car getCar() {
        Engineer engineer = new Engineer();
        engineer.setName("Ion");
        return new Car(engineer);
    }

    @Bean
    @Qualifier("audi")
    public Car getCar2() {
        return new Car(getEngineer());
    }

    @Bean
    public Engineer getEngineer() {
        Engineer engineer = new Engineer();
        engineer.setName("Iwan");
        return engineer;
    }

    @Bean
    public Broker getBroker() {
        return new Broker();
    }
}

package org.example.conf;


import org.example.model.Audi;
import org.example.model.BMW;
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
    @Qualifier("Audi")
    public Car getAudi() {
        Engineer engineer = new Engineer();
        engineer.setName("Iwan");
        return new Audi(engineer);
    }

    @Bean
    @Qualifier("BMW")
    public Car getBMW() {
        return new BMW(getEngineer());
    }

    @Bean
    public Engineer getEngineer() {
        Engineer engineer = new Engineer();
        engineer.setName("Ion");
        return engineer;
    }

    @Bean
    public Broker getBroker() {
        return new Broker();
    }
}

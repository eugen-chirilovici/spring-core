package org.example.conf;


import org.example.model.Broker;
import org.example.model.Engineer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "org.example.model")
public class ConfigClass {

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

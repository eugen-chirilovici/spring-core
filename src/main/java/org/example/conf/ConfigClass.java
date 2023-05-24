package org.example.conf;


import org.example.model.Car;
import org.example.model.Engineer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {

    @Bean
    Car getCar() {
        Car car = new Car();
        car.setEngineer(getEngineer());
        return car;
    }

    @Bean
    Engineer getEngineer() {
        return new Engineer();
    }
}

package org.example.model;

import org.springframework.stereotype.Component;

@Component
public class Car {

    private Engineer engineer;

    public Car(Engineer engineer) {
        this.engineer = engineer;
    }

    public Engineer getEngineer() {
        return engineer;
    }
}

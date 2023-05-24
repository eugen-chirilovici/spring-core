package org.example.model;

public class Car {

    private Engineer engineer;

    public Car(Engineer engineer) {
        this.engineer = engineer;
    }

    public Engineer getEngineer() {
        return engineer;
    }
}


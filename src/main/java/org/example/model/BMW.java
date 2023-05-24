package org.example.model;

public class BMW implements Car {

    private Engineer engineer;

    public BMW(Engineer engineer) {
        this.engineer = engineer;
    }

    @Override
    public Engineer getEngineer() {
        return engineer;
    }
}

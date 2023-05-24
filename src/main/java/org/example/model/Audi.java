package org.example.model;

public class Audi implements Car {

    private Engineer engineer;

    public Audi(Engineer engineer) {
        this.engineer = engineer;
    }

    @Override
    public Engineer getEngineer() {
        return engineer;
    }
}

package org.example.model;

import org.springframework.stereotype.Component;

@Component("Audi")
public class Audi implements Car {

    private Engineer engineer;

    public Audi(Engineer engineer) {
        this.engineer = engineer;
    }

    @Override
    public Engineer getEngineer() {
        return engineer;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "engineer=" + engineer +
                '}';
    }
}

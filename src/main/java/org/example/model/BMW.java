package org.example.model;

import org.springframework.stereotype.Component;

@Component("BMW")
public class BMW implements Car {

    private Engineer engineer;

    public BMW(Engineer engineer) {
        this.engineer = engineer;
    }

    @Override
    public Engineer getEngineer() {
        return engineer;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "engineer=" + engineer +
                '}';
    }
}

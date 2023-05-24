package org.example.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    private Engineer engineer;

    public Engineer getEngineer() {
        return engineer;
    }

}

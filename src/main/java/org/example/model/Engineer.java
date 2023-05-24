package org.example.model;

import org.springframework.stereotype.Component;

@Component
public class Engineer {
    private String name = "Vanea";

    public String getName() {
        return name;
    }
}

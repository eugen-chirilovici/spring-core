package org.example.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Broker {

    @Autowired
    @Qualifier("Audi")
    private Car car;

    private String brokerName = "Edward";

    @Override
    public String toString() {
        return "Broker{" +
                "car=" + car +
                ", brokerName='" + brokerName + '\'' +
                '}';
    }

}

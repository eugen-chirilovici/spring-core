package org.example.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Broker {

    @Autowired

    private Car car;

    private String brokerName = "Edward";

    public String getEngineerAndBrokerResponsible() {
        return "Broker name: " + brokerName + "\n" +
                "Engineer name: " + car.getEngineer().getName();
    }

}

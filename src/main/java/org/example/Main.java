package org.example;


import org.example.conf.ConfigClass;
import org.example.model.Broker;
import org.example.model.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigClass.class);

        Broker myBroker = context.getBean(Broker.class);

        System.out.println(myBroker.getEngineerAndBrokerResponsible());

    }

}

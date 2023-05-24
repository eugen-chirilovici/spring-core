package org.example;


import org.example.conf.ConfigClass;
import org.example.model.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigClass.class);

        Car carBean = context.getBean(Car.class);

        System.out.println(carBean.getEngineer().getName());
    }

}

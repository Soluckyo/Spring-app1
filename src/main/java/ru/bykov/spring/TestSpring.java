package ru.bykov.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.bykov.spring.config.SpringConfig;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        Computer computer = context.getBean( "computer", Computer.class);
        System.out.println(computer);
//        System.out.println("Volume: " + computer.getVolume());
//        System.out.println("Device:  " + computer.getDevice());
        context.close();
    }
}

package ru.bykov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Computer computer = context.getBean( "computer", Computer.class);
        System.out.println(computer);
        System.out.println("Volume: " + computer.getVolume());
        System.out.println("Device:  " + computer.getName());
        context.close();
    }
}

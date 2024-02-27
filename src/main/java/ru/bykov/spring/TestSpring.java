package ru.bykov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Computer computer = context.getBean( "computer", Computer.class);
        System.out.println(computer);
        System.out.println(computer.getVolume());
        System.out.println(computer.getName());
        context.close();
    }
}

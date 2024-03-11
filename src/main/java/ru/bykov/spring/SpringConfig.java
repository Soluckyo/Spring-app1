package ru.bykov.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.bykov.spring")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}

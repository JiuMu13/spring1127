package com.jmct;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        IPeople people = (IPeople) applicationContext.getBean("people2");
        people.attack();
    }
}

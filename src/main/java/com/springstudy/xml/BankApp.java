package com.springstudy.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*Config file that reads the applicationContext file and get bean using the getBean method*/
public class BankApp {
    private static ApplicationContext context;

    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Empoyee e = (Empoyee) context.getBean("manager");
        e.doWork();
    }
}

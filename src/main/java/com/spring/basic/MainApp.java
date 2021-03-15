package com.spring.basic;

import com.spring.basic.controller.ClientController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        ClientController clientController = (ClientController) applicationContext.getBean("clientController");
        System.out.println("Response from client controller is "+clientController.getClientData());
    }
}

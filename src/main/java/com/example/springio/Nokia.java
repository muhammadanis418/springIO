package com.example.springio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Nokia {

    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Config loaded");
       // Ufone uf= (Ufone)applicationContext.getBean("ufone");
      //  uf.browsing();
      //  uf.call();
     Sim s1=  applicationContext.getBean("ufone",Sim.class);
        s1.call();
        s1.browsing();
     Sim s2=   applicationContext.getBean("zong",Sim.class);
     s2.browsing();
     s2.call();

     Sim s3= applicationContext.getBean("telenor",Sim.class);
     s3.browsing();
     s3.call();
    }
}

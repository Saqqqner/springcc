package ru.adel.springcc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Man manBean = context.getBean("manBean",Man.class);
        Man manBean1 = context.getBean("manBean1",Man.class);
        System.out.println(manBean1.getName());
        System.out.println(manBean.getName());
        context.close();
    }
}

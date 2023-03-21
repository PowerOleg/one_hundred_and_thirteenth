package com.spring.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppBeans {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        User user = (User) ctx.getBean("user", "Olga", 18);//сработает только при ленивом создании
        //иначе он создаст контекст на 7 строчке, и не сможет потому что нужные параметры мы передаем на 9-й строчке
        System.out.println(user);
    }
}






//        User user = (User) ctx.getBean("getUser");   //указывать название метода "getUser" где пометка @Bean без доп настроек
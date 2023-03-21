package com.spring.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class SpringConfig {

    @Bean(name="user")
    @Lazy(value = true)
    public User getUser(String userName, int userAge) {
        User user = new User();
        user.setUserName(userName);
        user.setUserAge(userAge);
        return user;
    }
}

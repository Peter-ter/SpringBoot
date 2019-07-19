package com.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.web.beans.User;




@SpringBootApplication
public class Application {
	
	
	@Bean
    @ConfigurationProperties(prefix = "test")
    public User UserSettings(){
        return new User();
    }
	
	public static void main(String args[]) {
		SpringApplication.run(Application.class, args);
	}
}

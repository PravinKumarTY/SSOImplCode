package com.shekhargulati.app1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableOAuth2Sso
public class App1Application extends WebMvcConfigurerAdapter {
    public static void main(String[] args) {
        SpringApplication.run(App1Application.class, args);
    }
}

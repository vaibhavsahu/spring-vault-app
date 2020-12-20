package com.vaibhav.example.springvaultapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties(AppCredentials.class)
public class SpringVaultAppApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(SpringVaultAppApplication.class);

    private AppCredentials appCredentials;

    public SpringVaultAppApplication(AppCredentials appCredentials) {
        this.appCredentials = appCredentials;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringVaultAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("username: " + appCredentials.getUsername());
        logger.info("password: " + appCredentials.getPassword());
    }
}

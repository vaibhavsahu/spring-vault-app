package com.vaibhav.example.springvaultapp;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("app")
public class AppCredentials {
    private String username;
    private String password;
}

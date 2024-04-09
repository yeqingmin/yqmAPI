package com.example.apiclientsdk;

import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("yqm-api.properties")
@Data
@ComponentScan
public class APIConfig {
    private String accessKey;
    private String secreteKey;
}

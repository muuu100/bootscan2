package com.muuu.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "config.userinfo")
public class MyDto {
    private String name;
    private String sex;
    private int age;
    private boolean single;
    private String mood;
}

package com.muuu.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Component
@PropertySource("classpath:user.properties")
@ConfigurationProperties(prefix = "userinfo")
public class MyDtoB {
    private String name;
    private String enName;
}

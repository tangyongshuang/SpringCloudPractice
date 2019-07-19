package com.anhe.springbootstarteruser.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author albert.tang
 * @create 2019-07-18 15:08
 */
@Data
@ConfigurationProperties(prefix = "spring.user")
public class UserProperties {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

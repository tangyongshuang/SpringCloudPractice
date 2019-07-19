package com.anhe.springbootstarteruser.properties;

/**
 * @Author albert.tang
 * @create 2019-07-18 15:12
 */
public class UserClient {
    private UserProperties userProperties;

    public UserClient() {
    }

    public UserClient(UserProperties userProperties) {
        this.userProperties = userProperties;
    }

    public String getName(){
        return userProperties.getName();
    }

    public Integer getAge(){
        return userProperties.getAge();
    }
}

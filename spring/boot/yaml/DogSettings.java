package com.acc.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix="dog")
public class DogSettings {
    private int wow;
    private String such;
    private boolean happy;


    public int getWow() {
        return wow;
    }

    public void setWow(int wow) {
        this.wow = wow;
    }

    public String getSuch() {
        return such;
    }

    public void setSuch(String such) {
        this.such = such;
    }

    public boolean isHappy() {
        return happy;
    }

    public void setHappy(boolean happy) {
        this.happy = happy;
    }
}
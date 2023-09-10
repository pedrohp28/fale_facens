package com.projeto.falefacensserver;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class InitializerEnrivomentVariablesTest implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.setProperty("USER_ROOT", "user_name");
        System.setProperty("USER_PASSWORD", "user_password");
    }
}

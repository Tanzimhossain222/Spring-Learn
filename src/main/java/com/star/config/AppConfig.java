package com.star.config;

import com.star.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Scope("prototype")
    @Bean
    public Desktop desktop(){
        return new Desktop();
    }


}

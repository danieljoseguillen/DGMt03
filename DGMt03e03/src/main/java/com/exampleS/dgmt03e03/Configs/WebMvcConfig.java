package com.exampleS.dgmt03e03.Configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer{

    @Override
    public void addViewControllers (ViewControllerRegistry registry){
        registry.addViewController("/enlaces").setViewName("enlaces-externosView");
    }
}

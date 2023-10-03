package com.example.stravaapi;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.method.annotation.PrincipalMethodArgumentResolver;

import java.util.List;

@Configuration
public class SecurityConfig implements WebMvcConfigurer {

    @Override
    public void addArgumentResolvers (List<HandlerMethodArgumentResolver> resolvers){
        resolvers.add(new PrincipalMethodArgumentResolver());
    }


}

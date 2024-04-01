package com.example.demo;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

public class QuickPollMvcConfigAdapter implements WebMvcConfigurer {
    @Override

    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {

        PageableHandlerMethodArgumentResolver phmar = new PageableHandlerMethodArgumentResolver();
        // Set the default size to 5
        phmar.setFallbackPageable(PageRequest.of(0, 5));
        argumentResolvers.add(phmar);
    }
}
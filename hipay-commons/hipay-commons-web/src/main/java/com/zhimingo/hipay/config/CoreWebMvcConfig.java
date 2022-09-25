package com.zhimingo.hipay.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class CoreWebMvcConfig implements WebMvcConfigurer {

    /**
     * 处理当使用ResponseBodyAdvice进行统一响应拦截时，Controller返回String类型会调用
     * StringHttpMessageConverter的addDefaultHeader方法, addDefaultHeader方法中接
     * 收的参数是String类型，而传入的是Result对象导致方法抛错
     * 解决方案：
     * 配置messageConverters，将MappingJackson2HttpMessageConverter配置到第一位
     */
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(0, new MappingJackson2HttpMessageConverter());
    }
}

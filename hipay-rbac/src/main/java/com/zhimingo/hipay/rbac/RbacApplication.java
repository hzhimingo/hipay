package com.zhimingo.hipay.rbac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 基于RBAC3的权限系统
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"com.zhimingo.hipay"})
public class RbacApplication {

    public static void main(String[] args) {
        SpringApplication.run(RbacApplication.class, args);
    }
}
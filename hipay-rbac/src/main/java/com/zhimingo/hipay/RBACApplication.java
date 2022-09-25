package com.zhimingo.hipay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 基于RBAC的权限管理系统
 */
@EnableDiscoveryClient
@SpringBootApplication
public class RBACApplication {

    public static void main(String[] args) {
        SpringApplication.run(RBACApplication.class, args);
    }
}
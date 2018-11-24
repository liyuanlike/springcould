package com.zhao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
 * @description 模拟登录服务提供者 3
 *
 * @author MR.Zhao
 * @date 2018-11-04 下午5:23
 * @version 1.0.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class LoginservertwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginservertwoApplication.class, args);
    }
}

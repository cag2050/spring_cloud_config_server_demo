package com.example.spring_cloud_config_server_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigServerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigServerDemoApplication.class, args);
    }

}

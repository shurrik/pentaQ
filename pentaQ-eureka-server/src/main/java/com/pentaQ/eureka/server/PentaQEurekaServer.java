package com.pentaQ.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //开启eureka服务注册与发现中心
public class PentaQEurekaServer {

	public static void main(String[] args) {
		SpringApplication.run(PentaQEurekaServer.class, args);
	}
}

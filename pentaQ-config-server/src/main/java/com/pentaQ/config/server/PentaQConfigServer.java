package com.pentaQ.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer //开启配置服务
public class PentaQConfigServer {

	//还用spring boot的形式启动config server
	public static void main(String[] args) {
		SpringApplication.run(PentaQConfigServer.class, args);
	}
}

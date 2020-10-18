package com.atguigu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.atguigu.springcloud"})
@ServletComponentScan("com.atguigu.springcloud")
@MapperScan("com.atguigu.springcloud.mapper")
public class DeptConsumer80_Feign_Web
{
	public static void main(String[] args)
	{
		SpringApplication.run(DeptConsumer80_Feign_Web.class, args);
	}
}

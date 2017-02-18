package com.lxg.spring.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * spring配置类
 * @author lxg
 *
 * 2017年2月17日下午2:20:17
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.lxg.spring")
public class SpringConfiguration {
	

}
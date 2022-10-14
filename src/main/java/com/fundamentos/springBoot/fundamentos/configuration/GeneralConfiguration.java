package com.fundamentos.springBoot.fundamentos.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fundamentos.springBoot.fundamentos.bean.MyBeanWithProperties;
import com.fundamentos.springBoot.fundamentos.bean.MyBeanWithPropertiesImplement;
import com.fundamentos.springBoot.fundamentos.pojo.UserPojo;

@Configuration
@EnableConfigurationProperties(UserPojo.class)
public class GeneralConfiguration {
	
	@Value("${value.name}")
	private String name;
	
	@Value("${value.apellido}")
	private String apellido;
	
	@Value("${value.random}")
	private String random;
	
	@Bean
	public MyBeanWithProperties myBeanWithProperties() {
		return new MyBeanWithPropertiesImplement(name, apellido);
	}

}

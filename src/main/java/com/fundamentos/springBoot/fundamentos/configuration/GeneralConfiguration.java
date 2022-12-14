package com.fundamentos.springBoot.fundamentos.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
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
	
	/* Configuracion de conexion a bd desde clase
	 * @Bean public DataSource dataSource() { DataSourceBuilder dataSourceBuilder =
	 * DataSourceBuilder.create();
	 * dataSourceBuilder.driverClassName("org.h2.Driver");
	 * dataSourceBuilder.url("jdbc:h2:mem:testdb");
	 * dataSourceBuilder.username("sa"); dataSourceBuilder.password("");
	 * 
	 * return dataSourceBuilder.build();
	 * 
	 * }
	 */

}

package com.fundamentos.springBoot.fundamentos.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fundamentos.springBoot.fundamentos.bean.MyBean;
import com.fundamentos.springBoot.fundamentos.bean.MyBeanImplement;
import com.fundamentos.springBoot.fundamentos.bean.MyBeanWithDependence;
import com.fundamentos.springBoot.fundamentos.bean.MyBeanWithDependenceImplement;
import com.fundamentos.springBoot.fundamentos.bean.MyOperation;
import com.fundamentos.springBoot.fundamentos.bean.MyOperationImplement;

@Configuration
public class MyConfigurationBean {
	
	@Bean
	public MyBean myBean() {
		return new MyBeanImplement();
	};
	
	@Bean
	public MyOperation myOperation() {
		return new MyOperationImplement();
	}
	
	@Bean
	public MyBeanWithDependence myBeanWithDependence(MyOperation myOperation) {
		return new MyBeanWithDependenceImplement(myOperation);
	}
}

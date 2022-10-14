package com.fundamentos.springBoot.fundamentos;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fundamentos.springBoot.fundamentos.bean.MyBean;
import com.fundamentos.springBoot.fundamentos.bean.MyBeanWithDependence;
import com.fundamentos.springBoot.fundamentos.bean.MyBeanWithProperties;
import com.fundamentos.springBoot.fundamentos.component.ComponentDependency;
import com.fundamentos.springBoot.fundamentos.pojo.UserPojo;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {
	
	private Log logger = LogFactory.getLog(FundamentosApplication.class);
	
	private ComponentDependency componentDependency;
	private MyBean myBean;
	private MyBeanWithDependence myBeanWithDependence;
	private MyBeanWithProperties myBeanWithProperties;
	private UserPojo userPojo;
	
	
	public FundamentosApplication(
			@Qualifier("componentTwoImplement") ComponentDependency componentDependency,
			MyBean myBean,
			MyBeanWithDependence myBeanWithDependence,
			MyBeanWithProperties myBeanWithProperties,
			UserPojo userPojo) 
	{
		super();
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWithDependence = myBeanWithDependence;
		this.myBeanWithProperties = myBeanWithProperties;
		this.userPojo = userPojo;
	}



	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}



	@Override
	public void run(String... args) {
		componentDependency.saludar();
		myBean.print("Hola desde My Bean");
		myBeanWithDependence.printSum();
		System.out.println(myBeanWithProperties.function());
		System.out.println(userPojo.getEmail() + " " + userPojo.getPassWord() + " " + userPojo.getAge());
		logger.info("Este es mi log");
	}

}

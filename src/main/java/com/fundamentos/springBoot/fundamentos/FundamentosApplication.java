package com.fundamentos.springBoot.fundamentos;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fundamentos.springBoot.fundamentos.bean.MyBean;
import com.fundamentos.springBoot.fundamentos.bean.MyBeanWithDependence;
import com.fundamentos.springBoot.fundamentos.component.ComponentDependency;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {
	
	private ComponentDependency componentDependency;
	private MyBean myBean;
	private MyBeanWithDependence myBeanWithDependence;
	
	
	public FundamentosApplication(
			@Qualifier("componentTwoImplement") ComponentDependency componentDependency,
			MyBean myBean,
			MyBeanWithDependence myBeanWithDependence) 
	{
		super();
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWithDependence = myBeanWithDependence;
	}



	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}



	@Override
	public void run(String... args) {
		componentDependency.saludar();
		myBean.print("Hola desde My Bean");
		myBeanWithDependence.printSum();
	}

}

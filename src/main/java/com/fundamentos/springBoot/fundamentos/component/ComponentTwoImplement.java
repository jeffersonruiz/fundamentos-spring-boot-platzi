package com.fundamentos.springBoot.fundamentos.component;

import org.springframework.stereotype.Component;

import com.fundamentos.springBoot.fundamentos.bean.MyBean;

@Component
public class ComponentTwoImplement implements ComponentDependency {
	
	private MyBean myBean;
	
	
	public ComponentTwoImplement(MyBean myBean) {
		super();
		this.myBean = myBean;
	}



	@Override
	public void saludar() {
		System.out.println("Hola mundo desde mi componente II");
		myBean.print("Mensaje desde component II");
	}

}

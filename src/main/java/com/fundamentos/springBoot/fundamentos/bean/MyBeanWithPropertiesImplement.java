package com.fundamentos.springBoot.fundamentos.bean;

public class MyBeanWithPropertiesImplement implements MyBeanWithProperties {
	
	private String name;
	private String apellido;
	
	

	public MyBeanWithPropertiesImplement(String name, String apellido) {
		super();
		this.name = name;
		this.apellido = apellido;
	}



	@Override
	public String function() {
		// TODO Auto-generated method stub
		return name + " " + apellido;
	}
	

}

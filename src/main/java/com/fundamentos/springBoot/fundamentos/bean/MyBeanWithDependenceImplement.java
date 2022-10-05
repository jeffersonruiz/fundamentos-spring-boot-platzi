package com.fundamentos.springBoot.fundamentos.bean;

public class MyBeanWithDependenceImplement implements MyBeanWithDependence {

	private MyOperation myOperation;
	
	
	
	public MyBeanWithDependenceImplement(MyOperation myOperation) {
		super();
		this.myOperation = myOperation;
	}



	@Override
	public void printSum() {
		System.out.println("El resultado de la suma es: "+myOperation.suma(5));	
	}

}

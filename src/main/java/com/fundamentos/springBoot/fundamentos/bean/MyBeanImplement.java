package com.fundamentos.springBoot.fundamentos.bean;

public class MyBeanImplement implements MyBean{

	@Override
	public void print(String text) {
		System.out.println("Imprimiento mensaje: "+text);
	}

}

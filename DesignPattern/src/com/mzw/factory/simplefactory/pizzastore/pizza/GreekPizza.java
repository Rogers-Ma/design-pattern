package com.mzw.factory.simplefactory.pizzastore.pizza;

public class GreekPizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("给希腊制作奶酪披萨准备原材料");
	}

}

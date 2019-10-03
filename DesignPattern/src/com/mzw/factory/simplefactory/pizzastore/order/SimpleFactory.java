package com.mzw.factory.simplefactory.pizzastore.order;

import com.mzw.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.mzw.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.mzw.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.mzw.factory.simplefactory.pizzastore.pizza.Pizza;

public class SimpleFactory {
	public Pizza createPizza(String orderType) {
		Pizza pizza = null;
		System.out.println("简单工厂模式");
		if ("greek".equals(orderType)) {
			pizza = new GreekPizza();
			pizza.setName("希腊披萨");
		} else if ("cheese".equals(orderType)) {
			pizza = new CheesePizza();
			pizza.setName("奶酪披萨");
		} else if ("pepper".equals(orderType)) {
			pizza = new PepperPizza();
			pizza.setName("胡椒披萨");
		}
		return pizza;
	}

	// 简单工厂模式也叫静态工厂模式
	public static Pizza createPizza2(String orderType) {
		Pizza pizza = null;
		System.out.println("简单工厂模式");
		if ("greek".equals(orderType)) {
			pizza = new GreekPizza();
			pizza.setName("希腊披萨");
		} else if ("cheese".equals(orderType)) {
			pizza = new CheesePizza();
			pizza.setName("奶酪披萨");
		} else if ("pepper".equals(orderType)) {
			pizza = new PepperPizza();
			pizza.setName("胡椒披萨");
		}
		return pizza;
	}

}

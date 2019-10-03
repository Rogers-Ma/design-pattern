package com.mzw.factory.simplefactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.mzw.factory.simplefactory.pizzastore.pizza.Pizza;

public class OrderPizza {

	// 定义一个简单工场对象
	SimpleFactory simpleFactory;
	Pizza pizza = null;

	// 构造器
	public OrderPizza(SimpleFactory simpleFactory) {
		setFactory(simpleFactory);
	}

	public void setFactory(SimpleFactory simpleFactory) {
		String orderType = ""; // 用户输入的
		this.simpleFactory = simpleFactory; // 设置简单工厂对象

		do {
			orderType = getType();
			pizza = this.simpleFactory.createPizza(orderType);
			if (pizza != null) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				System.out.println("订购失败");
				break;
			}
		} while (true);

	}

	// 写一个方法，可以获取客户希望订购的披萨种类""
	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza 种类:");
			String str = strin.readLine();
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}
}

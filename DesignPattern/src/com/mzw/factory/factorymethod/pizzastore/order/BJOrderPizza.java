package com.mzw.factory.factorymethod.pizzastore.order;

import com.mzw.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.mzw.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.mzw.factory.factorymethod.pizzastore.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {

	@Override
	Pizza createPizza(String orderType) {

		Pizza pizza = null;
		if (orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new BJPepperPizza();
		}
		// TODO Auto-generated method stub
		return pizza;
	}

}

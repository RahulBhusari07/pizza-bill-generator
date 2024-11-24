package com.start;

public class Launch {

	public static void main(String[] args) {
		Pizza basepizza = new Pizza(true);

		basepizza.addExtraCheese();
		basepizza.addExtratopings();
		basepizza.takeAway();
		basepizza.getBill();

		Pizza Nonvegpizza = new Pizza(false);

		Nonvegpizza.addExtraCheese();
		Nonvegpizza.addExtratopings();
		Nonvegpizza.takeAway();
		Nonvegpizza.getBill();

		DeluxPizza deluxPizza1 = new DeluxPizza(false);
		deluxPizza1.takeAway();
		deluxPizza1.getBill();

	}

}

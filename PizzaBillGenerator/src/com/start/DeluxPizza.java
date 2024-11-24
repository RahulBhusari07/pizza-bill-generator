package com.start;

public class DeluxPizza extends Pizza {

	public DeluxPizza(boolean veg) {
		super(veg);
		super.addExtraCheese();
		super.addExtratopings();

	}

	@Override
	public void addExtraCheese() {

	}

	@Override
	public void addExtratopings() {

	}
}
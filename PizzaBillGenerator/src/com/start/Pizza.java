package com.start;

public class Pizza {

	private int price;
	private boolean veg;
	private int extraCheeseprice = 100;
	private int extratopingspriceAdded = 150;
	private int BagCharges = 25;
	private int basePizzaPrice;
	private boolean isExtraCheeseAdded = false;
	private boolean isExtraToppingsAdded = false;;
	private boolean isOptedforTakeaway = false;;

	public Pizza(boolean veg) {

		this.veg = veg;
		if (this.veg) {
			this.price = 300;
		} else {
			this.price = 500;
		}

		basePizzaPrice = this.price;
	}

	public void addExtraCheese() {
		isExtraCheeseAdded = true;

		this.price += extraCheeseprice;

	}

	public void addExtratopings() {
		isExtraToppingsAdded = true;

		this.price += extratopingspriceAdded;
	}

	public void takeAway() {
		isOptedforTakeaway = true;

		this.price += BagCharges;
	}

	public void getBill() {
		String bill = "";
		System.out.println("Pizza :" + basePizzaPrice);
		if (isExtraCheeseAdded) {
			bill += "Extra Cheese Added :" + extraCheeseprice + "\n";
		}
		if (isExtraToppingsAdded) {
			bill += "Extra Toppings Added :" + extratopingspriceAdded + "\n";
		}
		if (isOptedforTakeaway) {
			bill += "Take Away Opted :" + BagCharges + "\n";
		}

		bill += "Bill: " + this.price + "\n";
		System.out.println(bill);
	}

}

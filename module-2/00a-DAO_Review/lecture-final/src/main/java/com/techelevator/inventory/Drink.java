package com.techelevator.inventory;

public class Drink extends Item {

	public Drink(String name, double price) {
		super(name, price);
	}
	
	@Override
	public String eat() {
		return "Glug Glug, Yum!";
	}

}

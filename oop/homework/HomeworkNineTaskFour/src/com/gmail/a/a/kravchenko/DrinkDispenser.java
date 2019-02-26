package com.gmail.a.a.kravchenko;

public class DrinkDispenser {
	private int numberOfDrinks;

	public DrinkDispenser(int numberOfDrinks) {
		super();
		this.numberOfDrinks = numberOfDrinks;
	}

	public DrinkDispenser() {
		super();
	}

	public int getNumberOfDrinks() {
		return numberOfDrinks;
	}

	public void setNumberOfDrinks(int numberOfDrinks) {
		this.numberOfDrinks = numberOfDrinks;
	}

	@Override
	public String toString() {
		return "DrinkDispenser [numberOfDrinks=" + numberOfDrinks + "]";
	}

	public boolean giveDrink() {
		if (numberOfDrinks > 0) {
			numberOfDrinks--;
			return true;
		} else {
			System.out.println("Drinks finished");
			return false;
		}
	}

}

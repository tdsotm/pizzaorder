package com.comandapizza.pizzaorder;

public class Ingredient {
	public Ingredient(String numeIngredient, double d) {
		super();
		this.numeIngredient = numeIngredient;
		this.pretIngredient = d;
	}
	private String numeIngredient;
	private double pretIngredient;

	public String getNumeIngredient() {
		return numeIngredient;
	}

	public void setNumeIngredient(String numeIngredient) {
		this.numeIngredient = numeIngredient;
	}

	public double getPretIngredient() {
		return pretIngredient;
	}

	public void setPretIngredient(double pretIngredient) {
		this.pretIngredient = pretIngredient;
	}

}

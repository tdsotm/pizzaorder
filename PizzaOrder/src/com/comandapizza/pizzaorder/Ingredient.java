package com.comandapizza.pizzaorder;

public class Ingredient {
	public Ingredient(String numeIngredient, float pretIngredient) {
		super();
		this.numeIngredient = numeIngredient;
		this.pretIngredient = pretIngredient;
	}
	private String numeIngredient;
	private float pretIngredient;

	public String getNumeIngredient() {
		return numeIngredient;
	}

	public void setNumeIngredient(String numeIngredient) {
		this.numeIngredient = numeIngredient;
	}

	public float getPretIngredient() {
		return pretIngredient;
	}

	public void setPretIngredient(float pretIngredient) {
		this.pretIngredient = pretIngredient;
	}

}

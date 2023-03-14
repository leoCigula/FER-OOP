package hr.fer.oop.homework.simple;

import hr.fer.oop.homework.simple.*;
import java.util.Iterator;

public class Meal {
		
	private Food[] ingredients;
	
	public Meal(Food...ingredients) {
		this.ingredients=new Food[ingredients.length];
		int i=0;
		for (Food food : ingredients) {
			this.ingredients[i]=food;
			i++;
		}
	}
	
	public Meal(Meal meal,int weight) {
		
		this.ingredients=new Food[meal.ingredients.length];
		
		for (int i = 0; i < ingredients.length; i++) {
			this.ingredients[i]=new Food(meal.ingredients[i].getType(), meal.ingredients[i].getWeight() * weight / meal.getWeight());
		}
		
	}
	
	private int getWeight() {
		    int weight = 0;
		    for (int i = 0; i < ingredients.length; i++) {
		      weight += ingredients[i].getWeight();
		    }
		    return weight;
		    }
	
	
	public void printIngredients() {
		for(int i=0;i<ingredients.length;i++) {
			System.out.println("Ingredient[" + i + "] = " + ingredients[i].toStringInGrams());
		}
	}
	
	public int getNum() {
		return ingredients.length;
	}
	public Food getIngredient(int i) {
		if(i<0 || i>=ingredients.length)
			return null;
		return ingredients[i];
	}
	
}

package hr.fer.oop.homework.simple;

import hr.fer.oop.homework.simple.Food;
public class Food {
	
	private FoodType type;
	private int weight;
	
	public Food(String name,int carbs,int fat,int protein,int weight) {
		this.type = new FoodType(name, carbs, fat, protein);
		this.weight=weight;
	}

	public FoodType getType() {
		return type;
	}
	
	public int getWeight() {
		return weight;
	}

	public double getProtein() {
		return (double)(type.getProt()*weight) /100;
	}
	public double getCarbs() {
		return (double)(type.getCarb()*weight) /100;
	}
	public double getFat() {
		return (double)(type.getFat()*weight) /100;
	}
	
	public Food(FoodType type,int weight) {
		this.type=new FoodType(type);
		this.weight=weight;
	}
	@Override
	public String toString() {
		String s=new String(type.getName()+": p - "+type.getProt()+"%, c - "+type.getCarb()+"%, f - "+type.getFat()+"%, w - "+weight+"g");
		return s;
	}
	
	//Dovrsi IMPORTANT
	public String toStringInGrams() {
		String s=new String(type.getName()+": p - "+getProtein()+"g, c - "+getCarbs()+"g, f - "+getFat()+"g, w - "+weight+"g");
		return s;
	}

}

package hr.fer.oop.zadatci4;

public class Dessert {
	protected String name;
	protected double weight;
	protected int calories;
	
	public Dessert(String name,double weight,int calories) {
		this.name=name;
		this.weight=weight;
		this.calories=calories;
	}
	public Dessert() {
		
	}
	
	public String getString() {
		return name;
	}
	public void setString(String name) {
		this.name=name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight=weight;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories=calories;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s - %s g - %s kcal",name,weight,calories);
	}
	
	public String getDessertType() {
		return "dessert";
	}
}

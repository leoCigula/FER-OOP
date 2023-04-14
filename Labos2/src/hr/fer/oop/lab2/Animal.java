package hr.fer.oop.lab2;

public abstract class Animal {
	private boolean vegetarian;
	private double speed;
	
	public Animal() {
		
	}
	public Animal(boolean vegetarian,double speed) {
		this.vegetarian=vegetarian;
		this.speed=speed;
	}
	public boolean isVegetarian() {
		return vegetarian;
	}
	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
}

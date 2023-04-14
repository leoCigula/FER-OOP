package hr.fer.oop.zadatci4;

public class IceCream extends Dessert {
	private String flavour;
	private String colour;
	
	public IceCream() {
		
	}
	
	public IceCream (String name,double weight,int calories,String flavour,String colour) {
		this.name=name;
		this.weight=weight;
		this.calories=calories;
		this.flavour=flavour;
		this.colour=colour;
	}
	public String getFlavour() {
		return flavour;
	}
	public void setFlavour(String flavour) {
		this.flavour=flavour;
	}
	
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour=colour;
	}
	
	
	@Override
	public String toString() {
		return String.format("%s - %.2f g - %d kcal  - %s - %s", name,weight,calories,flavour,colour);
	}
	@Override
	public String getDessertType() {
		// TODO Auto-generated method stub
		return "Ice cream";
	}
}

package hr.fer.oop.zadatci4;

public class Cake extends Dessert {
	private boolean containsGluten;
	private String cakeType;
	
	public Cake() {
		
	}
	public Cake(String name,double weight,int calories,boolean containsGluten,String cakeType) {
		super(name,weight,calories);
		this.containsGluten=containsGluten;
		this.cakeType=cakeType;
	}
	
	public boolean getCointansGluten() {
		return containsGluten;
	}
	public void setConstainsGluten(boolean containsGluten) {
		this.containsGluten=containsGluten;
	}
	
	public String getCakeType() {
		return cakeType;
	}
	public void setCakeType(String cakeType) {
		this.cakeType=cakeType;
	}
	
	@Override
	public String toString() {
		return String.format("%s - %.2f g - %d kcal - %b gluten - %s", name,weight,calories,containsGluten,cakeType);
	}
	
	@Override
	public String getDessertType() {
		// TODO Auto-generated method stub
		return "Cake";
	}
}

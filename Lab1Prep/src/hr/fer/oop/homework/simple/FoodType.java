package hr.fer.oop.homework.simple;

public class FoodType {

	private String name;
	private int protein;
	private int fat;
	private int carbs;
	
	public static int counter=0;
	
	// Setter i getter za ime 
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	//
	public void setFat(int fat) {
		this.fat=fat;
	}
	public int getFat() {
		return fat;
	}
	
	//
	public void setProt(int protein) {
		this.protein=protein;
	}
	public int getProt() {
		return protein;
	}
	
	//
	public void setCarb(int carbs) {
		this.carbs=carbs;
	}
	public int getCarb() {
		return carbs;
	}
	
	public FoodType(String name,int carbs,int fat,int protein) {
		this.name=name;
		this.carbs=carbs;
		this.fat=fat;
		this.protein=protein;
		counter++;
	}
	
	public FoodType(FoodType type) {
		this.name=type.getName();
		this.carbs=type.getCarb();
		this.protein=type.getProt();
		this.fat=type.getFat();
	}
	
	
	public static int getNumberOfInstances() {
		return counter;
	}
	@Override
	public String toString() {
		String s=new String(name+": p - "+protein+"%, c - "+carbs+"%, f - "+fat+"%");
		return s;
	}
}

package hr.fer.oop.a6.comp;

public class Laptop extends Computer implements Portable {

	private int batteryCapacity;
	private double weight;
	
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public Laptop() {
		
	}
	public Laptop(String model,String manufacturer,String operatingSystem,int batteryCapacity,double weight)
	{
		super(model,manufacturer,operatingSystem);
		this.batteryCapacity=batteryCapacity;
		this.weight=weight;
	}
	
	@Override
	public String toString() {
		return String.format("Kurcina");
	}
	
	public String getComputerType() {
		return "Laptop computer";
	}
	
	public int calculatePortabilityScore() {
		return (int)weight;
	}
}

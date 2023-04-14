package hr.fer.oop.a6.comp;

public final class Netbook extends Laptop {

	@Override
	public int calculatePortabilityScore() {
		// TODO Auto-generated method stub
		return 1;
	}
	
    @Override
	public String getComputerType() {
		return "netbook laptop comp";
	}
	public Netbook() {
		
	}
	public Netbook(String model,String manufacturer,String operatingSystem,int batteryCapacity,double weight) {
		super(model,manufacturer,operatingSystem,batteryCapacity,weight);
	}
	
	@Override
	public String toString() {
		return "NET";
	}
}

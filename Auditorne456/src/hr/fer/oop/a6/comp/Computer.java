package hr.fer.oop.a6.comp;

public abstract class  Computer extends Device {

	private String operatingSystem;
	
	public Computer() {
		
	}
	public Computer(String model,String manufacturer,String operatingSystem) {
		super(model,manufacturer);
		this.operatingSystem=operatingSystem;
	}
	

	public String getOperatingSystem() {
		return operatingSystem;
	}



	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}



	@Override
	public String toString() {
		return String.format("Model: "+getModel()+" manufacturer: "+getManufacturer()+" OS: "+operatingSystem);
	}
	
	public abstract String getComputerType();
	
	public abstract int calculatePortabilityScore();
}

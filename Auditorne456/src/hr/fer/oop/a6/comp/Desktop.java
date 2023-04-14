package hr.fer.oop.a6.comp;

public class Desktop extends Computer {

	private double caseHeight;
	
	public Desktop() {
		
	}
	public Desktop(String model,String manufacturer,String operatingSystem,double caseHeight) {
		super(model,manufacturer,operatingSystem);
		this.caseHeight=caseHeight;
	}
	
	

	public double getCaseHeight() {
		return caseHeight;
	}
	public void setCaseHeight(double caseHeight) {
		this.caseHeight = caseHeight;
	}
	
	@Override
	public String toString() {
		return "Desktop [caseHeight=" + caseHeight + ", getModel()=" + getModel() + ", getManufacturer()="
				+ getManufacturer() + ", getOperatingSystem()=" + getOperatingSystem() + "]";
	}
	
	public String getComputerType() {
		return "Desktop computer";
	}
	
	public int calculatePortabilityScore() {
		return (5+ (int)caseHeight/30);
	}
	
}

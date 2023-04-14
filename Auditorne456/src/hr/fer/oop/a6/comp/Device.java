package hr.fer.oop.a6.comp;

public class Device {
	
	private String model;
	private String manufacturer;
	

	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public String getManufacturer() {
		return manufacturer;
	}



	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Device() {
		
	}
	public Device(String model,String manufacturer) {
		this.manufacturer=manufacturer;
		this.model=model;
	}

}
//ako se mote oporavit checked
//ako ne unchecked
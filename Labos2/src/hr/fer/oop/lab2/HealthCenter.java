package hr.fer.oop.lab2;

public class HealthCenter {

	  	private String name;
	    private String address;
	    private int registeredPatients;
	    
	    public HealthCenter() {
	    	
	    }
	    
	    public HealthCenter(String name, String address, int registeredPatients) {
	        this.name=name;
	        this.address=address;
	        this.registeredPatients=registeredPatients;    
	    }

	     public String getName() {
	            return name;
	     }

	     public String getAddress() {
	         return address;
	     }
	     
	     public int getRegisteredPatients() {
	         return registeredPatients;
	     }
	
}

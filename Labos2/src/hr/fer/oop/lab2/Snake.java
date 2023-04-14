package hr.fer.oop.lab2;

public class Snake extends Animal {
	private boolean large;
	private boolean venomous;
	
	public Snake() {
		
	}
	public Snake(boolean vegetarian,double speed,boolean large,boolean venomous) {
		super(vegetarian,speed);
		this.large=large;
		this.venomous=venomous;
	}
	
	public String isDangerous() {
		if(large && venomous)
			return "very dangerous";
		else if((!large && venomous)  || (large && !venomous))
				return "dangerous";
		else
			return "not dangerous";
	}
	public boolean isFast() {
		if(getSpeed()>=10)
			return true;
		else
			return false;
			
	}
	
	@Override
	public String toString(){
	    return ("This type of snake is " + isDangerous() + " and " + (isFast() ? "fast" : "not fast") + ".");
	}
}

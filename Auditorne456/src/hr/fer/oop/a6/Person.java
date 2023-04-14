package hr.fer.oop.a6;

public abstract class  Person {
	private int id;
	private String name;
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public Person() {
		
	}
	public Person(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return String.format("%d - %s",id,name);
	}
	
	public abstract double getGrade();
	
	public final boolean isOutstanding() {
		if(this.getGrade()>=4.5)
			return true;
		else return false;
	}
}

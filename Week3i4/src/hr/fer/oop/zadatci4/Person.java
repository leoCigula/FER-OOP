package hr.fer.oop.zadatci4;

public class Person {

	protected String name;
	protected String surname;
	protected int age;
	
	
	//Konstruktori
	public Person() {
		
	}
	public Person(String name,String surname) {
		this.name=name;
		this.surname=surname;
		this.age=0;
	}
	public Person(String name,String surname,int age) {
		this(name,surname);
		this.age=age;
	}
	
	//Getter i setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname=surname;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s - %d g.", name,surname,age);
	}
	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Person))
			if((obj instanceof Student) || (obj instanceof Teacher))
				return false;
		Person other=(Person) obj;
		boolean t1,t2,t3;
		t1= (other.age == age) ? true : false;
		t2 = (other.name.equals(name)) ? true : false;
		t3 = (other.surname.equals(surname)) ? true : false;
		return (t1 && t2 && t3);
	}
	
}

package hr.fer.oop.a4;

public class Person {
	private String name,surname;
	private int age;
	
	public Person(String name,String surname,int age) {
		this.name=name;
		this.surname=surname;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s %s - %d g.", name,surname,age);
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean truth=false;
		if(obj.getClass() == this.getClass())
		{
			Person p = (Person) obj;
			truth = (p.name.equals(this.name) && p.surname.equals(this.surname) && p.age==this.age) ? true : false;
			return truth;
		}
		else
			return truth;
	}
	
	
}

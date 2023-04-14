package hr.fer.oop.a6;

import hr.fer.oop.a6.comp.Computer;
import hr.fer.oop.a6.comp.Laptop;
import hr.fer.oop.a6.comp.Netbook;

public class Test {
	
	public static void main(String[] args) {
		Computer n = new Netbook("Ideapad S12", "Lenovo", "Windows", 50, 1.55);
		System.out.println(n);
		System.out.println(n.getComputerType());
		System.out.println(n.calculatePortabilityScore());
		Laptop l = (Laptop) n;
		System.out.println(l.calculatePortabilityScore());
		
		
		Person s1 = new Student(111, "Pero Perić", (short)3, new int[] {5,3,4});
		Student s2 = new Student(115, "Ana Anić", (short)1, new int[] {5,5,4});
		Teacher t = new Teacher(615, "Mirko Mandić", "OOP", 4.83);
		Person[] people = new Person[] {s1, s2, t};
		System.out.println("Outstanding students and teachers:");
		for (Person p : people)
		if (p.isOutstanding())
		System.out.println(p);
		
	}
}

package hr.fer.oop.a4;

public class Main {

	public static void main(String[] args) {

		Person p1 = new Person("Ivo","Ivic", 20);
		Person p2 = new Person("Ivo","Ivic", 20);
		Person p3 = new Student("Ivo","Ivic", 20, "0036312123", (short)3);
		Person p4 = new Student("Marko","Marić", 25, "0036312123", (short)5);
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p3.equals(p4));

	}

}

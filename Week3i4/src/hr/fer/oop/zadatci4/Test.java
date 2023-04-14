package hr.fer.oop.zadatci4;

import hr.fer.oop.zadatci4.*;

import java.util.Iterator;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		/**
		 * @author Leonardo
		 * {@summary}
		 * Main klasa za testiranje prva dva zadatka
		 * 
		 */
		Scanner sc= new Scanner(System.in);
		
		/*
		Dessert d=new Dessert();
		d.setCalories(470);
		d.setString(sc.nextLine());
		d.setWeight(5.7);
		System.out.println(d.toString());
		
		
		//Cake
		Cake ck= new Cake("Zaherica",582.4,752,false,"rodendanska");
		System.out.println(ck.toString());
		
		//IceCream use decimal point a ne zarez
		IceCream ic= new IceCream();
		ic.setCalories(Integer.parseInt(sc.nextLine()));
		ic.setWeight(Double.parseDouble(sc.nextLine()));
		ic.setFlavour("jagoda");
		ic.setString("jagodina pozuda");
		ic.setColour(sc.nextLine());
		System.out.println(ic);
		
		//Test Student
		Person person = new Person("Leonardo", "Cigula",20);
		if(person.equals(person)) {
			System.out.println("Leonardo je istina");
		}
		Student student = new Student();
		student.setName("Petar");
		student.setSurname(sc.nextLine());
		student.setAge(20);
		student.setAcademicYear((short)23);
		student.setStudentId("OO3650");
		
		Person p1= student;
		p1.name="Leonardo";
		p1.surname="Cigula";
		if(person.equals(p1))
			System.out.println("Isto");
		else
			System.out.println("Nije isto");
		
		*/
		//Profesori
		Teacher p[]=new Teacher[3];
		for (int i = 0; i < p.length; i++) {
			p[i]=new Teacher();
			p[i].name=sc.nextLine();
			p[i].surname=sc.nextLine();
			p[i].age=Integer.parseInt(sc.nextLine());
			p[i].setEmail(sc.nextLine());
			p[i].setSalary(Integer.parseInt(sc.nextLine()));
			p[i].setSubject(sc.nextLine());
		}
		for (int i = 0; i < p.length; i++) {
			if(p[0].equals(p[i]))
				System.out.println("True");
			else
				System.out.println("SHIT");
			System.out.println(p[i]);
		}
		Teacher.increaseSalary(5, p);
		p[0].increaseSalary(10);
		for (int j = 0; j < p.length; j++) {
			System.out.println(p[j]);
		}
	}
	
}

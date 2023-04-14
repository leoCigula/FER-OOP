package hr.fer.oop.zadatci4;

public class Teacher extends Person {
	private String email;
	private String subject;
	private double salary;
	
	public Teacher() {
		
	}
	public Teacher(String name,String surname,int age,String email,String subject,double Salary) {
		super(name,surname,age);
		this.email=email;
		this.subject=subject;
		this.salary=Salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject=subject;
	}
	
	public double getSalary() {
		return this.salary;
	}
	public void setSalary(double salary) {
		this.salary=salary;
		
	}
	public void increaseSalary(int postotak) {
		double newSalary=(double) (100+postotak)/100 * salary;
		salary=newSalary;
	}
	
	 public static void increaseSalary(int postotak,Teacher...prof) {
		 for (Teacher teacher : prof) {
			 double newSalary=(double) (100+postotak)/100 * teacher.getSalary();
			 teacher.setSalary((newSalary));
		}
	 }
	 
	 @Override
	 public boolean equals(Object obj) {
		 if(!(obj instanceof Teacher))
			 return false;
		 Teacher t=(Teacher) obj;
		 return (this.email.equals(t.getEmail())) ? true : false;
	 }
	 
	 @Override
	 public String toString() {
		 String rez=String.format("%s %s - %d. g\n Email: %s \nPredmet:%s Placa:%f",name,surname,age,email,subject,salary);
		 return rez;
	 }
	 
}

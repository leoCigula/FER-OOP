package hr.fer.oop.a4;

public class Teacher {
	private String email,subject;
	private double salary;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}else {
			if(obj instanceof Teacher t) {
				if(t.email.equals(this.email))
					return true;
				else
					return false;
			}
			else
				return false;

		}
		
		}
	
	public void IncreaseSalary(int postotak) {
		double nSal;
		nSal = salary * (1+postotak/100.0);
		salary=nSal;
	}
	
	public static void IncreaseSalary(int postotak,Teacher...teachers) {
		for (Teacher teacher : teachers) {
			teacher.IncreaseSalary(postotak);
		}
	}
	
	
}

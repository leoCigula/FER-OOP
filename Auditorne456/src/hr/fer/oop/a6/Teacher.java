package hr.fer.oop.a6;


public class Teacher extends Person {

	private String subject;
	private double teacherGrade;
	
	public Teacher() {
		
	}
	public Teacher(int id,String name,String subject,double teacherGrade) {
		super(id,name);
		this.subject=subject;
		this.teacherGrade=teacherGrade;
	}
	
	public void setSubject(String subject) {
		this.subject=subject;
	}
	public String getSubject() {
		return subject;
	}
	public void setTeacherGrade(double teacherGrade) {
		this.teacherGrade=teacherGrade;
	}
	public double getTeacherGrade() {
		return teacherGrade;
	}
	
	public double getGrade() {
		return teacherGrade;
	}
	
	@Override
	public String toString() {
		return String.format(super.toString() + " "+subject+" - "+teacherGrade );
	}
}

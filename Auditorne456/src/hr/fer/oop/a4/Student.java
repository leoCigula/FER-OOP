package hr.fer.oop.a4;

public class Student extends Person{
	private String studentId;
	private short academicYear;
	
	public Student(String name,String surname,int age,String studentId,short academicYear) {
		super(name,surname,age);
		this.studentId=studentId;
		this.academicYear=academicYear;
	}
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public short getAcademicYear() {
		return academicYear;
	}
	public void setAcademicYear(short academicYear) {
		this.academicYear = academicYear;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		else {
			if(obj instanceof Student s) {
				if (s.studentId.equals(this.studentId))
					return true;
				else 
					return false;
			}
			else
				return false;
		}
	}
	
}

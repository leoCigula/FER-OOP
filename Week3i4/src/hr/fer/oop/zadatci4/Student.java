package hr.fer.oop.zadatci4;

public class Student extends Person{
	private String studentId;
	private short academicYear;
	
	public Student(String name,String surname,int age,String studentId,short academicYear) {
		super(name,surname,age);
		this.studentId=studentId;
		this.academicYear=academicYear;
	}
	//Konstruktori
	public String getStudentId () {
		return studentId;
	}
	
	public void setStudentId(String studentId) {
		this.studentId=studentId;
	}
	
	public short getAcademicYear() {
		return academicYear;
	}
	public void setAcademicYear(short academicYear) {
		this.academicYear=academicYear;
	}
	
	@Override
	public String toString() {
		String rez=String.format("%s %s - %d g. - ID:%s - Ak g:%d", name,surname,age,studentId,academicYear);
		return rez;
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student))
			return false;
		Student st= (Student) obj;
		if(st==this)
			return true;
		boolean truth;
		truth = (st.studentId.equals(this.studentId)) ? true : false ;
		return truth;
	}
}

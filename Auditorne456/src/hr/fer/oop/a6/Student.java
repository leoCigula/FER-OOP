package hr.fer.oop.a6;

public class Student extends Person
{
	private short academicYear;
	private int ocjene[]=new int[5];
	
	public void setAcademicYear(short academicYear) {
		this.academicYear=academicYear;
	}
	public short getAcademicYear() {
		return academicYear;
	}
	
	public void setOcjene(int ocjene[]) {
		int oc[]=ocjene.clone();
		this.ocjene=oc;
	}
	public int[] getOcjene() {
		return ocjene;
	}
	
	public Student() {
		
	}
	public Student(int id,String name,short academicYear,int ocjene[]) {
		super(id,name);
		this.academicYear=academicYear;
		this.ocjene=ocjene.clone() ;
	}
	
	public double getGrade() {
	
		int rez=0;
		for (int ocjena : ocjene) {
			rez+=ocjena;
		}
		return (double) rez / ocjene.length;
	}
	
	@Override
	public String toString() {
		String finalni=new String();
		finalni=String.format(super.toString() + " "+academicYear+" - ");
		for (int i : ocjene) {
			finalni=finalni.concat(i+" ");
		}
		return finalni;
		
	}
}

package hr.fer.oop.zadatci4;

import hr.fer.oop.zadatci4.*;

public class CompetitionEntry {
	private Teacher teacher;
	private Dessert dessert;
	private Student studenti[]=new Student[3];
	private int ocjene[]=new int[3];
	private int cnt=0;
	
	public CompetitionEntry(Teacher teacher,Dessert dessert) {
		this.teacher=teacher;
		this.dessert=dessert;
	}
	
	public void AddRating(Student st,int ocjena) {
		studenti[cnt]=st;
		ocjene[cnt]=ocjena;
		cnt++;
	}
	
	
	
}

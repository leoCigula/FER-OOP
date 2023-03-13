package hr.fer.oop.pomocne;

import java.util.Random;

public class Lotto {

	public  static int[] izvlacenjeA(int br,int maxLoptica) {
		int loptice[]=new int[br];
		for(int i=0;i<br;i++) {
			loptice[i]=(int) (Math.random() * maxLoptica)+1;
		}
		return loptice;
	}
	
	public  static int[] izvlacenjeB(int br,int maxLoptica) {
		Random r=new Random();
		int loptice[]=new int[br];
		for(int i=0;i<br;i++) {
			loptice[i]=r.nextInt(maxLoptica+1);
		}
		return loptice;
	}


}

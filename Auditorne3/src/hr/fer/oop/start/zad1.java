package hr.fer.oop.start;

import java.util.Arrays;

public class zad1 {

	
	// [] ukljucuje znakove unutra regex

	public static void main(String args[]) {
		int br[]=transformArray("12-54;1;0;5-78-9-11","-,;");
		for (int f = 0; f < br.length; f++) {
			System.out.println(br[f]);
		}
	} 
	
	public static int[] transformArray(String txt,String delim) {
		String brs[]=txt.split("["+delim+"]");
		int ab[]=new int[brs.length];
		for (int i = 0; i < brs.length; i++) {
			ab[i]=Integer.parseInt(brs[i]);
		}
		Arrays.sort(ab);
		
		
		//silazno
		for (int i = 0; i < ab.length - 1; i++) {
			for (int j = i+1; j < ab.length; j++) {
					int t;
					if(ab[i]<ab[j]) {
						t=ab[i];
						ab[i]=ab[j];
						ab[j]=t;
					}
			}
		}
		
		return ab;
	}

}

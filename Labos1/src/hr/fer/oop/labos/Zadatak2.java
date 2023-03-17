package hr.fer.oop.labos;

import java.util.Iterator;

public class Zadatak2 {

	/**@author Leonardo Cigula
	 * {@summary Metoda treba izračunati zbroj elemenata prvoga polja,
	 * zbroj elemenata drugoga polja te vratiti veći od ta dva zbroja.
	 * Primjerice, compareSums(new int[]{1,2,3}, new int[]{0,17,1}) vraća 18.
	 * Možete pretpostaviti da niti jedno polje nije prazno.}
	 * 
	 * @param first int polje brojeva
	 * @param second int polje brojeva
	 */
	
		
	public static void main(String[] args) {
		System.out.println(compareSums(new int[] {40,5,8},new int []{4,8,8}));

	}
	public static int compareSums(int[] first, int[] second) {
		int sum1,sum2;
		sum1=sum2=0;
		for (int br : first) {
			sum1+=br;
		}
		for (int br : second) {
			sum2+=br;
		}
		if(sum1>sum2)
			return sum1;
		else
			return sum2;
	}

}

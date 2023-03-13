package hr.fer.oop.simple;

import java.util.Arrays;
import hr.fer.oop.pomocne.*;

public class Example4 {

	public static void main(String[] args) {
		int brIzvlacenja=7,brLoptica=39;
		int brojevi[]=new int[brIzvlacenja];
		int brojevi2[]=new int[brIzvlacenja];
		brojevi=Lotto.izvlacenjeA(brIzvlacenja,brLoptica);
		brojevi2=Lotto.izvlacenjeB(brIzvlacenja, brLoptica);
		Arrays.sort(brojevi);
		Arrays.sort(brojevi2);
		for (int i = 0; i < brojevi.length; i++) {
			System.out.println(brojevi[i]);
		}
		System.out.println("\n");
		for (int i = 0; i < brojevi2.length; i++) {
			System.out.println(brojevi2[i]);
		}
		
		
	}

}

package hr.fer.oop.simple;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Collections;

public class Example3 {

	public static void main(String[] args) {
		// Lotto 7/39
		int br[]=new int[7];
		for(int i=0; i<7 ;i++) {
			br[i]=(int)(Math.random()*39)+1;
			System.out.println(i+". broj izvucen: "+br[i]);
		}
		Arrays.sort(br);
		System.out.println("Poredani (uzlazno) array");
		for (int i = 0; i < br.length; i++) {
			System.out.println(br[i]);
		}
	}

}

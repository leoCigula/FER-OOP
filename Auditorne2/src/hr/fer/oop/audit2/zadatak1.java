package hr.fer.oop.audit2;

import java.util.Iterator;

public class zadatak1 {

	public static void main(String[] args) {
		int min=0,br;
		for(String s: args){
			br=Integer.parseInt(s);
			if(min==0) {
				min=br;
			}
			if(br<min)
				min=br;
		}
		System.out.println(min);
	}

}

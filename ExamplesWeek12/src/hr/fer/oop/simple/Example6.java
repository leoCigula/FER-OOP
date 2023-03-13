package hr.fer.oop.simple;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		
		Scanner sken=new Scanner(System.in);
		int a,b,c;
		double r1,r2,D;
			a=sken.nextInt();
			b=sken.nextInt();
			c=sken.nextInt();
			
			D=b*b - (4*a*c);
			if(D<0)
				System.out.println("Nema rjesenja u R");
			else
			{
				r1= (double) (b+Math.pow((double)D, 1/2))/(2*a);
				r2= (double) (b-Math.pow((double)D, 1/2))/(2*a);
				System.out.println("R1: "+r1+"\nR2: "+r2);

			}
		
	}

}

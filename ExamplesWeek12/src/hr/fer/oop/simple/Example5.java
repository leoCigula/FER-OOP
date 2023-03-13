package hr.fer.oop.simple;

public class Example5 {

	public static void main(String[] args) {
		
		int a,b,c;
		double r1,r2,D;
		if(args.length!=3) {
			System.out.println("Nema dovoljno podataka - ERR");
		}else {
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			c=Integer.parseInt(args[2]);
			
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

}

package hr.fer.oop.izdrkavanja.simple;

public class Zadatak2 {

	public static void main(String[] args) {
			
		int sum5,First5=(int) (Math.PI * 1.00e5);
		double sum=0;
		int i=1;
		do {
			sum+=(1./Math.pow(i, 2));
			i++;
			sum5=(int)((Math.sqrt(sum*6) * 1e5));
		}while(!(sum5==First5));
		System.out.printf("%d sumiranja",i-1);
	}

}

package hr.fer.oop.simple;

public class Example2 {

	public static void main(String[] args) {
		int i=1;
		double sum=0;
		int first5pi=(int) (Math.PI * 1e5);
		int checkFive=0;
		int numOfSums;
		do {
				sum += 1. / ((double) i*i );
				checkFive= (int) (Math.sqrt(6*sum) * 1e5);
				i++;
		}while(first5pi != checkFive);
		numOfSums=i;
		System.out.println(numOfSums);

	}

}

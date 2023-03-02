package hr.fer.oop.izdrkavanja.simple;

public class Zadatak1 {

	public static void main(String[] args) {
		
		int powOf10=10;
		double sum=0;
		for(int i=0;i<=1000000;i++) {
			if(i%2==0)
				sum+= (1./ (2*i+1));
			else
				sum-= (1./(2*i+1));
			if(i==powOf10) {
				System.out.printf("%.10f\n",4*sum);
				powOf10*=10;
			}
		}
		
	}

}

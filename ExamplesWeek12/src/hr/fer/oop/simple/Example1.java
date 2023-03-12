package hr.fer.oop.simple;

public class Example1 {
	public static void main(String args[]) {
		
		// Racuna Pi/4 kao suma (-1)**i / (2*i+1) od 0 do inf
		int i;
		double sum=1.0;
		int powOf10=10;
		for(i=1;i<=1000000;i++) {
			sum+= (Math.pow(-1, i)*1.0 )/ (2*i+1);
			if(powOf10==i) {
				System.out.printf("i=%d sum=%.10f \n",i,sum*4);
				powOf10*=10;
			}
		}
		}
}

package hr.fer.oop.zad;

public class PrimeNumbers {

	public static void main(String []args) {
		if(args.length!=1)
			System.out.println("Sjebao si nesto druze");
		else {
			int brPrime=Integer.parseInt(args[0]);
			System.out.println("You requested calculation of first "+brPrime+" prime numbers");
			int i=1;
			if(brPrime>=1) {
				int nextPrime=2+1;
				boolean truth;
				System.out.println("2");
				while(i<brPrime) {
					truth=false;
					for(int j=nextPrime;;j++) {
						for(int k=2;k<=(int) Math.sqrt((double)j);k++) {
							if(j%k==0)
							{
								truth=true;
								break;
							}
						}
						if(!truth) {
							System.out.println(j);
							nextPrime=j+1;
							i++;
							
						
						}
					}
				}
			}
		}

	}
}

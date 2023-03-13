package hr.fer.oop.audit1;

public class CreateRandomNumbers {

	public static void main(String[] args) {
		/** @author LeonardoCigula
		 * 
		 */
		if(args.length!=2)
			System.out.println("Program requires lower and upper bound senpai uWu");
		else {
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			if(b<a)
				System.out.println("Invalid bounds");
			else {
				System.out.println("Two different random numbers in range [-13,6]: ");
				for (int i = 0; i < args.length; i++) {
					System.out.println((int)(Math.random() * (6- (-13)) +(-13+1))+" ");
				}
			}
		}
	}

}

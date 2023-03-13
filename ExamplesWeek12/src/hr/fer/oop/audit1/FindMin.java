package hr.fer.oop.audit1;

public class FindMin {

	public static void main(String[] args) {
		/*
		 *  Napisati program koji pronalazi najmanji cijeli broj među argumentima programa. 
   Možete pretpostaviti da se svi argumenti mogu interpretirati kao cijeli broj. 

   Ako program nema argumenata ispisati "No arguments received", inače ispisati poruku nalik:
    "The smallest number is -42"

   Program napisati u klasi FindMin.java i smjestiti u paket hr.fer.oop.simple

		 * 
		 */
		int br;
		int min=0;
		if(args.length==0)
			System.out.println("No arguments received! ");
		else {
			for (int i = 0; i < args.length; i++) {
				br=Integer.parseInt(args[i]);
				if(i==0 || br<min )
					min=br;
			}
			System.out.println("The smallest number is : "+min);

		}
		
	}

}
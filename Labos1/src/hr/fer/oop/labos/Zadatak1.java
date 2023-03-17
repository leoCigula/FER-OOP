package hr.fer.oop.labos;

public class Zadatak1 {

	/**
	 * 
	 * {@summary}
	 * Napisi koja će vraćati true ako je broj kojeg je primila kao parametar palindrom, 
	 * u protivnom vraća false. 
	 * Brojevi palindromi jesu oni koji imaju iste znamenke čitano s lijeva u desno i obratno. Na primjer brojevi 545, 151, 22, 343, 7, 48984, 100001 jesu palindromi.
	 	@param number int koji se provjerava
	 */
	
	public static void main(String[] args) {
	 System.out.println(isPalindrome(1696));
	}
	
	static boolean isPalindrome(int number){
		   Boolean t=true;
		   int nBr=0,br=number;
		   while(br!=0) {
			   	nBr*=10;
			   	nBr+=br%10;
			   	br/=10;
		   }
		   if(number!=nBr)
			   t=false;
		   return t;
	}
	
}

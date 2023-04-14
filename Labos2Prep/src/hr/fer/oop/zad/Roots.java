package hr.fer.oop.zad;

public class Roots {

	/**
	 * @param args prima tri broja realni dio , imaginarni i korijen
	 */
	public static void main(String []args) {
		
		if(args.length!=3)
			System.out.println("Program treba tri argumenta");
		else {
			double real,imag,modul,alfa;
			int kor;
			real=Double.parseDouble(args[0]);
			imag=Double.parseDouble(args[1]);
			kor=Integer.parseInt(args[2]);
			modul=Math.sqrt(imag*imag + real*real);
			alfa=Math.acos(real/modul);
			double nm=Math.pow(modul, 1/(double)kor);
			for(int i=0;i<kor;i++) {
				double nr=nm*Math.cos((alfa+2*i*Math.PI)/2);
				double ni=nm*Math.sin((alfa+2*i*Math.PI)/2);
				System.out.printf("%+.2f %+.2f\n",nr,ni);
			}
			
		}
	}
}

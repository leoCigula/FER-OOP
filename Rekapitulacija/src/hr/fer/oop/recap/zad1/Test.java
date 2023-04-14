package hr.fer.oop.recap.zad1;

public class Test {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(1, 4);
		Fraction f2 = new Fraction(2, 3);

		Fraction f = f1.zbrajanje(f2);
		System.out.println(f);//ispisuje: 11 / 12

		f = f1.oduzimanje(f2);
		System.out.println(f);//ispisuje: -5 / 12

		System.out.println(f2.reciprocan().negate()); // -3/2
		f = f1.mnozenje(f2);
		System.out.println(f);//ispisuje: 1 / 6
		f = f1.dijeljenje(f2);
		System.out.println(f);//ispisuje: 3 / 8
		
		/// A/b+ c/d = ad+bc/bd
		// Ab - cd= ad-bc/bd
		

	}

}

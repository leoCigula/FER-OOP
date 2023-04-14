package hr.fer.oop.recap.zad1;

public interface Fractionable {
	public Fraction zbrajanje(Fraction other);
	public Fraction oduzimanje(Fraction other);
	public Fraction mnozenje(Fraction other);
	public Fraction dijeljenje(Fraction other);
	public Fraction reciprocan(); //invert
	public Fraction negate();
}

package hr.fer.oop.recap.zad1;

public class Fraction implements Fractionable {

	private int brojnik,nazivnik;
	
	
	public int getBrojnik() {
		return brojnik;
	}
	public void setBrojnik(int brojnik) {
		this.brojnik=brojnik;
	}
	public int getNazivnik() {
		return nazivnik;
	}
	public void setNazivnik(int nazivnik) {
		this.nazivnik=nazivnik;
	}
	public Fraction(int brojnik,int nazivnik) {
		this.brojnik=brojnik;
		this.nazivnik=nazivnik;
	}
	private Fraction() {
	}
	
	
	@Override
	public Fraction zbrajanje(Fraction other) {
		if(nazivnik!=0 && other.nazivnik!=0 ) {
			Fraction result=new Fraction();
			result.brojnik=brojnik*other.nazivnik + nazivnik*other.brojnik;
			result.nazivnik=this.nazivnik*other.nazivnik;
			result.simplify();;
			return result;
		}
		else return null;
	}
	@Override
	public Fraction oduzimanje(Fraction other) {
		if(nazivnik!=0 && other.nazivnik!=0 ) {
			Fraction result=new Fraction();
			result.brojnik=brojnik*other.nazivnik - nazivnik*other.brojnik;
			result.nazivnik=this.nazivnik*other.nazivnik;
			result.simplify();
			return result;
		}
		return null;
	}
	@Override
	public Fraction mnozenje(Fraction other) {
		Fraction result=new Fraction();
		if(nazivnik!=0 && other.nazivnik!=0) {
			result.brojnik=this.brojnik*other.brojnik;
			result.nazivnik=this.nazivnik*other.nazivnik;
			result.simplify();
			return result;
		}
		return null;
	}
	@Override
	public Fraction dijeljenje(Fraction other) {
		Fraction result=new Fraction();
		if(nazivnik!=0 && other.brojnik!=0) {
			result.brojnik=this.brojnik*other.nazivnik;
			result.nazivnik=this.nazivnik*other.brojnik;
			result.simplify();
			return result;
		}
		return null;
	}
	@Override
	public Fraction reciprocan() {
		if(brojnik!=0)
			if(brojnik>0)
				return new Fraction(nazivnik,brojnik);
			else
				return new Fraction(nazivnik,-brojnik);
		else
			return null;
	}
	@Override
	public Fraction negate() {
		return new Fraction(-brojnik,nazivnik);
	}
	
	@Override
	public String toString() {
		
		return String.format("%d / %d",this.brojnik,this.nazivnik);
	}
	
	private static int gcd(int x, int y) {
		x=(x>0) ? x : -x;
		y=(y>0) ? y : -y; 
		// ili Math.abs
		return (y == 0) ? x : gcd(y, x % y);

	}
	
	private void simplify() {
		
		int greatestCommonDivisor=gcd(this.brojnik,this.nazivnik);
		this.brojnik/=greatestCommonDivisor;
		this.nazivnik/=greatestCommonDivisor;
	}

	
	
}

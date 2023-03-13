package hr.fer.oop.audit1;

public class GCD {

	public static int gcd(int a,int b) {
		int rez=1,min=0;
		min = (a<b) ? a : b;
		while(min>0) {
			if(a%min==0 && b%min==0)
				break;
			min--;
		}
		return min;
	}
}

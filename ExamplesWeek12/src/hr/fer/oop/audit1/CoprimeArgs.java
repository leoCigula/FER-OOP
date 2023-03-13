package hr.fer.oop.audit1;
import hr.fer.oop.audit1.GCD;

public class CoprimeArgs {

	public static void main(String[] args) {
		int a;
		int b;
		boolean t1,t2;
		for (int i = 0; i < args.length; i+=2) {
			a=Integer.parseInt(args[i]);
			b=Integer.parseInt(args[i+1]);
			t1=t2=false;
			for(int k=2;k<=(int)Math.sqrt((double) a);k++)
				if(a % k ==0) {
					t1=true;
					break;
				}
			for(int j=2;j<=(int)Math.sqrt((double) b);j++) {
				if(b%j==0) {
					t2=true;
					break;
				}
			}
			int rez=GCD.gcd(a, b);
			if(t1==false && t2==false)
			System.out.printf("gcd(%d, %d) = %d comprime\n",a,b,rez);
			else
				System.out.printf("gcd(%d, %d) = %d\n",a,b,rez);
		}

	}

}

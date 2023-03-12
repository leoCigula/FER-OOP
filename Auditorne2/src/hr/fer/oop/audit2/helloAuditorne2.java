package hr.fer.oop.audit2;

import java.util.Arrays;
import java.util.Scanner;

public class helloAuditorne2 {

	public static void main(String[] args) {
		Scanner sken= new Scanner(System.in);
		
		System.out.println(Integer.parseInt("69"));
		System.out.println(Double.parseDouble("54"));
		String s1="ana";
		String s3="ana";
		// ne stvara se novi
		String s2=new String("ana");
		String s4="Ana";
		String s5=" IVAN ";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s5.trim());
		System.out.println(s1.indexOf("na"));
		//kad ne postoji -1
		
		String s51="a,rt,pro,kl";
		String arr[]=s51.split(",");
		for(String s:arr)
			System.out.println(s);
		System.out.println(s51.substring(1,5));
		
		System.out.println(Math.random());
		// [0,10
		System.out.println((int) (Math.random()*11));
		System.out.println((int) (5+(55-5+1)*Math.random()));
		
		
		//
		System.out.println("\n");
		
		String s6="1;-10;5;17";
		String ar[]=s6.split(";");
		int arr2[]= {10,-20,9,20};
		Arrays.sort(arr2);
		for(int s : arr2 )
			System.out.println(s);
		
		
		int x=sken.nextInt();
		
	}	

}

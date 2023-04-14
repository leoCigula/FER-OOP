package hr.fer.oop.zad;

import java.util.Scanner;

public class Rectangle {

	public static void main(String []args) {
		if(args.length==0)
		{
			double width=0,height=0,area;
			String ln;
			Scanner sc=new Scanner(System.in);
			do {
				System.out.println("Please provide width: ");
				ln=(sc.nextLine()).trim();
				if(ln.isEmpty())
					System.out.println("The input must not be blank");
				else {
					width=Double.parseDouble(ln);
					if(width<=0) 
						System.out.println("The width must not be 0 or negative");	

				}
			}while(width<=0);
			
			do {
				System.out.println("Please provide height: ");
				ln=(sc.nextLine()).trim();
				if(ln.isEmpty())
					System.out.println("The input must not be blank");
				else {
					height=Double.parseDouble(ln);
					if(height<=0) 
						System.out.println("The height must not be 0 or negative");	

				}
			}while(height<=0);
			area=width*height;
			String s=String.format("Specified height and width : %.2f i %.2f\n Povrsina je %.2f",height,width,area);
			System.out.println(s);
		}
		else {
			if(args.length!=2)
				System.out.println("Invalid number of arguments was provided!");
			else {
				double width=0,height=0,area;
				width=Double.parseDouble(args[0]);
				height=Double.parseDouble(args[1]);
				area=width*height;
				String s=String.format("Specified height and width : %.2f i %.2f\n Povrsina je %.2f",height,width,area);
				System.out.println(s);
			}
		}
	}
}

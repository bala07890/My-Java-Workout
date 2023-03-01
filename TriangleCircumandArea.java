package testing1;

import java.util.Scanner;

public class TriangleCircumandArea 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int option=0;
		double a,b,c,h,circumfrence,area;
		System.out.println("1.Find circumfrence");
		System.out.println("2.Find Area");
		option=sc.nextInt();
		switch(option)
		{
		case 1:
			System.out.println("Enter the length a,b,c of the Triangle:");
			a=sc.nextDouble();
			b=sc.nextDouble();
			c=sc.nextDouble();
			circumfrence=a+b+c;
			System.out.println("The Triangle Circumfrence is:"+circumfrence);
			break;
		case 2:
			System.out.println("Enter the b,h of the Triangle:");
			b=sc.nextDouble();
			h=sc.nextDouble();
			//area=(1/2)*(b*h);
			area =(b*h)/2;
			System.out.println("The Triangle area is:"+area);
			break;
		}
	}

}

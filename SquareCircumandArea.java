package testing1;

import java.util.Scanner;

public class SquareCircumandArea 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int option=0;
		double a,circumfrence,area;
		System.out.println("1.Find circumfrence");
		System.out.println("2.Find Area");
		option=sc.nextInt();
		switch(option)
		{
		case 1:
			System.out.println("Enter the a of the Square:");
			a=sc.nextDouble();
			circumfrence=4*a;
			System.out.println("The Square Circumfrence is:"+circumfrence);
			break;
		case 2:
			System.out.println("Enter the a of the Square:");
			a=sc.nextDouble();
			area=a*a;
			System.out.println("The Square area is:"+area);
			break;
		}
	}

}

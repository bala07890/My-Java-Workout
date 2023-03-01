package testing1;

import java.util.Scanner;

public class RectangleCircumandArea 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int option=0;
		double l,h,a,circumfrence,area;
		System.out.println("1.Find circumfrence");
		System.out.println("2.Find Area");
		option=sc.nextInt();
		switch(option)
		{
		case 1:
			System.out.println("Enter the length and height of the recatangle:");
			a=sc.nextDouble();
			
			circumfrence=4*a;
			System.out.println("The recatangle Circumfrence is:"+circumfrence);
			break;
		case 2:
			System.out.println("Enter the a of the recatangle:");
			l=sc.nextDouble();
			h=sc.nextDouble();
			area=l*h;
			System.out.println("The recatangle area is:"+area);
			break;
		}
	}

}

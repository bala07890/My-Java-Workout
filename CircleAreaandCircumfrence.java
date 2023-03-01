package testing1;
import java.util.*;
public class CircleAreaandCircumfrence 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int option=0;
		double radius,circumfrence,area;
		System.out.println("1.Find circumfrence");
		System.out.println("2.Find Area");
		option=sc.nextInt();
		switch(option)
		{
		case 1:
			System.out.println("Enter the radius of the circle:");
			radius=sc.nextDouble();
			circumfrence=2*(Math.PI)*radius;
			System.out.println("The Circle Circumfrence is:"+circumfrence);
			break;
		case 2:
			System.out.println("Enter the radius of the circle:");
			radius=sc.nextDouble();
			area=(Math.PI)*(radius*radius);
			System.out.println("The Circle Circumfrence is:"+area);
			break;
		}
	}

}

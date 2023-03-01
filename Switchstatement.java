package testing1;
import java.util.*;
public class Switchstatement 
{

	public static void main(String[] args) 
	{
		/*int a=122;
		char b=(char)a;
		System.out.println(b);*/
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		switch(num)
		{
		case 80,90,100:
			System.out.println("S Grade");
		    break;
		case 70,75,65:
			System.out.println("A Grade");
		    break;
		case 60,55:
			System.out.println("B Grade");
		    break;
		case 50,40,45:
			System.out.println("C Grade");
		    break;
	    default:
		    	System.out.println("onum perusa illa....");
		}

	}

}

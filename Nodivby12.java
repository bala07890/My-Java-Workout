package testing1;
import java.util.*;
public class Nodivby12 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter only no:");
	   Scanner sc=new Scanner(System.in);
	   int a=sc.nextInt();
	   if(a%12==0)
	   {
		   System.out.println("The no is Divisible by 12:"+a);
	   }
	   else
	   {
		   System.out.println("The no is not Divisble by 12");
	   }

	}

}

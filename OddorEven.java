package testing1;
import java.util.*;
public class OddorEven 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter only number");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int no1=no%2;
		if(no1==1)
		{
			System.out.println("Given no is odd");
		}
		else if(no1==0)
		{
			System.out.println("Given no is even");
		}
		else
		{
			System.out.println("summa koodutha");
		}

	}

}

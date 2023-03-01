package testing1;

import java.util.Scanner;

public class Divisble {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a%11==0)
		{
			System.out.println("divisble by11");
		}
		else if(a%9==0)
		{
			System.out.println("divisble by9");
		}
		else
		{
			System.out.println("not divisble by 9&11");
		}
	}

}

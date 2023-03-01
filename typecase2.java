package testing1;
import java.util.*;
public class typecase2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		for(int i=a;i<=90&i>=65||i>=97&i<=112;i++)
		{
			int b=a++;
			char c=(char)b;
			System.out.println(c);
		}

	}

}

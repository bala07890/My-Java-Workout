package testing1;
import java.util.*;
public class typecast1 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char a1=sc.next().charAt(0);
		int b1=(int)a1;
		for(int i=b1;i<88&i>65||i>=97&i<=112;i++)
		{
		   
		     char c=(char)b1;
		     b1++;
		     System.out.println(c);
		}
	}

}

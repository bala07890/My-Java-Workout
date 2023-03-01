package testing1;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		long no=sc.nextLong();
		long reverse=0;
		long temp=no;
		System.out.println(no);
		while(no>0)
		{
			reverse=(reverse*10)+no%10;
			no=no/10;
		}
		System.out.println(reverse);
		if(temp==reverse)
		{
			System.out.println("This  is Palindrome");
		}
		else
		{
			System.out.println("This is not palindrome");
		}
	}

}

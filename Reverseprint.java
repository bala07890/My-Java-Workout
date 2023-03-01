package testing1;

public class Reverseprint {

	public static void main(String[] args) 
	{
		long no=121765l;
		long reverse=0;
		long temp=no;
		System.out.println(no);
		while(no>0)
		{
			reverse=(reverse*10)+no%10;
			no=no/10;
		 
		}
		System.out.println(reverse);
		if(reverse==temp)
		{
			System.out.println("It is Palindrome");
		}
		else
		{
			System.out.println("It is not Palindrome");
		}
		
		  
	}

}

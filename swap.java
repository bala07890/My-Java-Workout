package testing1;

public class swap 
{

	public static void main(String[] args) 
	{
		//swapp two values without creating temperory variable
		int a=5;
		int b=1;
		a=a+b;//5+1=6
		b=a-b;//6-1=5
		a=a-b;//6-5=1
		//System.out.println(a);
		//System.out.println(b);
		//swapp two values with creating variables
		int num=5;
		int num1=6;
		int temp=num;
		num=num1;
		num1=temp;
		//System.out.println(num);
		//System.out.println(num1);
		
		
		System.out.println(Byte.SIZE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
	}

}

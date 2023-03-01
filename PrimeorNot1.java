package testing1;

public class PrimeorNot1 {

	public static void main(String[] args)
	{
		int no1=9;
		int no2=2;
		boolean bool=true;
		while(no1>=no2)
		{
			if(no1%no2==0)
			{
				System.out.println(no1+"  is not prime no.");
				bool=false;
				break;
			}
			no2++;
		}
		if(bool)
		{
			System.out.println(no1+" is prime no.");
		}
	}

}

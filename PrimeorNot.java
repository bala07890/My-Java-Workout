package testing1;

public class PrimeorNot {

	public static void main(String[] args)
	{
		int i=1;
		while(i<25)
		{
			if(i%1==0&&i%i==1)
			{
				System.out.println(i);
			}
			i++;
		}
	}

}

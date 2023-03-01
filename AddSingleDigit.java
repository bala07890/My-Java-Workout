package testing1;

public class AddSingleDigit 
{

	public static void main(String[] args) 
	{
		int no=123456;
		int no2=0;
		int sum=0;
	    while(no>0)
	    {
	    	no2=no%10;
	    	no=no/10;
	    	sum=sum+no2;
	    	
	    }
	    while(sum>10)
	    {
	    	int lastno=sum%10;
	    	sum=sum/10;
	    	sum=sum+lastno;
	    }
	    System.out.println(sum);
		
	}

}

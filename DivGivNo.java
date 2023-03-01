package testing1;
import java.util.*;
public class DivGivNo 
{

	public static void main(String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter no:");
	   int no1=sc.nextInt();//user given input value
	   int no3=no1/2;//the value divide half for time and memory save
	   int no2=1;
	   int count=0;//counting the divisor value
	   while(no2<=no1)
	   {
		   if(no1%no2==0)
		   {
			   System.out.println(no1+" is Divisble by:"+no2);
			   count++;
		   }
		   no2++;
		 
	   }
	   System.out.println(count);
	}

}

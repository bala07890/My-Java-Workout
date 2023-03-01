package testing1;
import java.util.*;
public class Nodivby5 {

	public static void main(String[] args) 
	{
		System.out.println("Enter only number");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		while(true)
		{
		if(no%5==0)
		{
			System.out.println("Given no is multilpe by 5:"+"  "+no);
		}
		else
		{
			System.out.println("Given no is Not multilpe by 5 ");
		}
		System.out.println("press 1 to continue"+'\n'+"press 0 to stop");
		int a=sc.nextInt();
		if(a%2==0)
		{
			break;
		}
		}
		  
	}
 
}

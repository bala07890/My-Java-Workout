package testing1;
import java.util.*;
public class Divby9and11 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%9==0&&a%11==0)
        {
        	
        	
        	System.out.println("No is Divisble by both 9&11:"+a);
        	
        }
        else
        {
        	System.out.println("No is not Divisble by both 9&11:"+a);
        }
        
	}

}

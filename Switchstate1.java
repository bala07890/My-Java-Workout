package testing1;
import java.util.*;
public class Switchstate1 
{

	public static void main(String[] args) 
	{
		System.out.println("1.january"+'\n'+"2.feburary"+'\n'+"3.march"+'\n'+"4.april"+'\n'+"5.may"
				+'\n'+"6.june"+'\n'+"7.july"+'\n'+"8.august"+'\n'+"9.september"+'\n'+"10.october"+'\n'+"11.november"+'\n'+"12.december");
       //System.out.println(args[0]);
		Scanner sc=new Scanner (System.in);
		String month=sc.next();
		switch(month)
		{
		case "december","january","feburary":
			System.out.println("This  Month is Winter...");
		break;
		case "march","april","may":
			System.out.println("This Month is Summer...");
		break;
		case "june","july","august":
			System.out.println("This  Month is Spring...");
		break;
		case "september","october","november":
			System.out.println("This Month is Rainy...");
		break;
		default:
		    System.out.println("Please Enter only valid Month Above Show ");
		
		}
	}

}

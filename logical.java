package testing1;

public class logical 
{
	public static void main(String[] args) 
	{
		boolean a=true;
		boolean b=false;
		System.out.println("AND gate");
		System.out.println("and gate:"+ (a&&a));
		System.out.println(a&&b);
		System.out.println(b&&a);
		System.out.println(b&&b);
		
		System.out.println("OR gate");
		System.out.println(a||a);
		System.out.println(a||b);
		System.out.println(b||a);
		System.out.println(b||b);
		
		System.out.println("NOT gate");
		System.out.println(a);
		System.out.println(!a);
		System.out.println(b);
		System.out.println(!b);
	}

}

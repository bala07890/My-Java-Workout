package testing1;

public class Incredecre 
{

	public static void main(String[] args) 
	{
		int num=10;
		int num1=10;
		System.out.println("num suffix:"+(num++));
		System.out.println("num1 postfix:"+(++num1));
		System.out.println("num:"+num+"\n"+"num1:"+num1+'\n');
		
		System.out.println("num suffix:"+(num--));
		System.out.println("num1 postfix:"+(--num1));
		System.out.println("num:"+num+"\n"+"num1:"+num1);
	}

}

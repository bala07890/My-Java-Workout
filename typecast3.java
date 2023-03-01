package testing1;

public class typecast3 {

	public static void main(String[] args) 
	{
		byte b1=10;
		short s1=1000;
		int i1=10000;
		long l1=10000000;
		float f1=12.345f;
		double d1=1222.3333;
		short a=(short)(b1+s1);
		long b=(long)(i1+l1);
		double c=f1+d1;
		byte d=(byte)d1;
        System.out.println("The short is:"+a);
        System.out.println("The long is:"+b);
        System.out.println("The double is:"+c);
        System.out.println("The short is:"+d);
	}

}

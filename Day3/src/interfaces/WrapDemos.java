package interfaces;

public class WrapDemos {

public static void main(String[]args)
{
	int num=100;// primitivr
	Integer i = new Integer(num);   //wrapper//wrapping//Boxing
	
	System.out.println(i);
	System.out.println(i.floatValue());
	System.out.println(i.MAX_VALUE);
	System.out.println(i.MIN_VALUE);
	
	
	System.out.println(Integer.max(10,20));
	System.out.println(Integer.min(5,9));
	
	num=i; //Unwrapping //Unboxing(Auto Unboxing)
	System.out.println(num);
	
	num=i.intValue(); //UnBoxing
	System.out.println(num);
	
}
	
	
}

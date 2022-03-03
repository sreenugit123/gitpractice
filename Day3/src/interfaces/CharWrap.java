package interfaces;

public class CharWrap {
	public static void main(String []args) {
		
	
	char ch='A';
    Character c=new Character(ch);

    System.out.println(c.isDigit(ch));
    System.out.println(c.isLetter(ch));
    System.out.println(c.isUpperCase(ch));
    System.out.println(c.isLowerCase(ch));

    Double d=new Double(10.45);
    System.out.println(d.intValue());
    System.out.println(d.MAX_VALUE);

    String val="100";
    int num=Integer.parseInt(val);  // String to Integer
    System.out.println(num);

    String v2= String.valueOf(num); // Integer to String

    String v3= Integer.toString(num); //Integer to String
}
}
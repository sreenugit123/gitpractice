package strings;

public class StringDemo1 {
	
	public static void main (String[]args) {
		
		String s="sparta";
		System.out.println(s.charAt(0));
		String s2="    SPARTA   ";
		System.out.println(s.compareTo(s2));
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println(s.indexOf('p'));
		System.out.println(s.indexOf("art"));
		System.out.println(s.length());
		
		System.out.println(s.concat("ns"));
		System.out.println(s.replace('a','o'));
		System.out.println(s.replace("art","ark"));
		System.out.println(s.substring(3));
		System.out.println(s.substring(0,3));
		System.out.println(s2.trim().length());
		
	}

}

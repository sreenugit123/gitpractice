package strings;

public class StringDemo {
	public static void main(String[]args) {
		
		//creating string
		String s1="Hello";
		String s2=new String("Hello");
		char arr[]= {'a','n','t'};
		String s3=new String(arr);
		byte arr2[] = {'a','n','t'};
		String s4=new String(arr2);
		String s5=new String(s1);
		String s6=s1;
		String s7=new String(arr2,0,2);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
				
		}

}

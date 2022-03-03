package strings;

public class StringBufferDemos {

	public static void main(String[]args) {
	
		StringBuffer sb=new StringBuffer("india");
        System.out.println(sb);       
        sb.append(" is my land");
        System.out.println(sb);
        sb.setCharAt(0, 'I');
        System.out.println(sb);
        //sb.delete(12, 16);
        sb.replace(12,18,"Country");
        System.out.println(sb);       
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb.substring(0, 5));
	}
}

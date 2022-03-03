package strings;

public class task {                       //SUM OF STRING VALUES
	int task2(String input)
	{
		int sum=0;
		char ch[]=input.toCharArray();
		for( char c : ch)
		{
			if(Character.isDigit(c))
			{
				sum=sum+Character.getNumericValue(c);
				//sum=sum+Integer.parseInt(Character.toString(c));
				
			}
		}
			
			return sum;
	}


public static void main(String[]args) {
	
	System.out.println(new task().task2("ABC6542"));
}

}

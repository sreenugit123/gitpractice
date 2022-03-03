package strings;

public class tasks {
	int task (String input)
	{
		int count=0;
		
	char ch;
	for(int k=0;k<input.length();k++)
	{
		ch=input.charAt(k);
		if(Character.isDigit(ch))
			count++;
		
	}
	return count;
	}

		
/*char ch[]=input.toCharArray();            //two ways for count no of digits
for(char c : ch)
{
    if(Character.isDigit(c))
     count++;
}

return count;
	} */


	public static void main (String[]args) {
		System.out.println(new tasks().task("ABC12586"));
	}

}
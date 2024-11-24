import java.util.*;
public class rstr
{
	public static void main(String[] args)
	{
		StringBuilder str=new StringBuilder("Reversedstring");
		System.out.println(str);
		
		for(int i=0;i<str.length()/2;i++)
		{
			int front=i;
			int back=str.length()-i-1;
			
			char frontchar=str.charAt(front);
			char backchar=str.charAt(back);

			str.setCharAt(front, backchar);
			str.setCharAt(back, frontchar);
		}
		System.out.println(str);
	}
}
		
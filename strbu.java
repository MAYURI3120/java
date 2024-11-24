import java.util.*;
public class strbu
{
	public static void main(String[] args)
	{
		StringBuilder sb=new StringBuilder("Mayuriee");
		System.out.println(sb);
		sb.append(" Kamble");
		System.out.println(sb);
		StringBuilder result=new StringBuilder();
		
		for(int i=0;i<sb.length();i++)
		{
			if(sb.charAt(i)=='e')
			{
				result.append('i');
			}
			else
			{
				result.append(sb.charAt(i));
			}
		}
		System.out.println(result);
	}
}
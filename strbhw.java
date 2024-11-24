import java.util.*;
public class strbhw
{
	public static void main(String[] args)
	{
		StringBuilder sb=new StringBuilder("Mayuri1257");
		System.out.println(sb);
		sb.append("Kamble@gmail");
		System.out.println(sb);
		StringBuilder result=new StringBuilder();
		
		for(int i=0;i<sb.length();i++)
		{
			if(sb.charAt(i)=='@')
			{
				break;
			}
			else
			{
				result.append(sb.charAt(i));
			}
		}
		System.out.println(result);
	}
}
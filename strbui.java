import java.util.*;
public class strbui
{
	public static void main(String[] args)
	{
		StringBuilder sb=new StringBuilder("Mayuri");					System.out.println(sb.charAt(1));
		sb.setCharAt(0,'A');
		System.out.println(sb);
		sb.insert(0,'M');
		System.out.println(sb);
		sb.delete(1,2);
		System.out.println(sb);
		sb.append(" kamble");
		System.out.println(sb+" "+sb.length());
	}
}
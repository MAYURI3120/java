import java.util.*;
public class strings
{
	public static void main(String[] args)
	{
		String name="Mayuri";
		String name2="ayuri";
		System.out.println(name);
		Scanner sc=new Scanner(System.in);
		String fullname=sc.nextLine();
		System.out.println(fullname);
		System.out.println(name+" "+fullname);
		System.out.println(name.length());
		String str="123";
		int number=Integer.parseInt(str);
		System.out.println(number);
		String str2=Integer.toString(number);
		System.out.println(str2.length());
		for(int i=0;i<fullname.length();i++)
		{
			System.out.println(fullname.charAt(i));
		}
		System.out.println(name.substring(0, 4));
		if(name.equals(fullname))
		{
			System.out.println("They are the same string");
		}
		else
		{
			System.out.println("They are different string");
		}
		if(name.equals(name2))
		{
			System.out.println("They are the same string");
		}
		else
		{
			System.out.println("They are different string");
		}
	}
}
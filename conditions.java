import java.util.*;
public class conditions
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a==b)
		{
			System.out.println("equal");
		}
		else if(a>b)
		{
			System.out.println(a + " is greater");
		}
		else(a<b)
		{
			System.out.println(a + " is lesser");
		}
	}
}
import java.util.*;
public class funmul
{
	public static int calsum(int a,int b)
	{
		int mul=a*b;
		return mul;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int mul=calsum(a,b);
		System.out.println("Product:"+mul);
	}
}
		
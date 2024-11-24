import java.util.*;
public class son
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		String arr[]=new String[size];
		int totlen=0;

		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextLine();
			totlen=totlen+arr[i].length();
		}
		System.out.println(totlen);
	}
}
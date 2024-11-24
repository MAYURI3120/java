public class dimndeven
{
	public static void main(String[] args)
	{
		int n=4;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			int str=2*(i-1);
			for(int j=i;j<=str;j++)
			{
				System.out.print("*");
			}
			for(int j=str;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			int str=2*(i-1);
			for(int j=i;j<=str;j++)
			{
				System.out.print("*");
			}
			for(int j=str;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();	
		}
	}
}
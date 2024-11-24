public class hrpt
{
	public static void main(String[] args)
	{
		int n=4;
		for(int i=4;i<=n;i++)
		{
			for(int j=1;j<=n-1;j++)
			{
				System.out.print(" ");
			}
			for(int r=1;r<=i;r++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
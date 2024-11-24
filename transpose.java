import java.util.*;
public class transpose
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int matrix[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix representation:-");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
		System.out.println();
		}
		System.out.println("Transpose of Matrix is:-");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(matrix[j][i]+" ");
			}
		System.out.println();
		}
	}
}
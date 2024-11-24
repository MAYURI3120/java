import java.util.*;
public class spiralmatrix 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int [][] matrix=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("Spiral form of matrix is:");
		int rowstart=0;
		int rowend=n-1;
		int columnstart=0;
		int columnend=m-1;
		while(rowstart<=rowend && columnstart<=columnend)
		{
			for(int col=columnstart;col<=columnend;col++)
			{
				System.out.print(matrix[rowstart][col]+" ");
			}
			rowstart++;
			for(int row=rowstart;row<=rowend;row++)
			{
				System.out.print(matrix[row][columnend]+" ");
			}
			columnend--;
			for(int col=columnend;col>=columnstart;col--)
			{
				System.out.print(matrix[rowend][col]+" ");
			}
			rowend--;
			for(int row=rowend;row>=rowstart;row--)
			{
				System.out.print(matrix[row][columnstart]+" ");
			}
			columnstart++;
			System.out.println();
		}
	}
}
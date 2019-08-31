package arraysInJava;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dimentions of the matrix:");
		int m = sc.nextInt();
		int n =sc.nextInt();
		int o = sc.nextInt();
		int p = sc.nextInt();
		
		while (!(n==o && m==p))
		{
			System.out.println("Enter the dimentions again:");
			m = sc.nextInt();
			n = sc.nextInt();
			o = sc.nextInt();
			p = sc.nextInt();
		}
		
		int a[][]=new int[m][n];
		int b[][]=new int[o][p];
		int c[][]=new int[m][n];
		
		System.out.println("Enter the values of the first matrix:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the values of the second matrix:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Resultant matrix is:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}

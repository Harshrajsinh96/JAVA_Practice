import java.util.Scanner;
import java.io.IOException;

public class Mul2Darray {
	
	public static void main(String[] args) throws NumberFormatException, IOException
	{
	int [][] a = new int [5][5];
	int [][] b = new int [5][5];
	int [][] c = new int [5][5];
	int row, col;
	
	Scanner reader = new Scanner(System.in); 
	
	System.out.println ("Enter numbers of row you want...");
	row = reader.nextInt();
	System.out.println ("Enter numbers of col you want...");
	col=reader.nextInt();
	System.out.println("Now enter Elements into array A");
	for (int i=0;i<row;i++)
	{
		for (int j=0;j<col;j++)
		{
		a[i][j]=reader.nextInt();
		}
		}
		System.out.println("Now enter Elements into array B");
		for (int i=0;i<row;i++)
		{
		for (int j=0;j<col;j++)
		{
		b[i][j]=reader.nextInt();
		}
		}
		for (int i=0;i<row;i++)
		{
		for (int j=0;j<col;j++)
		{
		c[i][j]=a[i][j]*b[i][j];
		}
		}
		System.out.println("elements in C[][] after Mul of arrays A and B ");
		for (int i=0;i<row;i++)
		{
		for (int j=0;j<col;j++)
		{
		System.out.println("Elements arr["+ i +"]["+j+"]=" +c[i][j]);
		}
		}
		}
}

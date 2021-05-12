import java.util.*;
public class matrix{
public static void main(String[] args){
int[][] a=new int[10][10];
int[][] b=new int[10][10];
int[][] c=new int[10][10];
int i,j;
Scanner s=new Scanner(System.in);
System.out.println("Enter first row:");
int r1=s.nextInt();
System.out.println("Enter first column:");
int c1=s.nextInt();
System.out.println("Enter"+" "+r1*c1+" "+" elements:");
for( i=0;i<r1;i++)
{
	for( j=0;j<c1;j++)
	{
		a[i][j]=s.nextInt();
	}
}
System.out.println("the first array is:");
for(i=0;i<r1;i++)
{
	for( j=0;j<c1;j++)
	{
		System.out.print(a[i][j]+" ");
	}
	System.out.println();
}
System.out.println("Enter second row:");
int r2=s.nextInt();
System.out.println("Enter second column:");
int c2=s.nextInt();
System.out.println("Enter"+" "+r2*c2+" "+" elements:");
for(i=0;i<r2;i++)
{
	for( j=0;j<c2;j++)
	{
		b[i][j]=s.nextInt();
	}
}
System.out.println("the second array is:");
for( i=0;i<r2;i++)
{
	for(j=0;j<c2;j++)
	{
		System.out.print(b[i][j]+" ");
	}
	System.out.println();
}
if(r1==r2&&c1==c2)
{
	for(i=0;i<r1;i++)
	{
		for(j=0;j<c2;j++)
		{
			c[i][j]=a[i][j]+b[i][j];
		}
	}
	System.out.print("sum is:\n");
	for(i=0;i<r1;i++)
	{
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++){
				System.out.print(c[i][j]+" ");
			}
		System.out.println();
		}
	}
}
else
{
System.out.println("Matrix addition not possible!");
}
}
}
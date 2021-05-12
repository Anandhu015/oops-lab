import java.util.*;
public class symmetric{
public static void main(String[] args){
int[][] a=new int[10][10];
int[][] b=new int[10][10];
int i,j,count=1;
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
System.out.println("the array is:");
for(i=0;i<r1;i++)
{
	for( j=0;j<c1;j++)
	{
		System.out.print(a[i][j]+" ");
	}
	System.out.println();
}
for(i=0;i<c1;i++)
{
	for(j=0;j<r1;j++)
	{
		b[j][i]=a[i][j];
	}
}
System.out.print("transpose of matrix is:\n");
for(i=0;i<c1;i++)
{
	for(j=0;j<r1;j++)
	{
		System.out.print(b[i][j]+" ");
	}
	System.out.println();
}
if(c1==r1)
{
	for(i=0;i<c1;i++)
	{
		for(j=0;j<r1;j++)
		{
			if(a[i][j]!=b[i][j])
			{
				count++;
				break;
			}	
		}
	}
	if(count==1)
	{
		System.out.println("the matrix is symmetric");
	}
	else
	{
		System.out.println("the matrix is not symmetric");	
	}
}	
}
}
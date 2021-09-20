import java.util.*;
class myException extends Exception{
myException(String s)
{
super(s);
}

}
public class exc15 {
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int n,i,pint,count=0;
    double sum=0,avg=0;
    System.out.println("Enter the limit:");
    n=sc.nextInt();
	for(i=0;i<n;i++)
	{
		System.out.print("\nenter a positive Integer:");
        pint=sc.nextInt();
        try {
            	
            	if(pint<0)
            	{
					n++;
					count++;
					throw new myException("Negative number not possible ");
						
				}
				else
				{
					sum=sum+n;
				}
			}	
	 		catch (Exception e) 
			 {
            	System.out.println("Error "+e.getMessage());
			 }
	}
	n=n-count;
	avg=sum/n;
	System.out.print("Average="+avg);
}

}


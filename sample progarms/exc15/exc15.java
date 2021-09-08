import java.util.*;
import java.lang.*;
class myException extends Exception{
myException(String s)
{
super(s);
}

}
public class exc15 {
public static void main(String[] args)
{
    ArrayList<Integer> a=new ArrayList<Integer>();
    Scanner sc=new Scanner(System.in);
    int n,i,pint;
    double sum=0,avg;
	
    System.out.println("Enter the limit:");
    n=sc.nextInt();
   
        try {
		for(i=0;i<n;i++)
		{
            		System.out.print("enter a positive Integer:");
            		pint=sc.nextInt();
            		if(pint<0)
            		{
                		throw new myException("this is not possible ");
            		}
            		a.add(pint);
		}
		for(i=0;i<a.size();i++)
	    	{
			sum=sum+a.get(i);

	     	}
	    	avg=sum/n;
		System.out.print("Average="+avg);
	}
	 catch (Exception e) {
            System.out.println("Error "+e.getMessage());
            
        }
}

}


import java.lang.*;
import java.util.*;
class thread1 extends Thread
{
    public void run()
    {
       for(int i=1;i<=11;i++)
	{
		System.out.println(i+"*"+"5"+"="+(i*5));
	}

    }
}
class thread2 extends Thread
{
    int n;
    int fact;
    thread2(int n)
    {
	this.n=n;
    }
    public void run()
    {
       for(int i=2;i<=n;i+=1)
	{
	   fact=0;
	   for(int j=1;j<=n;j++)
	   {
		if(i%j==0)
		{
			fact++;
		}
	   }
		if(fact==2)
		{
			System.out.println(i);
                }
         }
      
		
	}

    }
public class exc16{
	public static void main(String[] Args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number:");
    		int n=sc.nextInt();
		thread1 th1=new thread1();
		th1.start();
		thread2 th2=new thread2(n);
		th2.start();
		
	}
    
    
}

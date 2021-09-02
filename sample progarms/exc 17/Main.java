import java.lang.*;
import java.util.*;
class thread2 implements Runnable
{
int n1=0,n2=1,n3;
int n;
    thread2(int n)
    {
	this.n=n;
    }
    public void run()
    {
	System.out.println(n1);
	System.out.println(n2);
       for(int i=2;i<n;i++)
	{
		n3=n1+n2;
		System.out.println(n3);
		n1=n2;
		n2=n3;
	
	}

    }
}
class thread1 implements Runnable
{
    int n;
    thread1(int n)
    {
	this.n=n;
    }
    public void run()
    {
       for(int i=0;i<n;i+=2)
	{
		System.out.println(i);
	
	}

    }
}
public class Main {
	public static void main(String[] Args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number:");
    		int n=sc.nextInt();
		thread2 th2=new thread2(n);
		Thread T2=new Thread(th2);
		thread1 th1=new thread1(n);
		Thread T1=new Thread(th1);
		T2.start();
		T1.start();
		
	}
    
    
}

import arithmetic.*;
import java.util.*;
public class arithmetic_pc implements arithmetic.substract{
	public void sub(double a,double b)
	{
		System.out.println(a-b);
	}
	public void div(double a,double b)
	{
		System.out.println(a/b);
	}

	
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
       	int n;
       do{
           double a,b;
           System.out.println("ENTER CHOICE:");
           System.out.println("\n1.ADDITION\n2.SUBSTRACTION\n3.MULTIPLICATION\n4.DIVISION\n0.EXIT");
           n=sc.nextInt();
           if(n==1)
           {
            System.out.println("\nADDITION\n");
            add r=new add();
            System.out.println("Enter two numbers:");
            a=sc.nextDouble();
            b=sc.nextDouble();
            System.out.println("SUM");
            System.out.println(r.sum(a,b));
           }
           else if(n==2)
           {
            System.out.println("\nSUBSTRACTION\n");
            arithmetic_pc sq=new arithmetic_pc();
            System.out.println("Enter two numbers:");
            a=sc.nextDouble();
            b=sc.nextDouble();
            System.out.println("SUBSTRACTION");
            sq.sub(a,b);
           }
           else if(n==3)
           {
            System.out.println("\nMULTIPLICATION\n");
            multiplication gp=new multiplication();
            System.out.println("Enter two numbers:");
            a=sc.nextDouble();
            b=sc.nextDouble();
            System.out.println("MULTIPLICATION");
            System.out.println(gp.mul(a,b));
            
           }
           else if(n==4)
           {
            System.out.print("\nDIVISION\n");
            arithmetic_pc gc=new arithmetic_pc();
            System.out.println("Enter two numbers:");
            a=sc.nextDouble();
            b=sc.nextDouble();
            System.out.println("DIVISION");
            gc.div(a,b);
           }
           else if(n==0)
           {
               break;
           }
           else
           {
               System.out.println("invalid entry");
           }
        }while(n!=0);
}
}
import graphics.*;

import java.awt.Rectangle;
import java.util.*;
public class graphic_pac implements graphics.triangle{
    
    public void area_tri(float a,float b,float c)
    {	
	    float s=a+b+c/2;
        System.out.println(Math.sqrt(s*(s-a)*(s-b)*(s-c)));

    }
    public void area_cir(double r)
    {
        System.out.println(3.14*r*r);
                
    }

    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int n;
       do{
           float a,b;
           double c;
           System.out.println("ENTER CHOICE:");
           System.out.println("\n1.RECTANGLE\n2.SQUARE\n3.CIRCLE\n4.TRIANGLE\n0.EXIT");
           n=sc.nextInt();
           if(n==1)
           {
            System.out.println("\nRECTANGLE\n");
            rectangle r=new rectangle();
            System.out.println("Enter two sides:");
            a=sc.nextFloat();
            b=sc.nextFloat();
            System.out.println("AREA");
            System.out.println(r.area(a,b));
           }
           else if(n==2)
           {
            System.out.println("\nSQUARE\n");
            square sq=new square();
            System.out.println("Enter a side:");
            c=sc.nextDouble();
            System.out.println("AREA");
            System.out.println(sq.area_sq(c));
           }
           else if(n==3)
           {
            System.out.println("\nCIRCLE\n");
            graphic_pac gp=new graphic_pac();
            System.out.println("Enter radius:");
            c=sc.nextDouble();
            System.out.println("AREA");
            gp.area_cir(c);
            
           }
           else if(n==4)
           {
            System.out.print("\n______TRIANGLE____\n");
            graphic_pac gc=new graphic_pac();
            System.out.println("enter three sides:");
            float f=sc.nextFloat();
            float d=sc.nextFloat();
            float e=sc.nextFloat();
            System.out.println("AREA");
            gc.area_tri(f,d,e);
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

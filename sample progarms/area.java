/*9.	Write a program to find the area of rectangle, circle and square using overloaded functions*/
import java.util.*;
class area
{
void area(double l,double b)
{
double area=l*b;
System.out.print("\narea of reactangle:"+area);
}
void area(float r)
{
double area=3.14*r*r; 
System.out.println("\narea of circle:"+area);
}
void area(double a)
{
double area=a*a;
System.out.println("\narea of Square:"+area);
}
public static void main(String[] args)
{
double length,bredth,side, radius;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the Length:");
length=sc.nextDouble();
System.out.print("Enter the bredth:");
bredth=sc.nextDouble();
System.out.print("Enter the radius:");
radius=sc.nextFloat();
System.out.print("Enter the side:");
side=sc.nextInt();
area a=new area();
a.area(length,bredth);
a.area(radius);
a.area(side);
}
}


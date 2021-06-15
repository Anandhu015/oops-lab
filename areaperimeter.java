/*17. Create an interface having prototypes of functions area() and perimeter().
 Create two classes Circle and Rectangle which implement the above interface.
 Create a menu driven program to find the area and perimeter of objects.*/
import java.util.*;
interface sample
{
public void area();
public void perimeter();
}
class circle implements sample
{
float r;
Scanner sc=new Scanner(System.in);

public void area()
{
System.out.println("Enter radius of circle:  ");
r=sc.nextFloat();
System.out.println("Area of circle:  "+(3.14*r*r));
}
public void perimeter()
{
System.out.println("Enter radius of circle:  ");
r=sc.nextFloat();
System.out.println("Perimeter of circle:  "+(2*3.14*r));
}
}
class rectangle implements sample{
int a,b;
Scanner sc=new Scanner(System.in);
public void area()
{
System.out.println("Enter the length"); 
a=sc.nextInt();
System.out.print("breadth of rectangle: ");
b=sc.nextInt();
System.out.println("Area of rectangle:  "+(a*b));
}
public void perimeter()
{		
System.out.println("Enter the length"); 
a=sc.nextInt();
System.out.print("breadth of rectangle: ");
b=sc.nextInt();
System.out.println("Area of rectangle:  "+(2*(a+b)));
}
}
class areaperimeter
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n;
circle c=new circle();
rectangle r=new rectangle();
do{
System.out.println("\n\n1.AREA OF CIRCLE\n2.PERIMETER OF CIRCLE\n3.AREA OF RECTANGLE\n4.PERIMETER OF RECTANGLE\n0.EXIT ");
System.out.println("Enter choice");
n=s.nextInt();
switch(n)
{
case 1:
c.area();
break;
case 2:
c.perimeter();
break;
case 3:
r.area();
break;
case 4:
r.perimeter();
case 0:
break;
default:
System.out.println("please enter correct value");
break;
}
}while(n>0);
}
}

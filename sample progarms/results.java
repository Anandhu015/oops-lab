/*16. Create classes Student and Sports. Create another class Result inherited from Student and Sports.
Display the academic and sports score of a student.*/
import java.util.*;
import java.io.*;
interface student
{
public void s_read();
public void s_display();
}
interface sports
{
public void sp_read();
public void sp_display();
}
class result implements student,sports
{
String n,i,g;
int m,r;
Scanner sc=new Scanner(System.in);
public void s_read()
{
System.out.print("-------Enter Student Details-------\n");
System.out.println("Enter student name:  ");
n=sc.nextLine();
System.out.println("Enter student grade:  ");
g=sc.nextLine();
System.out.println("Enter student mark:  ");
m=sc.nextInt();
}
public void sp_read()
{
System.out.println("--------Enter student sports details-------\n");
System.out.println("Enter student participating sports item:");
i=System.console().readLine();
System.out.println("Enter student sports score:  ");
r=sc.nextInt();
}
public void s_display()
{
System.out.println("------Student Results-------\n ");
System.out.println("Student name:  "+n);
System.out.println("Student mark:  "+m);
System.out.println("Student grade:  "+g);
}
public void sp_display()
{
System.out.println("Student participating sports item:  "+i);
System.out.println("Student Sports score:  "+r);
}
}
class results
{
public static void main(String[] args)
{
result obj=new result();
obj.s_read();
obj.sp_read();
obj.s_display();
obj.sp_display();
}
}



import java.io.*;
import java.util.*;
class person{
String name;
String gender;
String Address;
int Age;
person(String n,String g, String add, int age)
{
name=n;
gender=g;
Address=add;
Age=age;
}
}
class Employee extends person
{
int Empid;
String Company_name;
String Qualification;
double Salary; 
Employee(String n,String g, String add, int age,int id,String c_name,String Qual,double Sal)
{
super(n,g,add,age);
Empid=id;
Company_name=c_name;
Qualification=Qual;
Salary=Sal; 
}
}
class Teacher extends Employee
{
String Subject;
String Department;
int Teacherid;
Teacher(String n,String g, String add, int age,int id,String c_name,String Qual,double Sal,String Sub,String Dept,int Tid)
{
super(n,g,add,age,id,c_name,Qual,Sal);
Subject=Sub;
Department=Dept;
Teacherid=Tid;
}
void display()
{
System.out.println("\n\t**************EMPLOYEE DETAILS************");
System.out.println("\n\tNAME:"+name+"\n\tGENDER:"+gender+"\n\tADDRESS:"+Address+"\n\tAGE:"+Age);
System.out.println("\n\tEMPLOYEE_ID:"+Empid+"\n\tCOMPANY:"+Company_name+"\n\tQUALIFICATIONS:"+Qualification+"\n\tSALARY:"+Salary);
System.out.println("\n\tSUBJECT:"+Subject+"\n\tDEPARTMENT:"+Department+"\n\tTEACHER_ID:"+Teacherid);
}
}
class department
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter number of employees:");
int n=in.nextInt();
Teacher t[]=new Teacher[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter name:");
String na=System.console().readLine();
System.out.println("Enter gender[male/female/other]:");
String g=System.console().readLine(); 
System.out.println("Enter Address:");
String add=System.console().readLine();
System.out.println("Enter Age:");
int age=in.nextInt();
System.out.println("Enter Employee id:");
int id=in.nextInt();
System.out.println("Enter Company_name:");
String c_name=System.console().readLine();
System.out.println("Enter Qualification:");
String Qual=System.console().readLine();
System.out.println("Enter Salary:");
double Sal=in.nextDouble();
System.out.println("Enter Subject:");
String Sub=System.console().readLine();
System.out.println("Enter Department:");
String Dept=System.console().readLine();
System.out.println("Enter Teacher_id:");
int Tid=in.nextInt();
t[i]=new Teacher(na,g,add,age,id,c_name,Qual,Sal,Sub,Dept,Tid);
}
for(Teacher i : t)
{
	i.display();
}
}
}
/*14. 	Create a class ‘Employee’ with data members Empid, Name, Salary, Address 
and constructors to initialize the data members.
 Create another class ‘Teacher’ that inherit the properties of class employee 
and contain its own data members department, Subjects taught and
 constructors to initialize these data members and also include display function
 to display all the data members. Use array of objects to display details of N teachers.*/
import java.util.*;
import java.io.*;
class employee{
int empid;
String name;
double salary;
String address;
employee(int d,String n,double s,String add)
{
empid=d;
name=n;
salary=s;
address=add;
}
}
class teacher extends employee{
String department;
String sub_taught;
teacher(int d,String n,double s,String add,String dept,String sub_t)
{
super(d,n,s,add);
department=dept;
sub_taught=sub_t;
}
void display()
{
System.out.println("****************INSTITUTE******************");
System.out.println("\n\tEMPLOYEE_ID:"+empid+"\n\tNAME:"+name+"\n\tSALARY:"+salary+"\n\tADDRESS:"+address);
System.out.println("\n\tDEPARTMENT:"+department+"\n\tSUBJECTS-TAUGHT:"+sub_taught);
}
}
class employee2{
	public static void main(String[] args)
	{
		Scanner br=new Scanner(System.in);
		System.out.println("enter number of employees");
		int n=br.nextInt();
		teacher t[]=new teacher[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("enter employee id:");
			int d=br.nextInt();
			System.out.println("enter Employee name:");
			String na=System.console().readLine();
			System.out.println("enter salary:");
			double s=br.nextDouble();
			System.out.println("Enter Address:");
			String add=System.console().readLine();
			System.out.println("enter department name:");
			String dept=System.console().readLine();
			System.out.println("Enter subject taught:");
			String sub=System.console().readLine();		
			t[i]=new  teacher(d,na,s,add,dept,sub);
                        System.out.println("***************************************");
		}
		for(teacher i : t)
		{
			i.display();
		}
	}
}
 


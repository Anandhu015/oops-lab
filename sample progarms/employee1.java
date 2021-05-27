import java.util.*;
class emp{
int eNo;
String eName;
double eSalary;
emp(int no,String name,double salary){
eNo=no;
eName=name;
eSalary=salary;
}
void display(int number){
if(eNo==number)
{
System.out.print("*********SEARCH SUCESSFUL!**********");
System.out.println("\n\tEmployee number:"+eNo+"\n\tEmployee Name:"+eName+"\n\tEmployee salary:"+eSalary);
}
else{
System.out.print("NOT FOUND!!!!!!!");
}
} 
}
public class employee1{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter number of employees");
int n=sc.nextInt();
emp e[]=new emp[n];
for(int i=0;i<n;i++){
System.out.println("enter employee number:");
int eno=sc.nextInt();
System.out.println("enter name of the employee:");
String name=sc.next();
System.out.println("enter employee salary:");
double sal=sc.nextDouble();
e[i]=new emp(eno,name,sal);
} 
System.out.print("Please enter a Employee number to search:");
int no=sc.nextInt();
for(emp i : e){
i.display(no);
}
}
}
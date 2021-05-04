public class employee{
int emp_id;
String emp_name;
double mon_salary;
double yearly_salary;
void read(int id,String name,double salary){
emp_id=id;
emp_name=name;
mon_salary=salary;
}
void display()
{
	yearly_salary=mon_salary*12;
	System.out.println("\n\t      EMPLOYEE       ");
	System.out.println("\t______________________");

	System.out.println("\n\temployee id:"+emp_id+"\n\temployee name:"+emp_name+"\n\tyearly-salary:"+yearly_salary);
}
public static void main(String[] args){
employee emp1=new employee();
emp1.read(100,"vinod",1000);
emp1.display();
employee emp2=new employee();
emp2.read(101,"saru",2000);
emp2.display();	
employee emp3=new employee();
emp3.read(100,"lekha",3000);
emp3.display();
}
}
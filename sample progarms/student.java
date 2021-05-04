class student{
int rollno;
String stud_name;
double mark1;
double mark2;
double mark3;
double total_mark;
void read(int no,String name,double m1,double m2,double m3){
rollno=no;
stud_name=name;
mark1=m1;
mark2=m2;
mark3=m3;
}
void display(){
total_mark=mark1+mark2+mark3;
System.out.println("\n\troll-no:"+rollno+"\n\tstudent name:"+stud_name+"\n\tmark1:"+mark1+"\n\tmark2:"+mark2+"\n\tmark3:"+mark3+"\n\ttotal-mark:"+total_mark);
}
double topper(){
return total_mark;
}
public static void main(String[] args){
System.out.println("\n\t    STUDENT    ");
System.out.println("\n\t__________________");
student stu1=new student();
stu1.read(1,"ramu",20,19,18);
stu1.display();
student stu2=new student();
stu2.read(2,"ravi",20,20,5);
stu2.display();
student stu3=new student();
stu3.read(3,"vinod",15,25,18);
stu3.display();
if(stu1.topper()>stu2.topper()&&stu1.topper()>stu3.topper())
{
	System.out.println("first student is topper");
}
else if(stu2.topper()>stu3.topper())
{
	System.out.println("second student is topper");
}
else
{
	System.out.println("third student is topper");
}
}
}



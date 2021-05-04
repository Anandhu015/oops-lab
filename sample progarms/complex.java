public class complex{
int real;
int img;
void read(int a,int b)
{
real=a;
img=b;
}
void display()
{
	System.out.println("complex number="+real+"+"+img+"i");
}
public static void main(String[] args){
int temp1,temp2;
complex comp1=new complex();
comp1.read(2,3);
comp1.display();
complex comp2=new complex();
comp2.read(4,5);
comp2.display();
temp1=comp1.real+comp2.real;
temp2=comp1.img+comp2.img;
System.out.println("\n\t"+temp1+"+"+temp2+"i");
}
}
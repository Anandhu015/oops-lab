import java.util.Scanner;
import java.io.*;
class string{
void count(String mystring)
{
String b[]=mystring.split(" ");
System.out.println(b.length);
for (int i = 0; i <b.length; i++) {
        int count = 0;

        for (int j = 0; j <b.length; j++) {
            String temp = b[j];
            String temp1 = b[i];
            if (temp==temp1) {
                count = count + 1;

            }
            if (j == b.length-1) {
            System.out.println(">>\t" + b[i] + "\tpresnt " + count + " number of times");
            }

        }

    }
}
void replace(String mystring)
{
Scanner r=new Scanner(System.in);
System.out.println("Enter a word need to replace");
String re=r.nextLine();
System.out.println("Enter a word need to place");
String word=r.nextLine();
String b[]=mystring.split(" ");
for(int i=0;i<b.length;i++)
{
	if(re.equals(b[i]))
	{	
		b[i]=word;
	}
}
for(int i=0;i<b.length;i++)
{
System.out.print(b[i]+" ");
}
}
void reverse(String mystring)
{
byte[] b=mystring.getBytes();
byte[] result=new byte[b.length];
for(int i=0;i<b.length;i++)
{
result[i]=b[b.length-i-1];
}
System.out.println(new String(result));
}
public static void main(String[] args){
String mystring;
int n;
Scanner a=new Scanner(System.in);
System.out.println("Enter a String");
mystring=a.nextLine();
string st=new string();
do{
System.out.println("\n\t*******STRING OPERATIONS*****");
System.out.println("\n\t1.COUNT");
System.out.println("\n\t2.REPLACE");
System.out.println("\n\t3.REVERSE");
System.out.println("\n\t0.EXIT");
System.out.println("enter your choice:");
n=a.nextInt();

	switch(n)
	{
		case 1:
		st.count(mystring);
		break;
		case 2:
		st.replace(mystring);
		break;
		case 3:
		st.reverse(mystring);
		break;
		case 0:
		System.out.println("EXIT");
		break;
		default:
		System.out.println("Incorrect value!pls enter valid number");
	}
}while(n>0);
}
}

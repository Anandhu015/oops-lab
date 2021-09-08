import java.util.*;

public class exc18
{
    public static void main(String[] args)
    {
        ArrayList<String> ar=new ArrayList<String>();
        int n,num;
        String m;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("1.add an element\n2.add an element to specific index\n3.Remove an element\n4.remove element at an specific index\n5.Display the arrayList");
            System.out.println("Enter choice");
            n=sc.nextInt();
            switch(n)
            {
                case 1:
                System.out.print("add an element:");
                m=sc.next();
                ar.add(m);
                break;
                case 2:
                System.out.println("enter the index");
                num=sc.nextInt();
                System.out.print("add an element to the "+num+" nd index:");
                m=sc.next();
                ar.add(num,m);
                break;
                case 3:
                System.out.print("remove an element:");
                m=sc.next();
                ar.remove(m);
                break;
                case 4:
                System.out.print("remove an element at an specific index:");
                System.out.println("enter the index");
                num=sc.nextInt();
                ar.remove(num);
                break;
                case 5:
                System.out.println("Display the arrayList");
                for(String s : ar)
                {
                    System.out.println(s);
                }
                break;
                case 0:
                break;
                default:
                System.out.print("Please enter a valid number\n");
            }

        }while(n>0);
        
    }
}

  import java.util.*;
public class list {
  
    public static void main(String[] args) {
        LinkedList<Integer> li=new LinkedList<Integer>();
        Scanner sc=new Scanner(System.in);
        int n,value;
        System.out.print("enter the limit:");
        n=sc.nextInt();
        while(n>0)
        {
            
            System.out.print("enter the elements:");
            value=sc.nextInt();
            li.add(value);
            n=n-1;
        }
        System.out.println("list before deleting");
        System.out.println(li);
        System.out.println("list after deleting all elements");
        li.clear();
        System.out.print(li);
    }   
}

import java.util.*;
public class account
{
        String name;
        int acc_no;
        String type;
        double balance;
        public account(String n,int no,String t,double a)
            {
               name=n;
               acc_no=no;
               type=t;
               balance=a;
            }
        public String display()
            {
                String result="";
                result="\nName:"+name+"\nAccount number:"+acc_no+"\nAccount-type:"+type+"\nbalance:"+balance;
                return result;
            }
        public void credit(double amount)
            {
                System.out.println("cash deposited successfully!");
                balance=balance+amount;
                System.out.println("new balance="+balance);
            }
        public void debit(double withdraw)
            {
                if(balance-withdraw<=1000)
                    {
	                    System.out.println("INSUFFICIENT BALANCE!");
                    }
                else
                    {
	                    balance=balance-withdraw;
	                    System.out.println("new balance="+balance);
                    }
            }
        public static void main(String[] args)
            {
                String acc_type;
                String name;
                int acc_no;
                double balance;
                double deposit;
                int n;
                double withdraw;
                Scanner key=new Scanner(System.in);
                Scanner text=new Scanner(System.in);
                System.out.println("enter name of the account holder:");
                name=key.nextLine();
                System.out.println("enter account number:");
                acc_no=key.nextInt();
                System.out.println("type of account[CUREENT/SAVINGS]:");
                acc_type=text.nextLine();
                System.out.println("enter balance:");
                balance=key.nextDouble();
                account acc1=new account(name,acc_no,acc_type,balance);
                do
                    {
                        System.out.println("\nBANKING\n");
                        System.out.println("---------------\n");
                        System.out.println("\n1.ACCOUNT DETAIL\n2.DEPOSIT\n3.WITHDRAW\n0.EXIT");
                        System.out.println("enter your choice:");
                        n=key.nextInt();
                        if(n==1)
                            {
                                System.out.println(acc1.display()); 
                            }
                        else if(n==2)
                            {
                                System.out.println("enter an amount to deposit:");
                                deposit=key.nextDouble();
                                acc1.credit(deposit); 
                            }
                        else if(n==3)
                            {
                                System.out.println("enter an amount to withdraw:");
                                withdraw=key.nextDouble();
                                acc1.debit(withdraw); 
                            }
                    }while(n!=0);
            }
	
   }

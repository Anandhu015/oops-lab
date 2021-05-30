
import java.util.*;
class book{
String title;
int ISBN;
String author;
double price;
String publisher;
book(String title,int no,String aut,double p, String pub){
this.title=title;
this.ISBN=no;
this.author=aut;
this.price=p;
this.publisher=pub;
}
void display()
{
	System.out.println("*******BOOK DETAILS*******");
	System.out.println("\n\tISBN:"+this.ISBN);
	System.out.println("\n\tTITLE:"+this.title);
	System.out.println("\n\tAUTHOR:"+this.author);
	System.out.println("\n\tPRICE:"+this.price);
	System.out.println("\n\tPUBLISHER:"+this.publisher);
}
public static void main(String[] args){
book b[]=new book[5];
b[0]=new book("manju",100,"MT vasudevan nair",750.00,"Dc Books");
b[1]=new book("arachar",101,"KR meera",700.00,"oxford");
b[2]=new book("animal farm",102,"benjamin",500.00,"orange publishers");
b[3]=new book("ramaynam",103,"valmiki",800,"jaico publishing house");
b[4]=new book("journey to the center of the Earth",104,"joules vern",700,"wstland publications");
for(int i=0;i<5;i++)
{
	for(int j=0;j<5;j++)
	{
		if(b[i].title.compareTo(b[j].title)>0)
		{
			book temp=b[i];
			b[i]=b[j];
			b[j]=temp;
		}
	}
}
for(int i=0;i<5;i++)
{
	b[i].display();
}
}
}
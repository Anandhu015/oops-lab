import java.io.*;
import java.util.*;
class main
{
public static void main(String[] args)
{
String str="";
char c;
int v_count=0;
int word_count=0;
int digits_count=0;
int number_count=0;
try
{

	FileReader fr=new FileReader("words.txt");
	BufferedReader b=new BufferedReader(fr);
	while((str=b.readLine())!=null)
	{
		for(int i=0;i<str.length();i++)
		{
			c=Character.toUpperCase(str.charAt(i));
			if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				v_count++;
			}
			digits_count++;
			if(Character.isDigit(str.charAt(i)))
			{
				number_count++;
			}
			
		}
		String a[]=str.split(" ");
		word_count=word_count+a.length;
		
		
		
	}
	System.out.println("vowels_count:"+v_count);
	System.out.println("word_count:"+word_count);
	System.out.println("digits_count:"+digits_count);
	System.out.print("Number_count:"+number_count);
	
	
	
}
catch(Exception e)
{
	System.out.print("Error"+e);
}
}

}

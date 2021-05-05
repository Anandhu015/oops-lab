public class rectangle{
double width,length,area;
String color;
void display(){
System.out.println("\n\tarea="+area+"\n\tcolor:"+color);
}
double area(){
return area;
}
String color(){
return color;
}
rectangle(double w,double l,String col)
{
width=w;
length=l;
color=col;
area=l*w;
}
public static void main(String[] args){
System.out.println("\n\t*****fIRST RECTANGLE****");
System.out.println("\n\t_________________________");
rectangle rec1=new rectangle(12,4,"red");
rec1.display();
System.out.println("\n\t*****SECOND RECTANGLE****");
System.out.println("\n\t_________________________");
rectangle rec2=new rectangle(3,30,"red");
rec2.display();
if(rec1.area()>rec2.area()){
System.out.println("\tfirst area is grater");
}
else
{
System.out.println("\tsecond area is grater");
}
if(rec1.color()==rec2.color()){
System.out.println("\tMatching rectangles");
}
else{
System.out.println("\tNon matching colors");
}
}
}


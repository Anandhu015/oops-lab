public class classroom{
int roomno;
String roomtype;
double roomarea;
void display(){
System.out.println("\n\troom-no:"+roomno+"\n\troom-type:"+roomtype+"\n\troom-area:"+roomarea+"sqft");
System.out.println("\n\t*************************************************");
}
classroom(){
roomno=3;
roomtype="office";
roomarea=732;
}
classroom(int no,String type,double area){
roomno=no;
roomtype=type;
roomarea=area;
}
public static void main(String[] args){
System.out.println("\n\t*******CLASS DETAILS*********");
System.out.println("\n\t_____________________________");
classroom cs1=new classroom();
cs1.display();
classroom cs2=new classroom(101,"seminar-hall",345);
cs2.display();
}
}
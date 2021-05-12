class cpu{
double price;
void disp(double p){
price=p;
System.out.println("********************CPU**********************");
System.out.println("\n\tPrice:"+price);
}
class processor{
int no_cores;
String manufacturer;
void disp(int no,String man){
no_cores=no;
manufacturer=man;
System.out.println("********************PROCESSOR**********************");
System.out.println("\n\tno of cores:"+no_cores+"\n\tmanufacturer:"+manufacturer);
}
}
static class ram{
double memmory;
String manufacturer;
void disp(double mem,String man){
memmory=mem;
manufacturer=man;
System.out.println("********************RAM**********************");
System.out.println("\n\tMEMMORY:"+memmory+"gb"+"\n\tMANUFACTURER:"+manufacturer);
}
}
}
class computer{
public static void main(String[] args){
cpu o=new cpu();
o.disp(2000);
cpu.processor i=o.new processor();
i.disp(18,"dell");
cpu.ram r=new cpu.ram();
r.disp(8,"IBM");
}
}
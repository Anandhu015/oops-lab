
import java.io.*;
import java.util.*;


public class file {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        File f1=new File("text2.txt");
        FileWriter fw=null;
        BufferedWriter bw=null;
        try {
             FileReader fr=new FileReader("text1.txt");
             BufferedReader br=new BufferedReader(fr);
             fw=new FileWriter("text2.txt");
             bw=new BufferedWriter(fw);

             
             String s="";
            while((s=br.readLine())!=null)
            {
                bw.write(s);
                bw.newLine();
                bw.flush();
            }
            br.close();
            bw.close();

        } catch (Exception e) {
            System.out.println("error"+e);
        }

    }
}

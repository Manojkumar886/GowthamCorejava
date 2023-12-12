package FundamentalJava.Files;

import java.io.*;

public class ObjectRead
{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file=new File("D:\\Objectofmobiles.pdf");

        FileInputStream fis=new FileInputStream(file);

        ObjectInputStream ois=new ObjectInputStream(fis);

        Mobiles temp=(Mobiles) ois.readObject();

        System.out.println(" type 1 - mobile details are");
        System.out.println(" Brand / model / prize / ram \n "+temp.brand+"/"+temp.model+"/"+temp.prize+"/"+temp.ram);

        ois.close();
        fis.close();
    }
}

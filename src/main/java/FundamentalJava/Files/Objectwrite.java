package FundamentalJava.Files;

import java.io.*;

public class Objectwrite
{
    public static void main(String[] args) throws IOException
    {
        File file=new File("D:\\Objectofmobiles.pdf");

//        file.createNewFile();


        FileOutputStream fos=new FileOutputStream(file);

        ObjectOutputStream oos=new ObjectOutputStream(fos);

        Mobiles type1=new Mobiles();

        type1.brand="Oppo";
        type1.model="2018";
        type1.ram=8;
        type1.prize=20000;


        oos.writeObject(type1);


        oos.close();
        fos.close();

    }
}
class  Mobiles implements Serializable
{
    String brand;
    String model;
    int prize;
    int ram;
}

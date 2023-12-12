package FundamentalJava.Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class DemoReading
{
    public static void main(String[] args) throws FileNotFoundException,IOException
    {
        File file=new File("E:\\FundamentalJava\\Variable.txt");

        FileInputStream fis=new FileInputStream(file);

        int size=fis.available(); // how much byte of values stored in my file

        byte[] temp=new byte[size];

        fis.read(temp);  //bytes

        String  bytetoString =new String(temp);

        System.out.println(bytetoString+" \n in the content only stored in your file"
        +file.getName());
        fis.close();
    }
}

package FundamentalJava.Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

public class Securewrite
{
    public static void main(String[] args) throws IOException
    {
        File file=new File("D:\\SecureFile.doc");

//        file.createNewFile();

        FileOutputStream fos=new FileOutputStream(file);

        DeflaterOutputStream dos=new DeflaterOutputStream(fos);

        String content="file is abstarct datatype.A named location used to store related information is called files.";
        dos.write(content.getBytes());

        System.out.println(file.getName()+" content is written successfully");

        dos.close();
        fos.close();

    }
}

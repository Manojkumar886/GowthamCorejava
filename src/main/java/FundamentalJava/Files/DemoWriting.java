package FundamentalJava.Files;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoWriting
{
    public static void main(String[] args) throws IOException
    {
        File file=new File("D:\\Gowthamfileconcept.txt");
//        file.createNewFile();
//        System.out.println(file.getName());

        FileOutputStream  fos=new FileOutputStream(file);
        String content="file is abstarct datatype.A named location used to store related information is called files.";
        fos.write(content.getBytes());

        System.out.println(file.getName()+" content is written successfully");

        fos.close();
    }
}

package FundamentalJava.Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class SecureReading
{
    public static void main(String[] args) throws IOException
    {
        File file=new File("D:\\SecureFile.doc");

        FileInputStream fis=new FileInputStream(file);

        InflaterInputStream iis=new InflaterInputStream(fis);

        byte [] getbytesvalues=new byte[fis.available()];

        iis.read(getbytesvalues);

        String myvalues=new String(getbytesvalues);

        System.out.println(myvalues);

        iis.close();
        fis.close();

    }
}

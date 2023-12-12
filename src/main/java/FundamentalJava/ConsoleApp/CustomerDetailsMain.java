package FundamentalJava.ConsoleApp;

import java.io.IOException;

public class CustomerDetailsMain
{
    public static void main(String[] args) throws IOException
    {
        CustomerDetailsActivation activate=new CustomerDetailsActivation();

        Thread th1=new Thread(activate,"Manojkumar");

        Thread th2=new Thread(activate,"Gowtham");

        Thread th3=new Thread(activate,"Annamalai");

        th1.start();
        th2.start();
        th3.start();
    }
}

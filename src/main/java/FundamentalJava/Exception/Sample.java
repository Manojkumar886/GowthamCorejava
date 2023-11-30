package FundamentalJava.Exception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Sample
{
    public static void main(String[] args)  throws  NullPointerException,ArithmeticException,IOException,InterruptedException
    {
//        compiletimeException
        Runtime run=Runtime.getRuntime();
        Process pro;
        try {
            pro=run.exec("calc");
            try
            {
                Thread.sleep(10000);
            }
            catch (InterruptedException ie)
            {
                System.out.println(ie);
            }
            pro=run.exec("notepad");
        }
        catch (IOException ioe)
        {
            System.out.println(ioe);
        }


//        runtime Exception
//        try
//        {
//            int [] numbers={34,56,786,776,55654,345};
//            System.out.println(numbers[9]);
//        }
//        catch (ArrayIndexOutOfBoundsException aioe)
//        {
//            System.out.println(aioe);
//            System.out.println("your length is six only");
//            Scanner scan=new Scanner(System.in);
//            int [] numbers={34,56,786,776,55654,345};
//            System.out.println(" enter any position below 6");
//            int pos=scan.nextInt();
//            System.out.println(numbers[pos]);
//        }

//           try
//           {
//               Scanner scan=new Scanner(System.in);
//               System.out.println("What is your fav no");
//               int number=scan.nextInt();
//               System.out.println(number);
//           }
//           catch(InputMismatchException ime)
//           {
//               System.out.println(ime);
//           }

//        try
//        {
//            String name=null;
//            System.out.println(name.length());
//        }
//        catch (NullPointerException npe)
//        {
//            System.out.println(npe);
//        }


//        try
//        {
//            int a=100/10;
//            System.out.println(a);
//        }
//        catch (ArithmeticException ar)
//        {
//            System.out.println(ar);
//        }
//        finally
//        {
//            System.out.println("End of the process");
//        }
    }
}

package FundamentalJava.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Maxminusage
{
   static Scanner scan=new Scanner(System.in);
//    public static void infinite()  ///static method doesnt need object
//    {
//        try
//        {
//            System.out.println("Enter a value");
//            int a=scan.nextInt();
//            System.out.println("Enter b value");
//            int b=scan.nextInt();
//            System.out.println(a/b);
//        }
//        catch (ArithmeticException ae)
//        {
//            System.out.println(ae);
//            System.out.println(" your b value is Zero ..  a/ anything value is not zero");
//            infinite();//recursion
//        }
//        catch(InputMismatchException ime)
//        {
//            System.out.println(ime);
//            System.out.println(" only enter numbers cannot pass alphabets");
//            System.out.println("Enter a value");
//            int a=scan.nextInt();
//            System.out.println("Enter b value");
//            int b=scan.nextInt();
//            System.out.println(a/b);
//        }
//
//    }


    public static  void finite(int loop)
    {
        try
        {
            String content="I am manojkumar from namakkal.";
            System.out.println(" starting index value :");
            int start_index=scan.nextInt();
            System.out.println(" end of the index value :");
            int end_index=scan.nextInt();

            System.out.println(content.substring(start_index,end_index));

        }
        catch (StringIndexOutOfBoundsException sibe)
        {
            System.out.println(sibe);

            if(loop>=1)
            {
                System.out.println("attemt chance :"+loop);
                loop--;
                finite(loop);
            }
            else
            {
                System.out.println("Maximum attempts is over....!");
            }
        }
    }
    public static void main(String[] args)
    {
    //infinite( )

        System.out.println(" how many times substring exception will work :");
        int limit= scan.nextInt();
        finite(limit);

    }
}

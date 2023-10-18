package FundamentalJava.Conditionalstatement;

import java.util.Scanner;

public class IfStatement
{
    public static void main(String[] args)
    {
//        if(condition){    statement    }
//        if(condition){ statement }else{ statement}

        Scanner scan=new Scanner(System.in);

//        System.out.println(" Enter your age");
//         int age= scan.nextInt();
//
//         if(age>=18)
//         {
//             System.out.println(" your age is eligible for vote");
//         }
//         else
//         {
//             System.out.println(" you age is not eligible for vote");
//         }

        System.out.println(" tell us your tamil mark");

        int tamilmark=scan.nextInt();

        System.out.println(" enter your english mark");
        int englishmark=scan.nextInt();

        System.out.println(" My Tamil mark is "+tamilmark);
        System.out.println(" my englishmark is "+englishmark);

        if(tamilmark>=englishmark) //98>=78
        {
            System.out.println(" my biggest mark is tamil "+tamilmark);
        }
        else
        {
            System.out.println(" my biggest mark is english"+englishmark);
        }
    }
}

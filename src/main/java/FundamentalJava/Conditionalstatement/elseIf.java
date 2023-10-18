package FundamentalJava.Conditionalstatement;

import java.util.Scanner;

public class elseIf
{
//    if(condtion)
//    {
//        //statement
//    }
//    else if(condition)
//    {
//
//    }
//    else if(condition)
//    {
//
//    }
//    else
//    {
//
//    }
//



    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println(" Enter you 12th Mark");
        int mark_12th=scan.nextInt();
        if(mark_12th>=1100)
        {
            System.out.println(" you are choose Any Department");
        }
       else if( (mark_12th>=1000)&&(mark_12th<=1100))
        {
            System.out.println(" you are choose Engineering or ARTS");
        }
       else if ((mark_12th>=800) &&(mark_12th<=999))
        {
            System.out.println(" you are choose Arts Department Category only");
        }
        else
       {
           System.out.println(" your are not eligible for Degree Departments");
        }
    }
}

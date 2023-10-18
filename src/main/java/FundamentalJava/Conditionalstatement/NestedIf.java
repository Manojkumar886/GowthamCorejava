package FundamentalJava.Conditionalstatement;

import java.util.Scanner;

public class NestedIf
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println(" Enter your 12th mark");
        int Mark_12th=scan.nextInt();
        System.out.println(" enter your biology mark");
        int biologymark=scan.nextInt();

        if(Mark_12th>=1100)//outer if block
        {
            System.out.println(" you are choose any department (medical,engineering,arts");
            if(biologymark>=185)  //inner if block
            {
                System.out.println(" your are selected medical counselling");
            }
            else {
                System.out.println(" you are selected only JEE");
            }
        }
        else
        {
            System.out.println(" you not eligible for medical");
        }
    }
}

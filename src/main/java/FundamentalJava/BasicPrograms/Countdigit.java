package FundamentalJava.BasicPrograms;

import java.util.Scanner;

public class Countdigit
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println(" enter your number");
        int my_number=scan.nextInt();

        int count=0;
        while ((my_number!=0))
        {
            my_number=my_number/10;
            count++;
        }
        System.out.println("\ndigit count :"+count);

    }
}

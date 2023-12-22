package FundamentalJava.BasicPrograms;

import java.util.Scanner;

public class Fibonacci
{
    public static void main(String [] args)
    {
//        0 1 1 2 3 5 8 13 21 34 55 89
        int first_num=0;
        int second_num=1;
        System.out.println(first_num+""+second_num);
        Scanner scan=new Scanner(System.in);
        System.out.println(" how many numbers of fibonacci series you want ?");
        int count=scan.nextInt();

        for(int index=2;index<=count;index++)
        {
            int third_num=first_num+second_num;
            System.out.println(" "+third_num);
            first_num=second_num;
            second_num=third_num;
        }
    }
}

package FundamentalJava.Conditionalstatement;

import java.util.Scanner;

public class SwitchStatement
{
//    switch(expresssion)
//    {
//        case value1:
//            statement;
//            break;
//        case value2:
//            statement;
//            break;
//        case value3:
//            statement;
//            break;
//        default: statement;
//    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

        System.out.println(" enter your favoriate no within 1 digit");
        int favno=scan.nextInt();

        switch (favno)
        {
            case 1:
                System.out.println(" my favoriate number is ONE");
                break;
            case 5:
                System.out.println(" my favoriate number is FIVE");
                break;
            case 8:
                System.out.println("my favoriate number is EIGHT");
                break;
            case 6:
                System.out.println(" my favoriate number is SIX");
                break;
            default:
                System.out.println(" unwanted numbers are 2,3,4,7,9,0");
        }
    }
}

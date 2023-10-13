package FundamentalJava.Operator;

import java.util.Scanner;

public class ArithemeticOperator
{
    public static void main(String[] args)
    {
//         + , - , * , / , %   arithemeticOperator

        int Highest_Cibil_score=1000;
        int Lowest_Cibil_Score=0;
        int maintained_Cibil_Score=600;
        String CardType="Bajaj";

        System.out.println("Addition :"+Highest_Cibil_score+Lowest_Cibil_Score); //1000+0=1000
        System.out.println("Multification :"+maintained_Cibil_Score*Highest_Cibil_score);//600*1000=600000

        Scanner scan=new Scanner(System.in);
        System.out.println(" Enter your Favoriate Value");
        int n=scan.nextInt();

        System.out.println(" Positive or negative :"+(n%2==0));




    }
}

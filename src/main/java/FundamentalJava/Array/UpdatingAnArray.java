package FundamentalJava.Array;

import java.util.Scanner;

public class UpdatingAnArray
{
    public static void main(String[] args)
    {
        char  alpha []=new char[10];
        alpha[0]='A';
        alpha[1]='B';
        alpha[2]='C';
        alpha[3]='D';
        alpha[4]='E';
        alpha[5]='F';
        alpha[6]='G';
        alpha[7]='H';
        alpha[8]='I';
        alpha[9]='J';

        System.out.println(" BEFORE UPDATEING VALUES");
        for(int i=0;i<alpha.length;i++)
        {
            System.out.print(alpha[i]);
        }
//        int pos=3;
//        char newval='K'
//        alpha[pos]=newvalue;
        Scanner scan=new Scanner(System.in);
        System.out.println(" which position of value you want update");
        int pos=scan.nextInt();
        System.out.println("you are choose @ at "+pos+" index of value update\n enter your new values");
        char newvalue=scan.next().charAt(0);
        alpha[pos]=newvalue; //alpha[5]='P'
        System.out.println(" AFTER UPDATING VALUES");
        for(char alpha1:alpha)
        {
            System.out.print(alpha1);
        }
    }

}

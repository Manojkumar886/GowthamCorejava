package FundamentalJava.Looping;

import java.util.Scanner;

public class latecomercount
{
    public static void main(String[] args)
    {
        int staffcount=10;
        int latecomercount=0;
        do
        {
            Scanner scan=new Scanner(System.in);
            System.out.println(" please tellus your entry time -staffregno"+staffcount);
            float time=scan.nextFloat();
            if(9.15<=time)
            {
                System.out.println(" you are late comer ,so your salary is deducted 10%");
                latecomercount++;
            }
            else
            {
                System.out.println(" Quick Comer....! good luck keep it your time");
            }
            staffcount--;
        }
        while (staffcount>=1);

        System.out.println(" Today Late comer staff count is "+latecomercount);
    }
}

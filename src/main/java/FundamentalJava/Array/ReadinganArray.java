package FundamentalJava.Array;

import java.util.Scanner;

public class ReadinganArray
{
    public static void main(String[] args)
    {
        String Flowernames []={"Sunflower","Mariglod","Lily","Lotus","Rose","Jasmine","Hibiscus"};

        Scanner scan =new Scanner(System.in);

        int count =1;
        do
        {
            System.out.println(count+" time of reading execution");
            System.out.println(" which position of value you want to reading :");
            int pos=scan.nextInt();

            System.out.println(" you are choose @"+pos+" position ");
            System.out.println(pos+" index of value is  "+Flowernames[pos]);
            count++;
        }
        while(count<=3);
    }
}

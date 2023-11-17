package FundamentalJava.Array;

import java.util.Scanner;

public class SearchingAnArray
{
    public static void main(String[] args)
    {

        String Flowernames []={"Sunflower","Mariglod","Lily","Lotus","Rose","Jasmine","Hibiscus"};

        Scanner scan=new Scanner(System.in);
        System.out.println(" Please Tell us what is your favoriate flower");
        String favflower=scan.next();


        for(int i=0;i< Flowernames.length;i++)
        {
            if(Flowernames[i].equalsIgnoreCase(favflower))
            {
                System.out.println(" founded at@" + i);
                return;
            }
        }
        System.out.println(favflower+"not founded");
    }
}

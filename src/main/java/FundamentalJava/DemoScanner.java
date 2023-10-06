package FundamentalJava;

import java.util.Scanner;

public class DemoScanner
{
    public static void main(String[] args)
    {
//        classname objectname=new classname();
//        objectname.methodname();
//        Scanner scan=new Scanner(System.in);
//        System.out.println(" enter Your Name");
//        String username=scan.nextLine();
//        System.out.println(" enter Your age");
//        int age=scan.nextInt();
//        System.out.println(" enter your aadhar card no");
//        long Aadharcardno=scan.nextLong();
//        System.out.println(" enter your weight (kg)");
//        float Weight=scan.nextFloat();
//        System.out.println(" My name is :"+username);
//        System.out.println(" My age is :"+age);
//        System.out.println(" My aadhar card no is :"+Aadharcardno+"\n My weight is :"+Weight);


//        different between next and nextline

        Scanner run=new Scanner(System.in);

        System.out.println(" Enter your name with lastname");

        String fullname=run.nextLine();

        System.out.println(" Enter your age ");

        int age =run.nextInt();

        System.out.println(" Enter your Father Name");

        String fathername=run.next();


        System.out.println(" enter your class section");

        char section=run.next().charAt(0);

        System.out.println(" my full name is "+fullname);
        System.out.println(" my father full name is "+fathername);
        System.out.println(" my age is "+age);
        System.out.println(" my class section is "+section);
    }
}

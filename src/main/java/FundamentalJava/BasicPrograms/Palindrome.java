package FundamentalJava.BasicPrograms;

public class Palindrome
{
    public static void main(String[] args)
    {
        int number=154751;

        int reverse=0;

        int temp=number;

        while(number!=0)
        {
            int sum=number%10;
            reverse=(reverse*10)+sum;
            number=number/10;
        }

        if(temp==reverse)
        {
            System.out.println(" this is palindrome");
        }
        else
        {
            System.out.println(" not palindrome");
        }
    }
}

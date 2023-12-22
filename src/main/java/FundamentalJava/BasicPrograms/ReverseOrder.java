package FundamentalJava.BasicPrograms;

public class ReverseOrder
{
    public static void main(String[] args)
    {
        int my_number=892776;
        int reverse=0;
        while (my_number!=0)
        {
            int solve=my_number%10;
            reverse=reverse*10+solve;
            my_number=my_number/10;
        }
        System.out.println("my reverse order is :"+reverse);
    }
}

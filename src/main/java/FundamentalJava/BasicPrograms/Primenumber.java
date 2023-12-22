package FundamentalJava.BasicPrograms;

public class Primenumber
{
    public static void main(String[] args)
    {
        int m=0,flag=0;
        int n=66;

        m=n/2;
        if(n==0 || n==1)
        {
            System.out.println(n+" is nuber is not prime number");
        }
        else
        {
            for(int i=2;i<=m;i++)
            {
                if(n%2==0)
                {
                    System.out.println(n+" not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println("its prime number ");
            }
        }
    }

}

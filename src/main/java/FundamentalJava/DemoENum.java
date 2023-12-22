package FundamentalJava;

public class DemoENum
{
    public enum colors { red, blue,orange,pink,green,black,white}

    public static void main(String[] args)
    {
        colors c1=colors.blue;
        switch (c1)
        {
            case blue -> System.out.println(" my favoriate is blue");
            case pink -> System.out.println(" my sister favoriate color is pink");
            default -> System.out.println(" who ");
        }
    }
}

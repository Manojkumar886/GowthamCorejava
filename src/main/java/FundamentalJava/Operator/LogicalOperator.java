package FundamentalJava.Operator;

public class LogicalOperator
{
    public static void main(String[] args)
    {
//        AND -&& OR-|| NOT-!

        String Colorname="red";
        String bootstrapcolor="danger";
        String colorname1="red";
        int encounter=10;
        int counter=10;
        int decounter=5;

        System.out.println((colorname1==Colorname)&&(encounter==counter));//T&&T=T
        System.out.println((decounter>=encounter)||(bootstrapcolor==colorname1));
//                                5>=10   ||   danger==red  ==  F || F   = F

        System.out.println(!(encounter==decounter)); //10==5  =f  =T
    }
}

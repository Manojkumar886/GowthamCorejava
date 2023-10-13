package FundamentalJava.Operator;

public class AssignmentOperator
{
    public static void main(String[] args)
    {
//        += ,-= ,*= , /=  Assignment Operator
        int tamil_mark=96;
        int English_Mark=76;
        int maths_mark=98;
        int Science_Mark=98;
        int Social_mark=96;

        English_Mark+=20;

        System.out.println(" My english Mark is :"+English_Mark);

        maths_mark-=8;
        System.out.println("my Maths Mark is :"+maths_mark);

        System.out.println(" tamil+emglis+maths+science+social"+(tamil_mark+English_Mark+maths_mark+Science_Mark+Social_mark));

    }
}

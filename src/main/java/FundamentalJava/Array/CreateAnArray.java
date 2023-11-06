package FundamentalJava.Array;
import java.util.Arrays;
public class CreateAnArray
{
    public static void main(String[] args)
    {
        String Programminlanguages [] ={ "Java" ,"Python " ,"C#", " PHP" ," c"};
        int a=10;
        System.out.println(" my a value is :"+a);
//        System.out.println(" My list of programming skills:"+ Arrays.toString(Programminlanguages));
//        for(int index=0;index<Programminlanguages.length;index++)
//        {
////            0<5=true,1<5=true,2<5=true,3<5=true,4<5=true,5<5=false
//            System.out.println(Programminlanguages[index]);
////            Programminlangages[1],ProgrammingLangauges[1]
//        }
//        For -each Loop
        for(String Languages : Programminlanguages)
        {
            System.out.println(Languages);
        }
    }
}

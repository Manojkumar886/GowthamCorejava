package FundamentalJava.Array;

import java.util.Arrays;

public class InsertingAnArray
{
    public static void main(String[] args)
    {

        int ASCINO [] =new int [5];

//        ASCINO[0] =10;
//        ASCINO[1]=20;
//        ASCINO[2]=30;
//        ASCINO[3]=40;
//        ASCINO[4]=50;
//        ASCINO[5]=60; its not support.error in ArrayIndexOutofboundExceptiom
        int count=10;
        for(int pos=0;pos<ASCINO.length;pos++)
        {
            ASCINO[pos]=count;//Ascino[0]=10;,ascino[1]=110,ascino[2]=210,ascino[3]=310,ascino[4]=410,
            count+=100; //increment by 100
        }
//        System.out.println("Ascino:"+ Arrays.toString(ASCINO));

        for(int newvar : ASCINO)
        {
            System.out.println(newvar);
        }
    }
}

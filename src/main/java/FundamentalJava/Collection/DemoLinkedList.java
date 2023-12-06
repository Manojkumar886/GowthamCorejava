package FundamentalJava.Collection;

import java.util.LinkedList;

public class DemoLinkedList
{
    public static void main(String[] args)
    {
        LinkedList<Integer> mynumbers=new LinkedList<Integer>() ; //object creation -non generic

        mynumbers.add(90);
        mynumbers.add(80);
        mynumbers.add(70);
        mynumbers.add(10);
        mynumbers.addLast(99);
        mynumbers.addFirst(1);
        mynumbers.add(90);
        mynumbers.add(4,45);

        mynumbers.removeFirst();  // 1 value is deeleted
        mynumbers.removeLast();  //90 value is deleted

        System.out.println(mynumbers);

        System.out.println(mynumbers.get(5));
        System.out.println(mynumbers.size());  //total of object value
        mynumbers.set(0,11);  //0index of value is 90 -changed to11
        mynumbers.set(2, (7+89+1) );
        mynumbers.clear();///deleted all values
        System.out.println(mynumbers);


    }
}

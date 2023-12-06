package FundamentalJava.Collection;

import java.util.Stack;

public class DemoStack
{
    public static void main(String[] args)
    {
//        first in last out   -start @ 1
        Stack student_details =new Stack();  //generic

        student_details.push("Manojkumar");
        student_details.push("Namakkal");
        student_details.push(24);
        student_details.push(97896767677l);
        student_details.push(56.66);
        student_details.push('M');

        student_details.pop();// delete only last element
        System.out.println(student_details.empty());// false
        System.out.println(student_details);
        System.out.println(student_details.peek()); //top of the element
        System.out.println(student_details.search("Namakkal"));
    }
}

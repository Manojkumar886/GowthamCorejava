package FundamentalJava;

public class Cloneing
{
    public static void main(String[] args) throws  CloneNotSupportedException
    {
        Department d1=new Department("BCA",1001);

        Student s1=new Student("Manojkumar",101,d1);

        Student s2=(Student) s1.clone();

    }
}

class Department
{
    String deptname;
    int deptid;
    Department (String deptname,int deptid)
    {
        this.deptid=deptid;
        this.deptname=deptname;
    }
}

 class Student implements  Cloneable
 {
      String studname;
      int studid;
      Department dept;

      public  Student(String studname,int studid,Department dept)
      {
          this.studname=studname;
          this.studid=studid;
          this.dept=dept;
      }

     @Override
     protected Object clone() throws CloneNotSupportedException
     {
         return super.clone();
     }
 }
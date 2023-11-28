package FundamentalJava.Encapsulation;

public class gettersetter
{
  private int age;
  private String name;

  public void setAge(int age)
  {
      this.age=age;
  }

  public void setName(String myfirstname)   //obj.setName("Manoj");
  {
      name=myfirstname;
  }

  public int getAge()
  {
      return age;
  }

  public String getName()
  {
      return name;
  }


}

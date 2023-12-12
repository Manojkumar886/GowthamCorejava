package FundamentalJava.ConsoleApp;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class CustomerDetailsActivation  implements  CustomerDetailsInter,Runnable
{

    File file=new File("D:\\CustomerDetails.doc");

    static Scanner scan=new Scanner(System.in);

    LinkedList<CustomerDetails> customer=new LinkedList<CustomerDetails>();

    public CustomerDetailsActivation()
    {
        customer=new LinkedList<CustomerDetails>();
    }

    public void Affect() throws IOException
    {
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(customer);
        oos.close();
        fos.close();
    }

    public void FETCH() throws  IOException,ClassNotFoundException
    {
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);
        customer=(LinkedList<CustomerDetails>)  ois.readObject();
        ois.close();
        fis.close();
    }
    @Override
    public String CreateCustomer(CustomerDetails customer1)
    {
        try {
            FETCH();
            customer.add(customer1);
            Affect();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return  "";
    }

    @Override
    public void ListallCustomers()
    {

    }

    @Override
    public void DeleteCustomer(int cusid)
    {

    }

    @Override
    public void Sort()
    {

    }

    @Override
    synchronized public void run()
    {
        System.out.println(" now worker name is :"+Thread.currentThread().getName());
        CustomerDetailsActivation activate=new CustomerDetailsActivation();
        do
        {
            System.out.println(" Please select any one option ?");
            System.out.println(" customer details are \n 1.ADD \n 2.LIST \n 3.SORT \n 4.DELETE \n 5.EXIT ");
            int purpose=scan.nextInt();
            switch (purpose)
            {
                case 1:
                    System.out.println(" please enter your values : Customer ID,cus_name,cus_Place,cus_Accno,cus_Aadharno,cus_Mobileno");
                    CustomerDetails customer1=new CustomerDetails(scan.nextInt(),scan.next(),scan.next(),scan.nextLong(), scan.nextLong(), scan.nextLong());
                    System.out.println( activate.CreateCustomer(customer1));
                    break;
                case 2:
                    System.out.println(" List all values :");
                    activate.ListallCustomers();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    return;
                default:
                    return;
            }
        }
        while (true);

    }
    static
    {
        System.out.println("---WELCOME TO ZEALOUS TECH CORP PVT LTD(SALEM)---------");
    }
}

package FundamentalJava;

import java.util.Arrays;

public class BInaryTREEME
{
    public static void main(String[] args)
    {
        btreemethods tree=new btreemethods();
        tree.setroot("Manojkumar");
        tree.setleft("Haritha",0);
        tree.setRight("Pavithra",0);
        tree.setleft("Mano",1);
        tree.setRight("Kavi",1);
        tree.setRight("Geetha",2);

        tree.iterate();
        tree.preorder(0);
        System.out.println();

    }
}


class btreemethods
{
    private String [] arr;

    public btreemethods(){
        arr=new String[10];
    }
    public btreemethods(int size)
    {
        arr=new String[size];
    }

    public void setroot(String data)
    {
        arr[0]=data;
    }

    public void setleft(String data,int root)
    {
        if(arr[root]==null)
        {
            return;
        }
        else {
            int temp=root*2+1;
            arr[temp]=data;
        }
    }
    public void setRight(String data,int root)
    {
        if(arr[root]==null)
            return;
        else {
            int temp = root * 2 + 2;
            arr[temp] = data;
        }
    }

    public void iterate()
    {
        System.out.println(Arrays.toString(arr));
    }


    public void preorder(int root)
    {
        if(arr[root]==null || root>arr.length )
        return;
        else {
            System.out.print(arr[root]+"_");
            preorder(root*2+1);
            preorder(root*2+2);
        }
    }
}
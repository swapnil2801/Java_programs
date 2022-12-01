import java.io.*;

class Data
{
    public int Arr[];
    public Data(int iSize)
    {
        Arr = new int[iSize];
    }
    public void Accept()
    {
        try
        {
            int iCnt = 0;
            InputStreamReader iobj = new InputStreamReader(System.in);
            BufferedReader bobj = new BufferedReader(iobj);

            for(iCnt = 0;iCnt < Arr.length;iCnt++)
            {
                Arr[iCnt] = Integer.parseInt(bobj.readLine());
            }
        }
        catch(Exception obj)
        {}
    }
}

class Even extends Thread
{
    public Data dobj;
    public Even(Data obj)
    {
        dobj = obj;
    }
    public void run()
    {
        int i = 0;
        for(i = 0;i < dobj.Arr.length;i++)
        {
            if(dobj.Arr[i]%2 == 0)
            {
            System.out.println("Even number is : "+dobj.Arr[i]);
            }
        }
    }
}
class Odd extends Thread
{
    public Data dobj;
    public Odd(Data obj)
    {
        dobj = obj;
    }
    public void run()
    {
        int i = 0;
        for(i = 0;i < dobj.Arr.length;i++)
        {
            if(dobj.Arr[i]%2 != 0)
            {
            System.out.println("Odd number is : "+dobj.Arr[i]);
            }
        }
    }
}

class Thread3
{
    public static void main(String A[]) throws Exception
    {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);

        System.out.println("Enter the size of array : ");
        int iNo = Integer.parseInt(bobj.readLine());

        Data obj1 = new Data(iNo);
        System.out.println("Enter the elements of array : ");

        obj1.Accept();

        Even eobj = new Even(obj1);
        Odd oobj = new Odd(obj1);

        Thread t1 = new Thread(eobj);
        Thread t2 = new Thread(oobj);

        t1.start();
        t2.start();
    }
}
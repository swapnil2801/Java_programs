// Write the java program which create jagged array.Number of rows and size of each row should be accepted from user.

import java.util.*; 

class ArrayCrt
{
    public int Arr[][];
    public int iNo;
    public ArrayCrt(int a)
    {
        this.iNo = a;
        this.Arr = new int[iNo][];;
    }
    public void Accept()
    {
        int i = 0;
        int iRow = 0;
        Scanner sobj = new Scanner(System.in);
        for (i = 0;i < iNo;i++)
        {
            System.out.println("Enter the size of "+i+" row :");
            iRow = sobj.nextInt();
            Arr[i] = new int[iRow];
            System.out.println("Enter the elements:");
            try 
            {
                for(int j = 0;j < iRow;j++)
                {
                    Arr[i][j] = sobj.nextInt();
                }
            }
            catch(Exception obj)
            {}
        }
    }

    public void Display()
    {
        int i = 0;
        System.out.println("The element of array are :");
        for(i = 0;i < iNo;i++)
        {
            for(int j = 0;j < Arr[i].length;j++)
            {
                System.out.print(Arr[i][j]+"  ");
            }
            System.out.print("\n");
        }
    }
}

class JaggedArray
{
    public static void main(String A[])
    {
        int iSize = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of rows of array :");
        iSize = sobj.nextInt();

        ArrayCrt aobj = new ArrayCrt(iSize);
        aobj.Accept();
        aobj.Display();
    }
}
// Write a a java program which accept N number from user and store it into
//  Array and display  the largest number from that array.

import java.util.*;

class FindMax
{
    public int Arr[];
    public int iNo;

    public FindMax(int a)
    {
        this.iNo = a;
        this.Arr = new int[iNo];
    }
    public void Accept()
    {
        int i = 0;
        System.out.println("Enter the elements :");
        Scanner sobj = new Scanner(System.in);
        for(i = 0;i < iNo;i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }
    public int MaxNum()
    {
        int i = 0;
        int iMax = 0;
        for(i = 0;i < iNo;i++)
        {
            if(iMax < Arr[i])
            {
                iMax = Arr[i];
            }
        }
        return iMax;
    }
}

class MaxNumFromArray
{
    public static void main(String A[])
    {
        int iSize = 0;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        iSize = sobj.nextInt();

        FindMax fobj = new FindMax(iSize);

        fobj.Accept();
        iRet = fobj.MaxNum();

        System.out.println("The Maximum number from array is : "+iRet);
    }
}
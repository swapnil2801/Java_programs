// Write a a java program which accept N number from user and store it into
//  Array and display  the largest number from that array.

import java.util.*;

class FindAvg
{
    public int Arr[];
    public int iNo;

    public FindAvg(int a)
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
    public int AvgNum()
    {
        int i = 0;
        int iSum = 0;
        for(i = 0;i < iNo;i++)
        {
            iSum = iSum + Arr[i];
        }
        return (iSum/iNo);
    }
}

class AvgFromArray
{
    public static void main(String A[])
    {
        int iSize = 0;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        iSize = sobj.nextInt();

        FindAvg fobj = new FindAvg(iSize);

        fobj.Accept();
        iRet = fobj.AvgNum();

        System.out.println("The average from array is : "+iRet);
    }
}
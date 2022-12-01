// Program to print 5 to 1 numbers on screen.

import java.util.Scanner;

class DisplayXX
{
    public int iNo;
    public DisplayXX(int x)
    {
        iNo = x;
    }
    public void Print()
    {
        int iCnt = 0;
        for (iCnt = iNo;iCnt >= 1;iCnt--)
        {
            System.out.println(iCnt);
        }
    }
}

class ReverseDisplay
{
    public static void main(String argv[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number:");
        iValue = sobj.nextInt();

        DisplayXX obj = new DisplayXX(iValue);

        System.out.println("The Number in Reverse are:");
        obj.Print();

    }
}
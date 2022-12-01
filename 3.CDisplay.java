// Program to print user times "Marvellous" on screen.

import java.util.Scanner;

class DisplayX
{
    public int iNo;
    public DisplayX(int x)
    {
        iNo = x;
    }
    public void Print()
    {
        int iCnt = 0;
        for (iCnt = 1;iCnt <= iNo;iCnt++)
        {
            System.out.println("Marvellous");
        }
    }
}

class CDisplay
{
    public static void main(String argv[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number:");
        iValue = sobj.nextInt();

        DisplayX obj = new DisplayX(iValue);

        obj.Print();

    }
}
import java.util.Scanner;

// Accept two number from user and display first number in second number of times:

class NTimesPrint
{
    public int iValue;
    public NTimesPrint(int x)
    {
        iValue = x;
    }
    public void DisN()
    {
        System.out.println("____________________________________________");
        int iCnt = 0;
        for (iCnt=1 ; iCnt<=iValue ; iCnt++)
        {
            System.out.println(iValue);
        }
    }
}

class PrintNTimes
{
    public static void main(String argv[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        System.out.println("Enter any number :");
        iNo = sobj.nextInt();

        NTimesPrint obj = new NTimesPrint(iNo);
        obj.DisN();
       
    }
}
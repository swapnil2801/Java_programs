import java.util.Scanner;
// Accept one number and check whether is divided by 5 or not.

class ChkDivBy5
{
    public int iValue;

    public ChkDivBy5(int X)
    {
        iValue = X;
    }
    boolean ChkFunction()
    {
        if(iValue%5 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
class DivBy5
{
    public static void main(String argv[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        boolean iRet = false;
        System.out.println("Enter any number:");
        iNo = sobj.nextInt();

        ChkDivBy5 obj = new ChkDivBy5(iNo);

        iRet = obj.ChkFunction();

        if(iRet == true)
        {
            System.out.println("The Given number is divisible by 5.");
        }
        else
        {
            System.out.println("The Given number is not divisible by 5.");
        }

    }
}
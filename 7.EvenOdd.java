import java.util.Scanner;
// Accept number from user and checked whether number is even or odd:

class ChkOddEven
{
    public int iNo;
    public ChkOddEven(int x)
    {
        iNo = x;
    }
    public boolean Hello()
    {
        if(iNo % 2 == 0)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
}

class EvenOdd
{
    public static void main(String argv[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        boolean iRet = false;
        System.out.println("Enter any number:");
        iValue = sobj.nextInt();

        ChkOddEven obj = new ChkOddEven(iValue);

        iRet = obj.Hello();

        if(iRet == true)
        {
            System.out.println("Even number.");
        }
        else
        {
            System.out.println("Odd number.");
        }

    }
}
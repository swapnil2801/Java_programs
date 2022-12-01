import java.util.Scanner;
// Write a program which accept one number from user and print that number of even numbers on screen:

class EvenPrint
{
    public int iNo;
    public EvenPrint(int x)
    {
        iNo = x;
    }
    public void PrintX()
    {
        int iCnt = 0;
        for (iCnt = 1 ; iCnt<=iNo*2 ; iCnt++)
        {
            if(iCnt%2 == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
    
}

class PrintEven
{
    public static void main(String argv[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        System.out.println("Enter any number :");
        iValue = sobj.nextInt();

        EvenPrint obj = new EvenPrint(iValue);

        obj.PrintX();

        
    }
}
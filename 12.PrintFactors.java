import java.util.Scanner;

// Write a program which accept one number from user and print factors number of that number:

class PrintFact
{
    public int iValue;
    public PrintFact(int x)
    {
        iValue = x;
    }
    public void Facto()
    {
        int iCnt = 0;
        for (iCnt=1;iCnt<=(iValue/2);iCnt++)
        {
            if (iValue%iCnt == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class PrintFactors
{
    public static void main(String argv[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        System.out.println("Enter number:");
        iNo = sobj.nextInt();

        PrintFact obj = new PrintFact(iNo);
        obj.Facto();

    }
}
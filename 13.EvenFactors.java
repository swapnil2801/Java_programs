import java.util.Scanner;

// Write a program which accept one number from user and print even factors of that number:

class EvenFacto
{
    public int iValue;
    public EvenFacto(int x)
    {
        iValue = x;
    }
    public void Facto()
    {
        int iCnt = 0;
        for (iCnt=2;iCnt<=(iValue/2)s;iCnt = iCnt+2)
        {
            if (iValue%iCnt == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class EvenFactors
{
    public static void main(String argv[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        System.out.println("Enter number:");
        iNo = sobj.nextInt();

        EvenFacto obj = new EvenFacto(iNo);
        obj.Facto();

    }
}
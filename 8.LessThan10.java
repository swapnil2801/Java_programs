import java.util.Scanner;
// Accept one number if it is less than 10 then print"Hello" otherwise print"Demo".

class LessThan10X
{
    public int iValue;

    public LessThan10X(int X)
    {
        iValue = X;
    }
    void StarPrint()
    {
        int iCnt = 1;
        while (iCnt<=iValue )
        {
            System.out.print("*\t");
            iCnt++;
        }
    }
}
class LessThan10
{
    public static void main(String argv[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        System.out.println("Enter any number:");
        iNo = sobj.nextInt();

        LessThan10X obj = new LessThan10X(iNo);

        obj.StarPrint();


    }
}
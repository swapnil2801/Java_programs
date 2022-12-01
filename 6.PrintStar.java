import java.util.Scanner;
// Accept one number and check whether is divided by 5 or not.

class DispalyXXX
{
    public int iValue;

    public DispalyXXX(int X)
    {
        iValue = X;
    }
    void StarPrint()
    {
        int iCnt = 0;
        for (iCnt=1 ; iCnt<=iValue ; iCnt++)
        {
            System.out.print("*\t");
        }
    }
}
class PrintStar
{
    public static void main(String argv[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        System.out.println("Enter any number:");
        iNo = sobj.nextInt();

        DispalyXXX obj = new DispalyXXX(iNo);

        obj.StarPrint();


    }
}
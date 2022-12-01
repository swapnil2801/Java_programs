import java.util.Scanner;
// Accept one number and check whether is divided by 5 or not.

class DispalyXY
{
    public int iValue;

    public DispalyXY(int X)
    {
        iValue = X;
    }
    boolean ChkCondition()
    {
        if(iValue<=10)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
class WhileLoop
{
    public static void main(String argv[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        boolean iRet = false;
        System.out.println("Enter any number:");
        iNo = sobj.nextInt();

        DispalyXY obj = new DispalyXY(iNo);

        iRet = obj.ChkCondition();

        if(iRet == true)
        {
            System.out.println("Hello");
        }
        else 
        {
            System.out.println("Demo");
        }

    }
}
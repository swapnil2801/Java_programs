// Program to divide two numbers

import java.util.Scanner;

class DivideTwoNumbers
{
    public float iNo1;
    public float iNo2;

    public DivideTwoNumbers(float x,float y)
    {
        iNo1 = x;
        iNo2 = y;
    }
    public float DivideFunction()
    {
        float iAns = iNo1/iNo2;
        return iAns ;
    }

}
class Divide
{
    public static void main(String argv[])
    {
        int iValue1 = 0;
        int iValue2 = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        iValue1 = sobj.nextInt();
        iValue2 = sobj.nextInt();

        DivideTwoNumbers obj = new DivideTwoNumbers(iValue1,iValue2);
        float iRet = obj.DivideFunction();

        System.out.println("The Division of two numbers is :"+iRet);

    }
}
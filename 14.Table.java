import java.util.Scanner;

// Write the programe to print table of  number which is given by user
class PrintTable
{
    public int iNo;
    public PrintTable(int x)
    {
        iNo = x;
    }
    public void TableX()
    {
        int iCnt = 0;
        for (iCnt = 1;iCnt <= 10;iCnt++)
        {
            System.out.println(iNo*iCnt);
        }
    }
}
class Table
{
    public static void main(String argv[])
    {   Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        System.out.println("Enter the number:");
        iValue = sobj.nextInt();
        System.out.println("_________________________________________");
        PrintTable obj = new PrintTable(iValue);
        obj.TableX();
    }
}
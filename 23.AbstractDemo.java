// abstract class is a class which contains 0 or more abstract method in it
// Abtrsct class achieve 0 to 100% abtraction.

abstract class Arithmatic
{
    public int Addition(int No1,int No2)
    {
        return No1 + No2;
    }
    public abstract int Subtraction(int No1,int No2);
    // virtual int subtraction(int No1,int No2);
}
class Marvellous extends Arithmatic
{
    public int Subtraction(int No1,int No2)
    {
        return No1-No2;
    }
}

class AbstractDemo
{
    public static void main(String Arr[])
    {
        // Arithmatic aobj = new Arithmatic();  // NA
        Arithmatic mobj = new Marvellous();     // Allowed   // reference is allowed
        Marvellous mobj = new Marvellous();
        int iRet = 0;
        iRet = mobj.Addition(11,10);
        System.out.println("Addition is :"+iRet);

        iRet = mobj.Subtraction(11,10);
        System.out.println("Subtraction is :"+iRet);
        
    }
}
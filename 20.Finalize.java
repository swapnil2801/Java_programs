class Demo 
{
    public int iSize;
    public int Arr[];

    public Demo(int iNo)
    {
        System.out.println("Inside demo Constructor .");
        iSize = iNo;
        Arr = new int[iSize];
    }
    protected void finalize()
    {
        System.out.println("Inside demo finalize .");
        Arr = null;
    }
}
class Finalize
{
    public static void main(String A[])
    {
        Demo obj = new Demo(12);

        obj = null;

        System.gc();


    }
}
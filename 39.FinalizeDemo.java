
class Demo
{
    int Size;
    int Arr[];

    public Demo(int No)
    {
        System.out.println("Inside Constructor");

        Size = No;
        Arr = new int[Size];
    }

    protected void finalize()
    {
        System.out.println("Inside finalise method");
        Arr = null;
    }
}

class FinalizeDemo
{
    public static void main(String A[])
    {
        Demo obj = new Demo(4);
        obj = null;

        System.gc();        // Explicitely call to garbage collector

    }
}
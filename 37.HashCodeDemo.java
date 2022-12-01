class Demo
{
    public int iNo1;
    public int iNo2;

    public Demo(int a, int b)
    {
        iNo1 = a;
        iNo2 = b;
    }
}

class HashCodeDemo
{
    public static void main(String A[])
    {
        Demo obj = new Demo(11,12);

        System.out.println("HashCode of obj is :"+obj.hashCode());
    }
}
import java.lang.*;     //Default package in java

class Demo
{
    public void fun()
    {
        System.out.println("Fun without parameters");
    }
    public void fun(int i)
    {
        System.out.println("Fun with one parameters");
    }
    public void fun(int i,int j)
    {
        System.out.println("Fun with two parameters");
    }
     public void fun(double i)
    {
        System.out.println("Fun with one double as a parameters");
    }
}
class Overloading
{
    public static void main(String argv[])
    {
        Demo obj = new Demo();
        obj.fun();
        obj.fun(11);
        obj.fun(11,21);
        obj.fun(11.23);
    }
}

// How we can call one constructor from another contructor of inherited classes.

class Base
{
    public Base()
    {
        System.out.println("Inside Base class contructor.");
    }
}
class Derived extends Base
{
    public Derived()
    {
        super();
        System.out.println("Inside Derived class contructor.");
    }
}

class SuperKey
{
    public static void main(String A[])
    {
        Derived dobj = new Derived();
    }
}

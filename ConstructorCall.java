// How we can call onre constructor from another contructor of same class.

class Hello
{
    public Hello()
    {
        this(11);
        System.out.println("Inside Default contructor");
    }
    public Hello(int A)
    {
        System.out.println("Inside Parmetrised contructor");
    }
}

class ConstructorCall
{
    public static void main(String A[])
    {
        Hello hobj = new Hello();
    }
}
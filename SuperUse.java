// Use of super Keyword

interface Hello
{
    Hello(int A)
    {
        System.out.println("Inside Hello constructor");
    }
    
    void fun(); 
}

class Demo implements Hello
{
    super(11);
    Demo()
    {
        System.out.println("Inside Demo constructor");
    }
}


class SuperKey
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();
    }


}

class Base
{
    public void fun()
    {
        System.out.println("Base fun");
    }
    public void gun()
    {
        System.out.println("Base gun");
    }
    public void sun()
    {
        System.out.println("Base sun");
    }
}

class Derived extends Base
{
    public void fun()
    {
        System.out.println("Derived fun");
    }
    public void gun()
    {
        System.out.println("Derived gun");
    }
    public void run()
    {
        System.out.println("Derived run");
    }
}


class RMD
{
    public static void main(String argv[])
    {
        Base bobj = new Derived();      //upcasting  
        bobj.fun();     // Derived fun
        bobj.gun();     // Derived gun
        bobj.sun();     // Base sun
        //bobj.run();     //Error
    }
}

/*
        Base obj = new Base();              - No casting
        Derived obj = Derived Base();       - No casting
        Base obj = new Derived();           - Upcasting
        Derived obj = new Base();           - Downcasting
*/
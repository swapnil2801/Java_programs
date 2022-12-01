final class Base 
{
   
}

class Derived extends Base      // we can't inherit the final class 
{
  

}
class Final3
{
    public static void main(String a[])
    {
        Base obj = new Derived();
        
    }
}
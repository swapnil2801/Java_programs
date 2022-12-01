import java.util.*;

class AgeInvalideException extends Exception
{
    AgeInvalideException(String str)
    {
        super(str);
    }

}

class UserDefined
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter your age");
        int iAge = sobj.nextInt();

        try 
        {
            if(iAge < 15)
            {
                AgeInvalideException aobj = new AgeInvalideException("Your age is less than 15");
                throw aobj;
                //throw new AgeInvalideException("Your age is less than 15");
            }
            else
            {
                System.out.println("Age is valid");
            }
        }
        catch(AgeInvalideException obj)
        {
            System.out.println(obj);
        }
    }
}
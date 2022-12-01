import java.io.*;
    
class Equals
{
    public static void main(String A[])
    {
        try
        {
            InputStreamReader iobj = new InputStreamReader(System.in);
            BufferedReader bobj = new BufferedReader(iobj);

            System.out.println("Enter the first word : ");
            String var1 = bobj.readLine();

            System.out.println("Enter second word :");
            String var2 = bobj.readLine();

            if(var1.equals(var2))
            {
                System.out.println("Equal");
            }
            else 
            {
                System.out.println("Different");
            }
        }
        catch(Exception obj3)
        {
        }
        
    }

}
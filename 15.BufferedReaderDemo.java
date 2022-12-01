import java.io.*;

class BufferedReaderDemo
{
    public static void main(String A[])
    {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);

        int Age = 0;
        String name = null;
        float Marks = 0.0f;
        try
        {
            System.out.println("Enter your name:");
            name = bobj.readLine();

            System.out.println("Enter your age:");
            Age = Integer.parseInt(bobj.readLine());

            System.out.println("Enter your percentage:");
            Marks = Float.parseFloat(bobj.readLine());
        }
        catch(IOException obj)
        {
        }
        System.out.println("Name : "+name);
        System.out.println("Name : "+Age);
        System.out.println("Name : "+Marks);

    }
}
import java.io.*;

class CreateFile
{
    public static void main(String arg[]) throws Exception
    {
        File fobj = new File("Marvellous.txt");

        if(fobj.createNewFile())
        {
            System.out.println("File create succesfully");
        }
        else
        {
            System.out.println("Unable to create the file");
        }
    }
    
}
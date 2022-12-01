import java.net.*;
import java.io.*;

public class Server
{
    public static void main(String A[])
    {
        ServerSocket ss = new ServerSocket(2100);
        System.out.println("Server is waiting at port number 2100 ");

        Socket s = ss.accept();
        System.out.println("Request is accepted.");

        PrintStream ps = s.getInputStream();

        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        String str1 ,str2;

        while(!(str1 ))
    }
} 
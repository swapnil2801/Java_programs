// Write a program which accept number from user and print that number of $ and * on screen

// Input = 5
// Output =  $  *   $   *   $   *   $   *   $   *

// Input = 3
// Output =  $  *   $   *   $   *   

// Input = -3
// Output =  $  *   $   *   $   *  

import java.util.*;

class DisplayPattern
{
    public int iNo;

    public DisplayPattern(int A)
    {
        iNo = A;
    }
    public void Display()
    {
        int i = 0; 
        for(i = 1;i <= iNo;i++)
        {
            System.out.print("$\t*\t");
        }
    }

}

class Pattern1
{
    public static void main(String A[])
    {
        int iValue = 0;

        System.out.println("Enter number : ");
        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();

        DisplayPattern dobj = new DisplayPattern(iValue);

        dobj.Display();
    }
}
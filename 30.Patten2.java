// Write a program which accept number from user and print numbers till that number.

// Input = 8
// Output =  1  2   3   4   5   6   7   8 

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
            System.out.print(i+"\t");
        }
    }

}

class Pattern2
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
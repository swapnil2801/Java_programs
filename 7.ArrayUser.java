import java.util.Scanner;

class ArrayUser
{
    public static void main(String arg[])
    {
        int iCnt = 0;
        int iSum = 0;
        Scanner sobj = new Scanner(System.in); 

        System.out.println("Enter how many elements do you want to store in array:");
        int iSize = sobj.nextInt();
        int Arr[] = new int[iSize];

        System.out.println("Number of elements in array are :"+Arr.length);

        System.out.println("Enter the elements:");
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("The elements of array are:");
        for(iCnt=0;iCnt<iSize;iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }

        for(iCnt=0;iCnt<iSize;iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }
        System.out.println("The addition elments of Array is:"+iSum);

        
    }
}
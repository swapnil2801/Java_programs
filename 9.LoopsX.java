class Loops
{
    public static void main(String arg[])
    {
        int Arr[] = {10,20,30,40};
        int iCnt = 0;

        System.out.println("Traversel of array using for loop:");
        for (iCnt = 0; iCnt < Arr.length; iCnt++)   //same in c,c++,java
        {
            System.out.println(Arr[iCnt]);
        }

        System.out.println("Traversel of array using While loop:");
        iCnt = 0;
        while(iCnt < Arr.length)    //same in c,c++,java
        {
            System.out.println(Arr[iCnt]);
            iCnt++;
        }

        System.out.println("Traversel of array using do While loop:");
        iCnt = 0;
        do  //same in c,c++,java
        {
            System.out.println(Arr[iCnt]);
            iCnt++;
        }while(iCnt<Arr.length);
        
        System.out.println("Traversel of array using for-each loop:");
        for(int iNo : Arr)      //Only in java 
        {
            System.out.println(iNo);
        }

    }

}

class Demo implements Runnable
{
    public void run()
    {
        int iCnt = 0;
        for(iCnt = 1;iCnt <= 10;iCnt++)
        {
            System.out.println("Hello : "+Thread.currentThread().getName());
        }
    }
}


class Thread2
{
    public static void main (String A[])
    {
        System.out.println("Name of the thread is :"+Thread.currentThread().getName());

        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.setName("First");
        t2.setName("Second");

        t1.start();
        t2.start();
    }
}
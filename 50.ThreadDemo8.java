class Demo extends Thread 
{
    public void run()
    {
        int i = 0;
        for(i = 1; i <= 10;i++)
        {
            try
            {
                System.out.println(Thread.currentThread().getName()+" : "+i);
                Thread.sleep(500);
            }
            catch(InterruptedException obj)
            {}
        }
    }
}

class ThreadDemo8
{
    public static void main(String A[]) 
    {
        System.out.println("Inside main thread");
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.setName("first");
        t2.setName("Second");

        try
        {
            t1.start();
            t1.join();     // join the main thread to t1 thread        // Exception handling at main function line 

            t2.start();
            t2.join();     // join the main thread to t2 thread 
        }
        catch(InterruptedException obj)
        {}
        
        System.out.println("End of main thread");
    }
}
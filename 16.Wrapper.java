class Wrapper
{
    public static void main(String A[])
    {

        int No = 11;

        Integer iobj = new Integer(No);
        try 
        {
            System.out.println(No);
            System.out.println(iobj);
            int x = iobj;
            System.out.println(x);

        }
        catch(Exception obj)
        {}
    }
}

class Wrapper
{
    public static void main(String a[])
    {
        int no = 11;

        Integer iobj = new Integer(no);     //Boxing - converting primitive to wrapper
        System.out.println(no);
        System.out.println(iobj);

        int x = iobj;       //UnBoxing -wrapper converting  to primitive
        System.out.println(x);

    }
}
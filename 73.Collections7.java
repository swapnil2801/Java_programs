import java.util.*;


class Collections7
{
    public static void main(String A[])
    {
        Stack <Character>sobj = new Stack<Character>();

        sobj.push('a');
        sobj.push('b');
        sobj.push('c');
        sobj.push('d');
        sobj.push('e');

        System.out.println("Elements of stack : "+sobj);

        System.out.println("Poped Elements is : "+sobj.pop());
        System.out.println("Elements of stack : "+sobj);
    }
}
// Interface is a blueprint of class which contain all abtract functions
interface Circle
{
    float PI = 3.14f;       // public static final float PI = 3.14f;

    float Area(float Radius);   // public abtract float Area(float Radius);
    float Circumference(float Radius);  // public abtract float Circumference(float Radius);
}

class Marvellous implements Circle
{
    public float Area(float Radius)
    {
        return PI*Radius*Radius;
    }
    public float Circumference(float Radius)
    {
        return 2*PI*Radius;
    }
}

class InterfaceDemo
{
    public static void main(String Arr[])
    {
        System.out.println("Value of PI is :"+Circle.PI);
        //Circle.PI = 7.12f;        // to demontraste final    it gives error 
        Circle cobj = new Marvellous();
        float Ret = 0.0f;
        Ret = cobj.Area(10.5f);
        System.out.println("Area is :"+Ret);

        Ret = cobj.Circumference(10.5f);
        System.out.println("Circumference is :"+Ret);
    }
}
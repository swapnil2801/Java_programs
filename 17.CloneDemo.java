class Employee implements Cloneable
{
    public int Eid;
    public String Name;
    public int Salary;

    public Employee(int No,String str,int Value)
    {
        Eid = No;
        Name = str;
        Salary = Value;
    }
    public Object clone() throws CloneNotSupportedException 
    {
        return super.clone();
    }
}
class CloneDemo
{
    public static void main(String A[])
    {
        try
        {
            Employee eobj1 = new Employee(11,"Swapnil",5000);
            Employee eobj2 = (Employee)eobj1.clone();

            System.out.println("Employee name is : "+eobj1.Name);
            System.out.println("Employee name is : "+eobj2.Name);

            System.out.println("Employee salary is : "+eobj1.Salary);
            System.out.println("Employee salary is : "+eobj2.Salary);
            eobj2.Name = "Suraj";
            System.out.println("Employee name is : "+eobj2.Name);
            System.out.println("Employee name is : "+eobj1.Name);


        }
        catch(Exception obj)
        {

        }
    }
}
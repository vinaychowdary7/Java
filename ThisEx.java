class Student
{
    int roll;
    String name;
    int fee;
    Student(int roll,String name,int fee)
    {
        this.roll = roll;
        this.name= name;
        this.fee =fee;
    }
}
class A{
    public void m()
    {
        System.out.println("Inside Method M");
    }
    public void n()
    {
        this.m();
        System.out.println("Inside Method N");
    }
    
}

class B
{
    B()
    {
        System.out.println("Inside Default Constructure");
    }
    B(int x)
    {
        this();
        System.out.println("Inside Overloaded Constructure"+x);
    }
}
class C
{
    C(C obj)
    {
        System.out.println("Inside Overloaded Constructure");
    }
}
class S
{
    int x=10;
    public void m(S obj)
    {
        System.out.println("Inside Metho d M"+obj.x);
    }
    public void n()
    {
        m(this);
        System.out.println("Inside Method N");
    }

}

class D
{
    public D getD()
    {
        return this;
    }
    public void m()
    {
        System.out.println("Inside Method M");
   
    }
}
class ThisEx
{
    public static void main(String args[])
    {
        // Student raghu= new Student(1204,"Raghu",3500);
        // System.out.println("Roll NO :"+raghu.roll);
        // System.out.println("Name NO :"+raghu.name);
        // System.out.println("Roll NO :"+raghu.fee);

        //A obj = new A();
        //obj.n();

        //B obj = new B(20);

        C obj = new C();
       // obj.n();

        //new D().getD().m();

    }
}